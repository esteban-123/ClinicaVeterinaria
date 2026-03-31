/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaveterinaria.models;
import java.util.ArrayList;
/**
 *
 * @author marle
 */
public class Propietario {
     private String nombre;
    private String cedula;
    private ArrayList<Mascota> mascotas;

    public Propietario() {
        mascotas = new ArrayList<>();
    }

    public Propietario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    @Override
    public String toString() {
        return nombre + " - " + cedula;
    }
}
