package cl.utilesexpress.utilesexpress.ENT;

public class Imagenes {

    private int idSlide;
    private String tituloSlide;
    private String imagenSlide;
    private int posicion;

    public int getIdSlide() {
        return idSlide;
    }

    public void setIdSlide(int idSlide) {
        this.idSlide = idSlide;
    }

    public String getTituloSlide() {
        return tituloSlide;
    }

    public void setTituloSlide(String tituloSlide) {
        this.tituloSlide = tituloSlide;
    }

    public String getImagenSlide() {
        return imagenSlide;
    }

    public void setImagenSlide(String imagenSlide) {
        this.imagenSlide = imagenSlide;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Imagenes(String tituloSlide, String imagenSlide, int posicion) {
        this.tituloSlide = tituloSlide;
        this.imagenSlide = imagenSlide;
        this.posicion = posicion;
    }
}
