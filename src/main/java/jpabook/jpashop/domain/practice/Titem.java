package jpabook.jpashop.domain.practice;

import javax.persistence.*;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn
public class Titem {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int price;
}
