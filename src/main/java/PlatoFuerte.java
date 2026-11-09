package PACKAGE_NAME;

public class PlatoFuerte extends Producto{
    private double peso;
    private double tiempoCoccion;
    private TipoPreparacion tipoPreparacion;

    public PlatoFuerte(String codigo, String nombre, String descripcion, double precioBase, int tiempoPreparacion, double peso, double tiempoCoccion, TipoPreparacion tipoPreparacion) {
        super(codigo, nombre, descripcion, precioBase, tiempoPreparacion);
        this.peso = peso;
        this.tiempoCoccion = tiempoCoccion;
        this.tipoPreparacion = tipoPreparacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(double tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public TipoPreparacion getTipoPreparacion() {
        return tipoPreparacion;
    }

    public void setTipoPreparacion(TipoPreparacion tipoPreparacion) {
        this.tipoPreparacion = tipoPreparacion;
    }
}
