package com.cliente.ws.gestaoplus.service;

import com.cliente.ws.gestaoplus.dto.UserDTO;
import com.cliente.ws.gestaoplus.model.User;

public interface UserService {

    User create(UserDTO userDTO);
}
