package com.mycompany.controldeasistenciaescolar;

import javax.swing.JOptionPane;

public class ControlDeAsistenciaEscolar {

    public static void main(String[] args) {
        
        //Inicio Sesion
        String usuariDef[] = new String[5];
        usuariDef[0] = "admin";
        usuariDef[1] = "Ian";
        usuariDef[2] = "Fabian";
        usuariDef[3] = "Carlos";
        usuariDef[4] = "Raul";

        boolean acceso = false;

        for (int i = 0; i < 3; i++) {

            String usuario = JOptionPane.showInputDialog("Ingrese el usuario: ");
            int clavee = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la contraseña: "));
            int clave = 123;

            if (usuariDef[0].equalsIgnoreCase(usuario) && clave == clavee || usuariDef[1].equalsIgnoreCase(usuario) && clave == clavee || usuariDef[2].equalsIgnoreCase(usuario) && clave == clavee || usuariDef[3].equalsIgnoreCase(usuario) && clave == clavee || usuariDef[4].equalsIgnoreCase(usuario) && clave == clavee) {
                acceso = true;
                JOptionPane.showMessageDialog(null, "Bienvenida al Sistema de Control de Asistencia Escolar " + usuario);
                menuPrincipal();
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta tiene " + (2 - i) + " intentos restantes: ");
            }

        }

    }

    //Menu Principal
    public static void menuPrincipal() {
        String menuBtn[] = {"Módulo de registro o ingreso de información", "Módulo de procesamiento y despliegue de información", "Módulo visualización de resultados.",
            "Módulo de informes", "Salir."};
        int opcion = -1;
        while (opcion != 4) {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una de las opciones del menu principal.", "MENU PRINCIPAL",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menuBtn, menuBtn[0]);
            switch (opcion) {
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Has salido del sistema.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR: Opcion invalida, debe marcar un boton.");
            }
        }
    }

}
