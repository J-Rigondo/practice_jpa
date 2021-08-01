package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String zipcode;

    private String street;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;
}
