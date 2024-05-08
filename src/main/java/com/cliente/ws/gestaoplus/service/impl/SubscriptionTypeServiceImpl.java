package com.cliente.ws.gestaoplus.service.impl;

import com.cliente.ws.gestaoplus.model.SubscriptionType;
import com.cliente.ws.gestaoplus.repositories.SubscriptionTypeRepository;
import com.cliente.ws.gestaoplus.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    @Autowired
    SubscriptionTypeRepository subscriptionTypeRepository;

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        return null;
    }

    @Override
    public SubscriptionType create(SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
