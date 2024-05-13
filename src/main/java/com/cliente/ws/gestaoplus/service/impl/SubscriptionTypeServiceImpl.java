package com.cliente.ws.gestaoplus.service.impl;

import com.cliente.ws.gestaoplus.dto.SubscriptionTypeDTO;
import com.cliente.ws.gestaoplus.exception.BadRequestException;
import com.cliente.ws.gestaoplus.exception.NotFoundException;
import com.cliente.ws.gestaoplus.mapper.SubscriptionTypeMapper;
import com.cliente.ws.gestaoplus.model.SubscriptionType;
import com.cliente.ws.gestaoplus.repositories.SubscriptionTypeRepository;
import com.cliente.ws.gestaoplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    @Autowired
    private SubscriptionTypeRepository subscriptionTypeRepository;

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        return getSubscriptionType(id);
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDTO subscriptionTypeDTO) {
        if (Objects.nonNull(subscriptionTypeDTO.getId())){
            throw new BadRequestException("Id deve ser nulo");
        }
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(subscriptionTypeDTO));
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionTypeDTO subscriptionTypeDTO) {
        getSubscriptionType(id);
        subscriptionTypeDTO.setId(id);
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(subscriptionTypeDTO));
    }


    @Override
    public void delete(Long id) {
        getSubscriptionType(id);
        subscriptionTypeRepository.deleteById(id);
    }

    private SubscriptionType getSubscriptionType(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);
        if (optionalSubscriptionType.isEmpty()) {
            throw new NotFoundException("subscription não encontrado");
        }
        return optionalSubscriptionType.get();
    }
}
