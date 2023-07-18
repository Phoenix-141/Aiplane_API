package com.flyapi.flyauto.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_COMPANY")
public class Company implements Serializable {

     private static final long serialVersionUID = 1;

    @Id @Column(nullable = false, unique = true, length = 20)
    private String name_company;

    @Column(nullable = false)
    private int fleet;

    @Column(nullable = false)
    private int affected_cities;

    @ManyToOne
    @JoinColumn(name = "id_country_tag", nullable = false)
    private Countries nacionality;
}
