/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.facade;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        // Crear la fachada del partido
        PartidoFacade partidoFacade = new PartidoFacade();

        // Preparar el partido usando la interfaz simplificada
        partidoFacade.prepararPartido();
    }
}
