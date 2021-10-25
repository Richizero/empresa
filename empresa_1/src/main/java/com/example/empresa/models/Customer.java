package com.example.empresa.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
    @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_id_seq", allocationSize = 1)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name", columnDefinition = "varchar(40)", nullable = true)
    private String name;

    @Column(name = "email", columnDefinition = "varchar(40)", nullable = false, unique = true)
    private String email;

    @Column(name = "phone_number", columnDefinition = "varchar(20)")
    private String phoneNumber;

    public Integer getCustomerId() {
        return customerId;

    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
