
package Examen_Parcial;
import java.util.Scanner;

public class ArregloPersona {
    int frente, Final, codigo;
    int max;
    persona[] empleado;
    persona per = new persona();
    
    public ArregloPersona (int max){
        this.frente = 0; 
        this.Final = 0;
        this.max = max;
        this.empleado = new persona[this.max+1];
            for (int i = 0; i < this.max+1; i++){
                empleado[i] = new persona();
            }
    }
    public int getInicio(){
        return frente;
    }
    public boolean isColaLlena(){
        if(frente == max){
            return true;
        }else {
            return false;
        }
    }
    public boolean isColaVacia(){
        if(frente == Final){
            return true;
        }else {
            return false;
        }
    }
    
    public void registrarMedio(int pos,String cod,String nom, double tarifa, int hora){
        empleado[pos].registrar(cod, nom, tarifa, hora);
        frente++;
    }
    public void mostrar(){
        if (this.isColaVacia()){
            System.out.println("Sin registro aún");
        }else {
            System.out.print("Datos del Empleado");
            for(int i=0; i<frente; i++){
             empleado[i].mostarDatos();
            }
        }
    }
    public void eliminar() {
        if (this.isColaVacia()){
            System.out.println("Espacio Vacio");
        } else{
            frente--;
            System.out.println("Empleado eliminado...");
        }  
    }
    public void buscar(String buscar){
        if (isColaVacia()){
            System.out.println("Ingresar Datos del Empleado a buscar: ");
        } else{
            for(int i = 0; i<frente; i++){
                if (buscar.equals(empleado[i].getCodigo())){
                    empleado[i].mostarDatos();
                    break;
                }else System.out.println("Datos no existentes");
            }
        }
    }
    public void VaciarContenido(){
        frente = 0;
        Final = 0;
        System.out.println("Datos Borrados");
    }        
}
