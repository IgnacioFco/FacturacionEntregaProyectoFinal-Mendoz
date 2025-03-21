package com.ProyectoConcJPASpring.ProyectoC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "AUTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Auto {

@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String marca; 

   private String modelo;

   private int anio;

   private double precio;

   @ToString.Exclude
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "CONCESIONARIO_ID")
   private Concesionario concesionario;

}
