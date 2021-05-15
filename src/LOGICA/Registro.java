package LOGICA;

import java.io.Serializable;
/**
 * 
 * @author LESLIE MORALES
 */
public class Registro implements Serializable {

    private String nombre;
    private String apellido;
    private String codigo;
    private String carrera;
    private String sala;
    private String fecha;

//Constructor
    public Registro() {
    }
/**
 * 
 * @param nombre
 * @param apellido
 * @param codigo
 * @param carrera
 * @param sala
 * 
 
 */
    public Registro(String nombre, String apellido, String codigo, String carrera, String sala, String fecha) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.sala = sala;
        this.carrera = carrera;
        this.fecha = fecha;
    }
/**
 * 
 * @param nombre
 * @param apellido
 * @param codigo
 * @param carrera
 * @param sala 
 */
    public Registro(String nombre, String apellido, String codigo, String carrera, String sala) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.sala = sala;
        this.carrera = carrera;
    }
//SET AND GETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
