package cl.utilesexpress.utilesexpress.ENT;

public class EstadoPago {

    private int idEstadoPago;
    private String descripcionEst;

    public int getIdEstadoPago() {
        return idEstadoPago;
    }

    public void setIdEstadoPago(int idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }

    public String getDescripcionEst() {
        return descripcionEst;
    }

    public void setDescripcionEst(String descripcionEst) {
        this.descripcionEst = descripcionEst;
    }

    public EstadoPago(String descripcionEst) {
        this.descripcionEst = descripcionEst;
    }
}
