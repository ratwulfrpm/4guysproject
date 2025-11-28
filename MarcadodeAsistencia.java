/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controldeasistenciaescolar;

import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class MarcadodeAsistencia {

    public static void marcarAsistencia(
            RegistroDeEstudiantes[] estudiantes,
            int contadorEstudiantes,
            int[] totalClasesPorEstudiante,
            int[] asistenciasPorEstudiante
    ) {

        if (contadorEstudiantes == 0) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados. Registrenlos primero.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Iniciando marcado de asistencia para el grupo...");

        for (int i = 0; i < contadorEstudiantes; i++) {

            RegistroDeEstudiantes est = estudiantes[i];

            String input = JOptionPane.showInputDialog(
                    "Asistio el estudiante?\n"
                    + "Cedula: " + est.getCedula() + "\n"
                    + "Nombre: " + est.getNombre() + " " + est.getApellido() + "\n\n"
                    + "Digite 1 = Si\nDigite 2 = No"
            );

            int opcion = 0;

            try {
                opcion = Integer.parseInt(input);
            } catch (Exception e) {
                opcion = 0;
            }

            while (opcion != 1 && opcion != 2) {
                input = JOptionPane.showInputDialog(
                        "Entrada invalida.\n"
                        + "Asistio el estudiante?\n"
                        + "Cedula: " + est.getCedula() + "\n"
                        + "Nombre: " + est.getNombre() + " " + est.getApellido() + "\n\n"
                        + "Digite 1 = Si\nDigite 2 = No"
                );

                try {
                    opcion = Integer.parseInt(input);
                } catch (Exception e) {
                    opcion = 0;
                }
            }

            totalClasesPorEstudiante[i]++;

            if (opcion == 1) {
                asistenciasPorEstudiante[i]++;
            }
        }

        JOptionPane.showMessageDialog(null, "Marcado de asistencia completado para esta sesion.");
    }
}
