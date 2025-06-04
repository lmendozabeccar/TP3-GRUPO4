package Controller;

import Modelos.Cliente;
import Modelos.Tarjeta;
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

    public int agregarConsumo(ConsumoDto dto){

    }

    /**
    public float calcularConsumoReal() {

    }

    public int darAltaTarjetaDebito(TarjetaDebitoDto dto) {

    }

    public int darAltaTarjetaCredito(TarjetaCreditoDto dto) {

    } **/
}
