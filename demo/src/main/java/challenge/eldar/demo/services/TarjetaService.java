package challenge.eldar.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import challenge.eldar.demo.entities.*;

/**
 * TarjetaService
 */

@Service
public class TarjetaService {

    public enum Validacion {
        TARJETA_VALIDA, TARJETA_INVALIDA
    }

    public Validacion validarTarjeta(Tarjeta tarjeta) {
        if (new Date().before(tarjeta.getFechaVencimiento()) == true )

            return Validacion.TARJETA_VALIDA;

        return Validacion.TARJETA_INVALIDA;

    }

    public double calcularTasa(Operacion operacion) {
        return operacion.getTarjeta().calcularTasa(operacion);
    }

    public boolean compararTarjetas(Tarjeta tarjeta1, Tarjeta tarjeta2) {
        return (tarjeta1.equals(tarjeta2));
        
    }

    
}
