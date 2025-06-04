package Controller;

import Modelos.Cliente;
import Modelos.Consumo;
import Modelos.Tarjeta;
import Modelos.TarjetaDebito;
import dto.ConsumoDto;
import dto.TarjetaCreditoDto;
import dto.TarjetaDebitoDto;

import java.util.ArrayList;
import java.util.List;

public class TarjetasController {

    private static TarjetasController INSTANCE =null;

    private List<Cliente> clientes = null;
    private List<Tarjeta> tarjetas = null;

    private TarjetasController() {
        this.clientes = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
    }

    public static synchronized TarjetasController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new TarjetasController();
        }
        return INSTANCE;
    }

    public int crearConsumo(ConsumoDto dto) {
        for (Tarjeta t : tarjetas) {
            if (t.getNumeroTarjeta().equals(dto.getNumeroTarjeta())) {
                // transformar DTO en objeto Consumo real
                int mes = Integer.parseInt(dto.getMes());
                int año = Integer.parseInt(dto.getAño());
                float monto = Float.parseFloat(dto.getMonto());
                String nombreEstablecimiento = dto.getNombreEstablecimiento();
                String numeroTarjeta = dto.getNumeroTarjeta();

                Consumo nuevoConsumo = new Consumo(mes, año, nombreEstablecimiento, monto, numeroTarjeta);
                t.agregarConsumo(nuevoConsumo);
                return 0;
            }
        }
        return -1; // tarjeta no encontrada
    }

    /**
    public float calcularConsumoReal() {

    }

    public int darAltaTarjetaDebito(TarjetaDebitoDto dto) {

    }

    public int darAltaTarjetaCredito(TarjetaCreditoDto dto) {

    } **/
}
