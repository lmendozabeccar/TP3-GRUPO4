package dto;

public class ConsumoDto {
    private String mes;
    private String año;
    private String nombreEstablecimiento;
    private String monto;

    public ConsumoDto(String mes, String año, String nombreEstablecimiento, String monto) {
        this.mes = mes;
        this.año = año;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.monto = monto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
}
