package cl.model.pojos;
// Generated 19/09/2018 03:38:10 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Integer idFactura;
     private Cliente cliente;
     private ModoPago modoPago;
     private Date fechaCompra;
     private long numPago;
     private Set detalles = new HashSet(0);

    public Factura() {
    }

	
    public Factura(Cliente cliente, ModoPago modoPago, Date fechaCompra, long numPago) {
        this.cliente = cliente;
        this.modoPago = modoPago;
        this.fechaCompra = fechaCompra;
        this.numPago = numPago;
    }
    public Factura(Cliente cliente, ModoPago modoPago, Date fechaCompra, long numPago, Set detalles) {
       this.cliente = cliente;
       this.modoPago = modoPago;
       this.fechaCompra = fechaCompra;
       this.numPago = numPago;
       this.detalles = detalles;
    }
   
    public Integer getIdFactura() {
        return this.idFactura;
    }
    
    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ModoPago getModoPago() {
        return this.modoPago;
    }
    
    public void setModoPago(ModoPago modoPago) {
        this.modoPago = modoPago;
    }
    public Date getFechaCompra() {
        return this.fechaCompra;
    }
    
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public long getNumPago() {
        return this.numPago;
    }
    
    public void setNumPago(long numPago) {
        this.numPago = numPago;
    }
    public Set getDetalles() {
        return this.detalles;
    }
    
    public void setDetalles(Set detalles) {
        this.detalles = detalles;
    }




}


