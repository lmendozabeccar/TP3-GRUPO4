package Modelos;

public class TarjetaDebito extends Tarjeta {
    private float porcentajeIVA;

    public TarjetaDebito(String numeroTarjeta, Cliente cliente, float porcentajeIVA) {
        setNumeroTarjeta(numeroTarjeta);
        setCliente(cliente);
        this.porcentajeIVA = porcentajeIVA;
    }

    public float calcularConsumoReal(int mes, int año) {
        float total = 0f;

        for (Consumo c : getConsumos()) {
            if (c.getMes() == mes && c.getAño() == año) {
                total += c.getMonto();
            }
        }

        // Se aplica IVA al total
        return total * (1 + porcentajeIVA / 100f);
    }

    public float getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(float porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }
}
