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
public class Consulta {

     private String motivo;
    private Mascota mascota;
    private Veterinario veterinario;
    private ArrayList<Medicamento> medicamentos;

    public Consulta(String motivo, Mascota mascota, Veterinario veterinario) {
        this.motivo = motivo;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    @Override
    public String toString() {
        return "Consulta: " + motivo + 
               " | Mascota: " + mascota + 
               " | Veterinario: " + veterinario;
    }
}
