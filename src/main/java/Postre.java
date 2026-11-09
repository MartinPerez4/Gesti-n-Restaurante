package PACKAGE_NAME;

public class Postre extends Producto{
    private double peso;
    private double temperaturaAlmacenamaiento;
    private boolean requiereRefrigeracion;

    public Postre(String codigo, String nombre, String descripcion, double precioBase, int tiempoPreparacion, double peso, double temperaturaAlmacenamaiento, boolean requiereRefrigeracion) {
        super(codigo, nombre, descripcion, precioBase, tiempoPreparacion);
        this.peso = peso;
        this.temperaturaAlmacenamaiento = temperaturaAlmacenamaiento;
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTemperaturaAlmacenamaiento() {
        return temperaturaAlmacenamaiento;
    }

    public void setTemperaturaAlmacenamaiento(double temperaturaAlmacenamaiento) {
        this.temperaturaAlmacenamaiento = temperaturaAlmacenamaiento;
    }

    public boolean getRequiereRefrigeracion() {
        return requiereRefrigeracion;
    }

    public void setRequiereRefrigeracion(boolean requiereRefrigeracion) {
        this.requiereRefrigeracion = requiereRefrigeracion;
    }
}
