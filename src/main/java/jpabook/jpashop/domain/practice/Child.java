package jpabook.jpashop.domain.practice;

import javax.persistence.*;


public class Child {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    @ManyToOne
    @JoinColumn
    private Parent parent;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
