package com.cliente.ws.gestaoplus.service;

import com.cliente.ws.gestaoplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

     SubscriptionType findById(Long id);

     SubscriptionType create(SubscriptionType subscriptionType);

     SubscriptionType update(Long id, SubscriptionType subscriptionType);

     void delete(Long id);
}
