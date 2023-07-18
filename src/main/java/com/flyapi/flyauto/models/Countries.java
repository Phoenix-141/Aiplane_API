package com.flyapi.flyauto.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_CONTRIES")
public class Countries implements Serializable {
    
    private static final long serialVersionUID = 1;

    @Id
    private String id_country_tag;

    @Column(nullable = false, unique = true)
    private String name_country;

    @Column(nullable = false)
    private int number_company;
}
