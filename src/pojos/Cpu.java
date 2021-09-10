package pojos;

import Interfaces.IReseteable;

import java.util.Date;

public class Cpu extends Tecnologico implements IReseteable {
    private int memoriaPrincipal;

    public Cpu(String codigo, String modelo, String paisOtigen, Date fechaFabricacion, Empresa fabricante, int memoriaPrincipal){
        super(codigo, modelo , paisOtigen ,fechaFabricacion,fabricante);

        this.setMemoriaPrincipal(memoriaPrincipal);
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                '}';
    }

    @Override
    public void estado() {
        System.out.println("Años de uso: "+ 12);
    }

    @Override
    public void reset() {
        System.out.println("Reseteando al estado de fabrica");
    }
}
