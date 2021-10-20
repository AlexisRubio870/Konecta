package Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Solicitud {
    
    int id_solicitud;
    int codigo_Solicitud;
    String descripcion_Solicitud;
    String resumen_Solicitud;
    
    @ManyToOne
    @JoinColumn(name = "id_empleado")
    Empleado empleado;
    
    public Solicitud (){
    }

    public Solicitud(int id_solicitud, int codigo_Solicitud, String descripcion_Solicitud, String resumen_Solicitud, Empleado empleado) {
        this.id_solicitud = id_solicitud;
        this.codigo_Solicitud = codigo_Solicitud;
        this.descripcion_Solicitud = descripcion_Solicitud;
        this.resumen_Solicitud = resumen_Solicitud;
        this.empleado = empleado;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public int getCodigo_Solicitud() {
        return codigo_Solicitud;
    }

    public void setCodigo_Solicitud(int codigo_Solicitud) {
        this.codigo_Solicitud = codigo_Solicitud;
    }

    public String getDescripcion_Solicitud() {
        return descripcion_Solicitud;
    }

    public void setDescripcion_Solicitud(String descripcion_Solicitud) {
        this.descripcion_Solicitud = descripcion_Solicitud;
    }

    public String getResumen_Solicitud() {
        return resumen_Solicitud;
    }

    public void setResumenSolicitud(String resumen_Solicitud) {
        this.resumen_Solicitud = resumen_Solicitud;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}
