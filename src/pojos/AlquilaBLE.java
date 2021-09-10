package pojos;

public  abstract class AlquilaBLE extends Producto{
    protected double precioHora;

    public AlquilaBLE(String codigo, String modelo ,double precioHora){
        super(codigo, modelo);

        this.precioHora = precioHora;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    @Override
    public String toString() {
        return "AlquilaBLE{" +
                "precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;

    }

}
