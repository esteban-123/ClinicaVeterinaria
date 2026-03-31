/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.models;

/**
 *
 * @author marle
 */
public class Mascota extends Animal {
private String raza;

    public Mascota() {
    }

    public Mascota(String raza, String nombre, int edad, String especie) {
        super(nombre, edad, especie);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + " - Raza: " + raza;
    }
    
}
