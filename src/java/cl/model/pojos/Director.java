package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Director generated by hbm2java
 */
public class Director  implements java.io.Serializable {


     private int idDirector;
     private String nombre;
     private String fechaNacimiento;
     private Set directorPeliculas = new HashSet(0);

    public Director() {
    }

	
    public Director(int idDirector, String nombre, String fechaNacimiento) {
        this.idDirector = idDirector;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Director(int idDirector, String nombre, String fechaNacimiento, Set directorPeliculas) {
       this.idDirector = idDirector;
       this.nombre = nombre;
       this.fechaNacimiento = fechaNacimiento;
       this.directorPeliculas = directorPeliculas;
    }
   
    public int getIdDirector() {
        return this.idDirector;
    }
    
    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Set getDirectorPeliculas() {
        return this.directorPeliculas;
    }
    
    public void setDirectorPeliculas(Set directorPeliculas) {
        this.directorPeliculas = directorPeliculas;
    }




}


