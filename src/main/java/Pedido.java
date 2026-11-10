package PACKAGE_NAME;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    protected String codigo;
    protected LocalDate fecha;
    protected double distancia;
    protected double costoDomicilio;
    protected EstadoPedido estadoPedido;
    protected EmpresaEntrega empresaEntrega;
    ModalidadEntrega ModalidadEntrega;
    protected List<DetallePedido> listaDetallePedido;

    public Pedido(String codigo, LocalDate fecha, double distancia, double costoDomicilio, EstadoPedido estadoPedido, EmpresaEntrega empresaEntrega, ModalidadEntrega modalidadEntrega, List<DetallePedido> listaDetallePedido) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.distancia = distancia;
        this.costoDomicilio = costoDomicilio;
        this.estadoPedido = estadoPedido;
        this.empresaEntrega = empresaEntrega;
        ModalidadEntrega = modalidadEntrega;
        this.listaDetallePedido = listaDetallePedido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCostoDomicilio() {
        return costoDomicilio;
    }

    public void setCostoDomicilio(double costoDomicilio) {
        this.costoDomicilio = costoDomicilio;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public EmpresaEntrega getEmpresaEntrega() {
        return empresaEntrega;
    }

    public void setEmpresaEntrega(EmpresaEntrega empresaEntrega) {
        this.empresaEntrega = empresaEntrega;
    }

    public ModalidadEntrega getModalidadEntrega() {
        return ModalidadEntrega;
    }

    public void setModalidadEntrega(ModalidadEntrega modalidadEntrega) {
        ModalidadEntrega = modalidadEntrega;
    }

    public List<DetallePedido> getListaDetallePedido() {
        return listaDetallePedido;
    }

    public void setListaDetallePedido(List<DetallePedido> listaDetallePedido) {
        this.listaDetallePedido = listaDetallePedido;
    }
}
