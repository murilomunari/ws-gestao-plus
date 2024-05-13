package com.cliente.ws.gestaoplus.mapper;

import com.cliente.ws.gestaoplus.dto.SubscriptionTypeDTO;
import com.cliente.ws.gestaoplus.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDTO subscriptionTypeDTO){
        return SubscriptionType.builder()
                .id(subscriptionTypeDTO.getId())
                .name(subscriptionTypeDTO.getName())
                .accessMonths(subscriptionTypeDTO.getAccessMonths())
                .price(subscriptionTypeDTO.getPrice())
                .productKey(subscriptionTypeDTO.getProductKey())
                .build();

    }

}
