package com.flyapi.flyauto.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_AIRPLANES")
public class Aiplanes implements Serializable {

    private static final long serialVersionUID = 1;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_airplane_uuid;

    @Column(nullable = false)
    private int velocity;

    @Column(nullable = false)
    private String capacity;

    @ManyToOne
    @JoinColumn(name = "name_company", nullable = false)
    private Company company;

    @Column(nullable = false)
    private String model; 

    @ManyToOne
    @JoinColumn(name = "id_category_uuid", nullable = false)
    private Category category;

}
