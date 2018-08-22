package cl.utilesexpress.utilesexpress.ENT;

public class Producto {
    private int idPro;
    private String nombreAcortadoPro;
    private String nombrePro;
    private String codePro;
    private String descripcionPro;
    private String offertxt;
    private String imagen;
    private String link;
    private boolean existe;
    private float precio;
    private int idCategoria;
    private int idUnidad;

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public String getNombreAcortadoPro() {
        return nombreAcortadoPro;
    }

    public void setNombreAcortadoPro(String nombreAcortadoPro) {
        this.nombreAcortadoPro = nombreAcortadoPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getCodePro() {
        return codePro;
    }

    public void setCodePro(String codePro) {
        this.codePro = codePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getOffertxt() {
        return offertxt;
    }

    public void setOffertxt(String offertxt) {
        this.offertxt = offertxt;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Producto(String nombreAcortadoPro, String nombrePro, String codePro, String descripcionPro, String offertxt, String imagen, String link, boolean existe, float precio) {
        this.nombreAcortadoPro = nombreAcortadoPro;
        this.nombrePro = nombrePro;
        this.codePro = codePro;
        this.descripcionPro = descripcionPro;
        this.offertxt = offertxt;
        this.imagen = imagen;
        this.link = link;
        this.existe = existe;
        this.precio = precio;
    }
}
