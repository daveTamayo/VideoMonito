package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1



/**
 * Detalle generated by hbm2java
 */
public class Detalle  implements java.io.Serializable {


     private Integer idDetalle;
     private Factura factura;
     private Pelicula pelicula;

    public Detalle() {
    }

    public Detalle(Factura factura, Pelicula pelicula) {
       this.factura = factura;
       this.pelicula = pelicula;
    }
   
    public Integer getIdDetalle() {
        return this.idDetalle;
    }
    
    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Pelicula getPelicula() {
        return this.pelicula;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }




}


