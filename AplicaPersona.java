package Examen_Parcial;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class AplicaPersona {
    
    static ArregloPersona persona;
    static Scanner teclado = new Scanner (System.in);
    
    static int pos = 0; //G
    public static void main(String[] args) {
      Menu();
    }
     static void Menu(){
        int opcion;
        do {
            System.out.println("\n**********************************");
            System.out.println("         Menu de Opciones  ");
            System.out.println("**********************************");
            System.out.println("[1]       REGISTRAR AQUI");
            System.out.println("**********************************");
            System.out.println("[2] Ingresar Datos del Empleado");
            System.out.println("[3] Mostrar Datos del Empleado");
            System.out.println("[4] Borrar Registro");
            System.out.println("[5] Buscar a un Empleado");
            System.out.println("**********************************");
            System.out.println("[0] Salir");
            System.out.println("**********************************");

            System.out.print("Elija una Opción : ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    creaArreglo();
                    break;
                case 2:
                    System.out.println("Ingresar Codigo del Empleado(a) :");
                    String c=teclado.next();
                    System.out.println("Ingresar Nombre del Empleado(a) :");
                    String n=teclado.next();
                     System.out.println("Ingresar Horas Trabajadas :");
                    int h=teclado.nextInt();
                    System.out.println("Ingresar la Tarifa por Hora :");
                    double t=teclado.nextDouble();
                    persona.registrarMedio(pos,c, n, t, h);
                    pos++;
                    break;
                case 3:
                    persona.mostrar();
                    break;
                case 4:
                    persona.eliminar();
                    break;
                case 5:
                    System.out.println("Ingrese el codigo de empleado :");
                    String bus=teclado.next();
                    persona.buscar(bus);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese un Opción Correcta");
                    break;
            }
        }while(opcion != 0);
    }
    static void pedirDAtos(){
         String codigo = JOptionPane.showInputDialog( "Ingrese Codigo de Empleado");
      String nombre = JOptionPane.showInputDialog("Ingresar Nombre de Empleado");
      double tarifa = Double.parseDouble(JOptionPane.showInputDialog( "Ingresar la Tarifa por Hora"));
      int hora = Integer.parseInt(JOptionPane.showInputDialog( "Ingresar Horas Trabajadas"));
      persona.registrarMedio(pos, codigo, nombre, tarifa, hora);
      pos++;
    }
    
    static void creaArreglo(){
        int tam;
        System.out.println("Ingresar la Cantidad de Empleados ");
        System.out.println("a registar: ");
        tam = teclado.nextInt();
        persona = new ArregloPersona(tam);
        System.out.println();
    }
   
    
}
