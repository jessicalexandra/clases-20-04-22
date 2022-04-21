package co.edu.cesde;

public class Monitor extends Producto {
    private String screensize;
    private Double resolucion;


    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }
}
