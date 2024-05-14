package com.cliente.ws.gestaoplus.service.impl;

import com.cliente.ws.gestaoplus.model.UserType;
import com.cliente.ws.gestaoplus.repositories.UserTypeRepository;
import com.cliente.ws.gestaoplus.service.UserTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    private final UserTypeRepository userTypeRepository;

    UserTypeServiceImpl(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public List<UserType> findAll() {
        return userTypeRepository.findAll();
    }
}
