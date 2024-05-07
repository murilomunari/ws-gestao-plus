package com.cliente.ws.gestaoplus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscription_type")
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
