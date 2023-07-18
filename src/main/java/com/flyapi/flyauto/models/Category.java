package com.flyapi.flyauto.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // Se não especificado o nome, o defult será a classe
@Table(name = "TB_MILITARY")
public class Category implements Serializable {

    private static final long serialVersionUID = 1;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_category_uuid;

    @Column(nullable = false, unique = true)
    private String name_category;

    @Column(nullable = false)
    private String carcteristic;

    @Column(nullable = false)
    private boolean is_supersonic;
    

}
