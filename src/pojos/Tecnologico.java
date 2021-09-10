package pojos;

import java.util.Date;

public abstract class Tecnologico extends Producto{
    protected String paisOrigen;
    protected Date fechaFabricacion;
    protected Empresa fabricante;

    public Tecnologico(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante){
        super(codigo, modelo);

        this.paisOrigen = paisOrigen;
        this.fechaFabricacion = fechaFabricacion;
        this.fabricante = fabricante;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Tecnologico{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                '}';
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;


    }
}
