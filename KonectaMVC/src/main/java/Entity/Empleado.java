package Entity;

import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Empleado {
    int id_empleado;
    
    @Temporal(TemporalType.DATE)
    private Calendar fecha_Ingreso_Empleado;
    
    String nombre_Empleado;
    
    int salario;
    
    public Empleado(){
    }

    public Empleado(int id_empleado, Calendar fecha_Ingreso_Empleado, String nombre_Empleado, int salario) {
        this.id_empleado = id_empleado;
        this.fecha_Ingreso_Empleado = fecha_Ingreso_Empleado;
        this.nombre_Empleado = nombre_Empleado;
        this.salario = salario;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Calendar getFecha_Ingreso_Empleado() {
        return fecha_Ingreso_Empleado;
    }

    public void setFecha_Ingreso_Empleado(Calendar fecha_Ingreso_Empleado) {
        this.fecha_Ingreso_Empleado = fecha_Ingreso_Empleado;
    }

    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    
    
}
