package PACKAGE_NAME;

public class Bebida extends Producto {
    private double volumen;
    private double temperaturaServicio;
    private TipoBebida tipoBebida;

    public Bebida(String codigo, String nombre, String descripcion, double precioBase, int tiempoPreparacion, double volumen, double temperaturaServicio, TipoBebida tipoBebida) {
        super(codigo, nombre, descripcion, precioBase, tiempoPreparacion);
        this.volumen = volumen;
        this.temperaturaServicio = temperaturaServicio;
        this.tipoBebida = tipoBebida;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getTemperaturaServicio() {
        return temperaturaServicio;
    }

    public void setTemperaturaServicio(double temperaturaServicio) {
        this.temperaturaServicio = temperaturaServicio;
    }

    public TipoBebida getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }
}
