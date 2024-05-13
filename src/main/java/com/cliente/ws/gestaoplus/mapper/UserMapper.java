package com.cliente.ws.gestaoplus.mapper;

import com.cliente.ws.gestaoplus.dto.UserDTO;
import com.cliente.ws.gestaoplus.model.SubscriptionType;
import com.cliente.ws.gestaoplus.model.User;
import com.cliente.ws.gestaoplus.model.UserType;

public class UserMapper {

    public static User fromDtoToEntity(UserDTO userDTO, UserType userType, SubscriptionType subscriptionType) {
        return User.builder()
                .id(userDTO.getId())
                .name(userDTO.getName())
                .cpf(userDTO.getCpf())
                .email(userDTO.getEmail())
                .phone(userDTO.getPhone())
                .dtSubscription(userDTO.getDtSubscription())
                .dtExpiration(userDTO.getDtExpiration())
                .userType(userType)
                .subscriptionType(subscriptionType)
                .build();
    }
}

