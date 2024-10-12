/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facade;

/**
 *
 * @author PC
 */
public class PartidoFacade {
    private Entrenamiento entrenamiento;
    private Logistica logistica;
    private Estrategia estrategia;

    public PartidoFacade() {
        entrenamiento = new Entrenamiento();
        logistica = new Logistica();
        estrategia = new Estrategia();
    }

    // Método de alto nivel que encapsula la preparación de un partido
    public void prepararPartido() {
        System.out.println("Iniciando la preparación del partido...");

        // Llamadas a los subsistemas
        entrenamiento.prepararEjercicios();
        entrenamiento.asignarEntrenamientosTecnicos();
        logistica.organizarTransporte();
        logistica.gestionarEquipamiento();
        estrategia.analizarEquipoRival();
        estrategia.definirFormacion();

        System.out.println("El equipo está listo para el partido.");
    }
}
