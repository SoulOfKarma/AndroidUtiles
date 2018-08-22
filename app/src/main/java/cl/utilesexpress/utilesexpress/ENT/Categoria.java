package cl.utilesexpress.utilesexpress.ENT;

public class Categoria {

    private int idCategoria;
    private String nombreCat;
    private String nombreCarCorto;
    private boolean activoCat;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public String getNombreCarCorto() {
        return nombreCarCorto;
    }

    public void setNombreCarCorto(String nombreCarCorto) {
        this.nombreCarCorto = nombreCarCorto;
    }

    public boolean isActivoCat() {
        return activoCat;
    }

    public void setActivoCat(boolean activoCat) {
        this.activoCat = activoCat;
    }

    public Categoria(String nombreCat, String nombreCarCorto, boolean activoCat) {
        this.nombreCat = nombreCat;
        this.nombreCarCorto = nombreCarCorto;
        this.activoCat = activoCat;
    }
}
