/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.models;

/**
 *
 * @author marle
 */
public class Veterinario {
     private String nombre;
    private String especialidad;

    public Veterinario() {
    }

    public Veterinario(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // DEPENDENCIA (usa Medicamento sin guardarlo)
    public void recetar(Medicamento m) {
        System.out.println(nombre + " receta: " + m);
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}
