package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int identificacion;
     private String nombre;
     private String fechaIntegracio;
     private String referente;
     private int puntos;
     private String usuario;
     private String password;
     private Set facturas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int identificacion, String nombre, String fechaIntegracio, String referente, int puntos, String usuario, String password) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaIntegracio = fechaIntegracio;
        this.referente = referente;
        this.puntos = puntos;
        this.usuario = usuario;
        this.password = password;
    }
    public Cliente(int identificacion, String nombre, String fechaIntegracio, String referente, int puntos, String usuario, String password, Set facturas) {
       this.identificacion = identificacion;
       this.nombre = nombre;
       this.fechaIntegracio = fechaIntegracio;
       this.referente = referente;
       this.puntos = puntos;
       this.usuario = usuario;
       this.password = password;
       this.facturas = facturas;
    }
   
    public int getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaIntegracio() {
        return this.fechaIntegracio;
    }
    
    public void setFechaIntegracio(String fechaIntegracio) {
        this.fechaIntegracio = fechaIntegracio;
    }
    public String getReferente() {
        return this.referente;
    }
    
    public void setReferente(String referente) {
        this.referente = referente;
    }
    public int getPuntos() {
        return this.puntos;
    }
    
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}

