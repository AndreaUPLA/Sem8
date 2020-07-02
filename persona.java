
package Examen_Parcial;

/**
 *
 * @author ANDREA
 */
public class persona {
    private String codigo, nombre;
    private double sueldo, tarifa, sueldo_mensual;
    private int hora;
    //OBTENER
    public String getCodigo(){
        return codigo;
    }
        public void setCodigo(String codigo){
         this.codigo = codigo;
    }
    public String getNombre(){
        return nombre;
    }
        public void setNombre(String nombre){
         this.nombre = nombre;
    }
    public double getTarifa(){
        return tarifa;
    }
        public void setTarifa(double tarifa){
         this.tarifa= tarifa;
        }
    public int getHora(){
        return hora;
    }
        public void setHora(int hora){
         this.hora = hora;
    }
    public double getSueldo(){
        return sueldo;
    }
        public void setSueldo(double sueldo){
         this.sueldo = sueldo;
    }
    //OPERAR    
    public void registrar (String cod, String nom, double t, int h){
        this.codigo= cod;
        this.nombre=nom;
        this.tarifa=t;
        this.hora=h;
    }
    public double hallarSueldoDiario(){
        sueldo= this.hora * this.tarifa;
        return sueldo;
    }
    public double sueldoMensual(){
        sueldo_mensual=(sueldo*6) * 4;
        return sueldo_mensual;
    }    
    public void mostarSueldo(){
        System.out.println("Su Sueldo Diario es: "+hallarSueldoDiario());
    }
    public void mostarDatos(){
        System.out.println("\nCodigo = " +codigo);
        System.out.println("Nombre = " +nombre);
        System.out.println("Hora = " +hora);
        System.out.println("Tarifa = " +tarifa);
        System.out.println("Sueldo Diario = " +hallarSueldoDiario());
        System.out.println("Sueldo Mensual = " +sueldoMensual());
    }
}