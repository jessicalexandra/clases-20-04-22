package co.edu.cesde;

public class Producto {

    private  String name;
    private  String brand;
    private String referencia;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", referencia='" + referencia + '\'';
    }
}
