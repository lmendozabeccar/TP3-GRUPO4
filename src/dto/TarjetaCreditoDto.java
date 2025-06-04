package dto;

import Modelos.Cliente;
import Modelos.Consumo;

import java.util.ArrayList;

public class TarjetaCreditoDto {
    private String cliente;
    private String numeroTarjeta;
    private String devIVA;
    private ArrayList<Consumo> consumos = new ArrayList<>();

    public TarjetaCreditoDto(String cliente, String numeroTarjeta, String devIVA, ArrayList<Consumo> consumos) {
        this.cliente = cliente;
        this.numeroTarjeta = numeroTarjeta;
        this.devIVA = devIVA;
        this.consumos = consumos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getDevIVA() {
        return devIVA;
    }

    public void setDevIVA(String devIVA) {
        this.devIVA = devIVA;
    }

    public ArrayList<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(ArrayList<Consumo> consumos) {
        this.consumos = consumos;
    }
}
