/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaveterinaria;

import com.mycompany.clinicaveterinaria.models.*;
import java.util.ArrayList;

 
public class Clinicaveterinaria {

    public static void main(String[] args) {
       
        Propietario p1 = new Propietario("Carlos Perez", "555");
        Propietario p2 = new Propietario("Maria Lopez", "999");

        // 🔹 Crear mascotas
        Mascota m1 = new Mascota("Labrador", "Lupita", 5, "Perro");
        Mascota m2 = new Mascota("Siames", "Michi", 3, "Gato");
        Mascota m3 = new Mascota("Bulldog", "Arturo", 4, "Perro");

       
        p1.agregarMascota(m1);
        p1.agregarMascota(m2);
        p2.agregarMascota(m3);

        // Crear veterinarios
        Veterinario v1 = new Veterinario("Dr. Ernesto", "Cirugia");
        Veterinario v2 = new Veterinario("Dra. Fabio", "Dermatologia");

  
        Consulta c1 = new Consulta("Dolor estomacal", m1, v1);
        Consulta c2 = new Consulta("Alergia en la piel", m2, v2);

        
        Medicamento med1 = new Medicamento("Antibiotico", "2 veces al dia");
        Medicamento med2 = new Medicamento("Antialergico", "1 vez al dia");

        // Agregar medicamentos a consultas (COMPOSICIÓN)
        c1.agregarMedicamento(med1);
        c2.agregarMedicamento(med2);

        // Veterinario receta (DEPENDENCIA)
        v1.recetar(med1);
        v2.recetar(med2);

        // 🔹 LISTAS (requisito del taller)
        ArrayList<Propietario> propietarios = new ArrayList<>();
        propietarios.add(p1);
        propietarios.add(p2);

        ArrayList<Consulta> consultas = new ArrayList<>();
        consultas.add(c1);
        consultas.add(c2);

        // 🔹 MOSTRAR INFORMACIÓN

        System.out.println("PROPIETARIOS Y MASCOTAS ");
        for (Propietario p : propietarios) {
            System.out.println(p);
            for (Mascota m : p.getMascotas()) {
                System.out.println("  - " + m);
            }
        }

        System.out.println("\n===== CONSULTAS =====");
        for (Consulta c : consultas) {
            System.out.println(c);
            for (Medicamento m : c.getMedicamentos()) {
                System.out.println("   * Medicamento: " + m);
            }
        }
        
    }
}
