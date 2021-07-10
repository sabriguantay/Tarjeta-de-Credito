package challenge.eldar.demo.services;

import org.springframework.stereotype.Service;

import challenge.eldar.demo.entities.Operacion;

/**
 * OperacionService
 */
@Service
public class OperacionService {

    public enum Validacion {
        OPERACION_VALIDA, OPERACION_INVALIDA;
    }

    public Validacion validarOperacion(Operacion operacion) {
        if (operacion.getImporte() < 1000)
            return Validacion.OPERACION_VALIDA;
        return Validacion.OPERACION_INVALIDA;
    }

}
