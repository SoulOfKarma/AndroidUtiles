package cl.utilesexpress.utilesexpress.ENT;

public class VistaProducto {

    private int idProVista;
    private int idVista;
    private int idPro;

    public int getIdProVista() {
        return idProVista;
    }

    public void setIdProVista(int idProVista) {
        this.idProVista = idProVista;
    }

    public int getIdVista() {
        return idVista;
    }

    public void setIdVista(int idVista) {
        this.idVista = idVista;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public VistaProducto(int idVista, int idPro) {
        this.idVista = idVista;
        this.idPro = idPro;
    }
}
