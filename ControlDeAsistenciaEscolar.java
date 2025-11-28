package com.mycompany.controldeasistenciaescolar;

// Usuarios: admin Ian Fabian Carlos Raul
//Contrasena: 123
import javax.swing.JOptionPane;

public class ControlDeAsistenciaEscolar {

    static RegistroDeEstudiantes estudiantes[] = new RegistroDeEstudiantes[40];
    static int contadorEstudiantes = 0;

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
        String menuBtn[] = {"Registro de estudiantes", "Módulo de procesamiento y despliegue de información", "Módulo visualización de resultados.",
            "Módulo de informes", "Salir."};
        int opcion = -1;
        while (opcion != 4) {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una de las opciones del menu principal.", "MENU PRINCIPAL",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menuBtn, menuBtn[0]);
            switch (opcion) {
                case 0:
                    registrarEstudiante();
                    break;
                case 1:
                    MarcadodeAsistencia.marcarAsistencia(
                            estudiantes,
                            contadorEstudiantes,
                            totalClasesPorEstudiante,
                            asistenciasPorEstudiante
                    );
                case 2:
                    JOptionPane.showMessageDialog(null, "Modulo 3 aun no esta implementado.");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Modulo 4 aun no esta implementado.");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Has salido del sistema.");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "ERROR: Opcion invalida, debe marcar un boton.");
            }
        }
    }

    public static void registrarEstudiante() {

        if (contadorEstudiantes >= estudiantes.length) {
            JOptionPane.showMessageDialog(null, "No hay espacio para más estudiantes.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Registro de un nuevo estudiante");

        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del estudiante:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        int grado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grado:"));
        String seccion = JOptionPane.showInputDialog("Ingrese la sección:");

        estudiantes[contadorEstudiantes] = new RegistroDeEstudiantes(cedula, nombre, apellido, grado, seccion);
        contadorEstudiantes++;
        JOptionPane.showMessageDialog(null, "Estudiante registrado correctamente.");
    }

}
