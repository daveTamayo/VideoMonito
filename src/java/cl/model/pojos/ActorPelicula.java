package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1



/**
 * ActorPelicula generated by hbm2java
 */
public class ActorPelicula  implements java.io.Serializable {


     private Integer idactorPelicula;
     private Actor actor;
     private Pelicula pelicula;

    public ActorPelicula() {
    }

    public ActorPelicula(Actor actor, Pelicula pelicula) {
       this.actor = actor;
       this.pelicula = pelicula;
    }
   
    public Integer getIdactorPelicula() {
        return this.idactorPelicula;
    }
    
    public void setIdactorPelicula(Integer idactorPelicula) {
        this.idactorPelicula = idactorPelicula;
    }
    public Actor getActor() {
        return this.actor;
    }
    
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Pelicula getPelicula() {
        return this.pelicula;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }




}

