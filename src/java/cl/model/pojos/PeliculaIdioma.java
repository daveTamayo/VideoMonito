package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1



/**
 * PeliculaIdioma generated by hbm2java
 */
public class PeliculaIdioma  implements java.io.Serializable {


     private Integer idpeliculaIdioma;
     private Idioma idioma;
     private Pelicula pelicula;

    public PeliculaIdioma() {
    }

    public PeliculaIdioma(Idioma idioma, Pelicula pelicula) {
       this.idioma = idioma;
       this.pelicula = pelicula;
    }
   
    public Integer getIdpeliculaIdioma() {
        return this.idpeliculaIdioma;
    }
    
    public void setIdpeliculaIdioma(Integer idpeliculaIdioma) {
        this.idpeliculaIdioma = idpeliculaIdioma;
    }
    public Idioma getIdioma() {
        return this.idioma;
    }
    
    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
    public Pelicula getPelicula() {
        return this.pelicula;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }




}


