package cl.utilesexpress.utilesexpress.ENT;

public class Pago {

    private int idPago;
    private String codigo;
    private int idUsuario;
    private int idPro;
    private int idEstadoPag;
    private String fechaPago;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public int getIdEstadoPag() {
        return idEstadoPag;
    }

    public void setIdEstadoPag(int idEstadoPag) {
        this.idEstadoPag = idEstadoPag;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Pago(String codigo, int idUsuario, int idPro, int idEstadoPag) {
        this.codigo = codigo;
        this.idUsuario = idUsuario;
        this.idPro = idPro;
        this.idEstadoPag = idEstadoPag;
    }
}
