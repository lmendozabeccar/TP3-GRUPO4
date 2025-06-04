package dto;

import Modelos.Consumo;

import java.util.ArrayList;

public class TarjetaDebitoDto {
    private String interes;
    private String cliente;
    private String numeroTarjeta;
    private ArrayList<Consumo> consumos = new ArrayList<>();

    public TarjetaDebitoDto(String interes, String cliente, String numeroTarjeta, ArrayList<Consumo> consumos) {
        this.interes = interes;
        this.cliente = cliente;
        this.numeroTarjeta = numeroTarjeta;
        this.consumos = consumos;
    }

    public ArrayList<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(ArrayList<Consumo> consumos) {
        this.consumos = consumos;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
}
