package com.cliente.ws.gestaoplus.service;

import com.cliente.ws.gestaoplus.dto.SubscriptionTypeDTO;
import com.cliente.ws.gestaoplus.model.SubscriptionType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

     SubscriptionType findById(Long id);

     SubscriptionType create(SubscriptionTypeDTO subscriptionTypeDTO);

     SubscriptionType update(Long id, SubscriptionTypeDTO subscriptionTypeDTO);

     void delete(Long id);
}
