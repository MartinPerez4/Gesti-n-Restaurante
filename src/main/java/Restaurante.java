package PACKAGE_NAME;

import java.util.List;

public class Restaurante {
    private String nombreComercio;
    private String nit;
    private String direccion;

    private List<Producto> ListaProductos;
    private List<Cliente> listaClientes;
    private List<Pedido> listaPedidos;

    public Restaurante(String nombreComercio, String nit, String direccion, List<Producto> listaProductos, List<Cliente> listaClientes, List<Pedido> listaPedidos) {
        this.nombreComercio = nombreComercio;
        this.nit = nit;
        this.direccion = direccion;
        ListaProductos = listaProductos;
        this.listaClientes = listaClientes;
        this.listaPedidos = listaPedidos;
    }

    public String getNombreComercio() {
        return nombreComercio;
    }

    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        ListaProductos = listaProductos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
