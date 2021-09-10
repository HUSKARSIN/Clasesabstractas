package pojos;

public class Servicios {
    private Cliente cliente;
    private Impresora impresora;
    private String detalle;
    private double totalFactuca;

    public Servicios(Cliente cliente, Impresora impresora, String detalle, double totalFactuca) {
        this.cliente = cliente;
        this.impresora = impresora;
        this.detalle = detalle;
        this.totalFactuca = totalFactuca;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getTotalFactuca() {
        return totalFactuca;
    }

    public void setTotalFactuca(double totalFactuca) {
        this.totalFactuca = totalFactuca;
    }
}
