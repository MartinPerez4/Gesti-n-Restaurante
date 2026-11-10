package PACKAGE_NAME;

import java.util.HashMap;
import java.util.Map;

public class ReporteVentas {
    private Restaurante restaurante;

    public ReporteVentas(Restaurante restaurante) {
        this.restaurante = restaurante;
    }


    public double calcularIngresosRestaurante() {
        double total = 0;
        for (Pedido p : restaurante.getListaPedidos()) {
            if (p.getEstadoPedido() == EstadoPedido.CONFIRMADO
                    || p.getEstadoPedido() == EstadoPedido.ENTREGADO) {
                total += p.calcularSubtotal();
            }
        }
        return total;
    }

    public Map<String, Double> calcularIngresosPorCategoria() {
        Map<String, Double> ingresos = new HashMap<>();
        for (Pedido p : restaurante.getListaPedidos()) {
            if (p.getEstadoPedido() == EstadoPedido.CONFIRMADO || p.getEstadoPedido() == EstadoPedido.ENTREGADO) {
                for (DetallePedido d : p.getListaDetallePedido()) {
                    String categoria = d.getProducto().getClass().getSimpleName();
                    double actual = ingresos.getOrDefault(categoria, 0.0);
                    ingresos.put(categoria, actual + d.calcularSubtotal());
                }
            }
        }
        return ingresos;
    }

    public Map<Producto, Integer> obtenerUnidadesVendidas() {
        Map<Producto, Integer> unidades = new HashMap<>();
        for (Pedido p : restaurante.getListaPedidos()) {
            if (p.getEstadoPedido() == EstadoPedido.CONFIRMADO || p.getEstadoPedido() == EstadoPedido.ENTREGADO) {
                for (DetallePedido d : p.getListaDetallePedido()) {
                    int actual = unidades.getOrDefault(d.getProducto(), 0);
                    unidades.put(d.getProducto(), actual + d.getCantidad());
                }
            }
        }
        return unidades;
    }

    public Producto obtenerProductoMasVendido() {
        Producto masVendido = null;
        int max = 0;
        Map<Producto, Integer> unidades = obtenerUnidadesVendidas();
        for (Producto p : unidades.keySet()) {
            if (unidades.get(p) > max) {
                max = unidades.get(p);
                masVendido = p;
            }
        }
        return masVendido;
    }

    public double consultarIngresosDomicilios() {
        double total = 0;
        for (Pedido p : restaurante.getListaPedidos()) {
            if (p.getEstadoPedido() == EstadoPedido.CONFIRMADO
                    || p.getEstadoPedido() == EstadoPedido.ENTREGADO) {
                total += p.getCostoDomicilio();
            }
        }
        return total;
    }
}