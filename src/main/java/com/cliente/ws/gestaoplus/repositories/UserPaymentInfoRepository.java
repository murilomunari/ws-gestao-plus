package com.cliente.ws.gestaoplus.repositories;

import com.cliente.ws.gestaoplus.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
