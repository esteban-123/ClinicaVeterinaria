/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.models;

/**
 *
 * @author marle
 */
public class Medicamento {
     private String nombre;
    private String dosis;

    public Medicamento() {
    }

    public Medicamento(String nombre, String dosis) {
        this.nombre = nombre;
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return nombre + " (" + dosis + ")";
    }
}
