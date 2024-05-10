package com.cliente.ws.gestaoplus.service.impl;

import com.cliente.ws.gestaoplus.dto.SubscriptionTypeDTO;
import com.cliente.ws.gestaoplus.exception.BadRequestException;
import com.cliente.ws.gestaoplus.exception.NotFoundException;
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
    SubscriptionTypeRepository subscriptionTypeRepository;

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
        return subscriptionTypeRepository.save(SubscriptionType.builder()
                        .id(subscriptionTypeDTO.getId())
                        .name(subscriptionTypeDTO.getName())
                        .accessMonth(subscriptionTypeDTO.getAccessMonths())
                        .price(subscriptionTypeDTO.getPrice())
                        .productKey(subscriptionTypeDTO.getProductKey())
                .build());
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionTypeDTO subscriptionTypeDTO) {
        SubscriptionType existingSubscriptionType = getSubscriptionType(id);

        existingSubscriptionType.setName(subscriptionTypeDTO.getName());
        existingSubscriptionType.setAccessMonth(subscriptionTypeDTO.getAccessMonths());
        existingSubscriptionType.setPrice(subscriptionTypeDTO.getPrice());
        existingSubscriptionType.setProductKey(subscriptionTypeDTO.getProductKey());

        return subscriptionTypeRepository.save(existingSubscriptionType);
    }


    @Override
    public void delete(Long id) {

    }

    private SubscriptionType getSubscriptionType(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);
        if (optionalSubscriptionType.isEmpty()) {
            throw new NotFoundException("subscription não encontrado");
        }
        return optionalSubscriptionType.get();
    }
}
