package cl.utilesexpress.utilesexpress.ENT;

public class Unidad {
    private int idUnidad;
    private String descripcion;

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Unidad(String descripcion) {
        this.descripcion = descripcion;
    }

}
