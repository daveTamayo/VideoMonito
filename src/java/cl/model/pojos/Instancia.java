package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Instancia generated by hbm2java
 */
public class Instancia  implements java.io.Serializable {


     private int isanInstancia;
     private String nombInstancia;
     private String titulo;
     private String temporada;
     private Set peliculas = new HashSet(0);

    public Instancia() {
    }

	
    public Instancia(int isanInstancia, String nombInstancia, String titulo, String temporada) {
        this.isanInstancia = isanInstancia;
        this.nombInstancia = nombInstancia;
        this.titulo = titulo;
        this.temporada = temporada;
    }
    public Instancia(int isanInstancia, String nombInstancia, String titulo, String temporada, Set peliculas) {
       this.isanInstancia = isanInstancia;
       this.nombInstancia = nombInstancia;
       this.titulo = titulo;
       this.temporada = temporada;
       this.peliculas = peliculas;
    }
   
    public int getIsanInstancia() {
        return this.isanInstancia;
    }
    
    public void setIsanInstancia(int isanInstancia) {
        this.isanInstancia = isanInstancia;
    }
    public String getNombInstancia() {
        return this.nombInstancia;
    }
    
    public void setNombInstancia(String nombInstancia) {
        this.nombInstancia = nombInstancia;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTemporada() {
        return this.temporada;
    }
    
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    public Set getPeliculas() {
        return this.peliculas;
    }
    
    public void setPeliculas(Set peliculas) {
        this.peliculas = peliculas;
    }




}


