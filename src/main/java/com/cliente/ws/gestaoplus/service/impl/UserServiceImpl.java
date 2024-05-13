package com.cliente.ws.gestaoplus.service.impl;

import com.cliente.ws.gestaoplus.dto.UserDTO;
import com.cliente.ws.gestaoplus.exception.BadRequestException;
import com.cliente.ws.gestaoplus.exception.NotFoundException;
import com.cliente.ws.gestaoplus.mapper.UserMapper;
import com.cliente.ws.gestaoplus.model.User;
import com.cliente.ws.gestaoplus.model.UserType;
import com.cliente.ws.gestaoplus.repositories.UserRepository;
import com.cliente.ws.gestaoplus.repositories.UserTypeRepository;
import com.cliente.ws.gestaoplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public User create(UserDTO userDTO) {

        if (Objects.nonNull(userDTO.getId())) {
            throw new BadRequestException("Id deve ser nulo");
        }

        var userTypeOpt = userTypeRepository.findById(userDTO.getUserTypeId());

        if (userTypeOpt.isEmpty()){
            throw new NotFoundException("userTypeId não encontrado");
        }

        UserType userType= userTypeOpt.get();
        User user = UserMapper.fromDtoToEntity(userDTO,userType, null);
        return userRepository.save(user);
    }
}
