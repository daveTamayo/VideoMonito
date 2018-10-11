package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clasificacion generated by hbm2java
 */
public class Clasificacion  implements java.io.Serializable {


     private Integer idClasificacion;
     private String nombreClasif;
     private String descripcion;
     private Set peliculas = new HashSet(0);

    public Clasificacion() {
    }

	
    public Clasificacion(String nombreClasif, String descripcion) {
        this.nombreClasif = nombreClasif;
        this.descripcion = descripcion;
    }
    public Clasificacion(String nombreClasif, String descripcion, Set peliculas) {
       this.nombreClasif = nombreClasif;
       this.descripcion = descripcion;
       this.peliculas = peliculas;
    }
   
    public Integer getIdClasificacion() {
        return this.idClasificacion;
    }
    
    public void setIdClasificacion(Integer idClasificacion) {
        this.idClasificacion = idClasificacion;
    }
    public String getNombreClasif() {
        return this.nombreClasif;
    }
    
    public void setNombreClasif(String nombreClasif) {
        this.nombreClasif = nombreClasif;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getPeliculas() {
        return this.peliculas;
    }
    
    public void setPeliculas(Set peliculas) {
        this.peliculas = peliculas;
    }




}


