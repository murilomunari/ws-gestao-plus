package com.cliente.ws.gestaoplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscription_type")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;

    private String name;

    @Column(name = "access_months-")
    private Long accessMonth;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;
}
