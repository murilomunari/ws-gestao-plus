package com.cliente.ws.gestaoplus.service.impl;

import com.cliente.ws.gestaoplus.dto.SubscriptionTypeDTO;
import com.cliente.ws.gestaoplus.exception.NotFoundException;
import com.cliente.ws.gestaoplus.model.SubscriptionType;
import com.cliente.ws.gestaoplus.repositories.SubscriptionTypeRepository;
import com.cliente.ws.gestaoplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    @Autowired
    SubscriptionTypeRepository subscriptionTypeRepository;

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);
        if (optionalSubscriptionType.isEmpty()) {
            throw new NotFoundException("subscription não encontrado");
        }
        return optionalSubscriptionType.get();
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDTO subscriptionTypeDTO) {
        return subscriptionTypeRepository.save(SubscriptionType.);
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
