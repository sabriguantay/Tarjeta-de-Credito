package challenge.eldar.demo.controllers;

import challenge.eldar.demo.entities.*;
import challenge.eldar.demo.models.response.*;
import challenge.eldar.demo.services.*;
import challenge.eldar.demo.services.OperacionService.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TarjetaController {

    @Autowired
    TarjetaService tarjetaService;

    @Autowired
    OperacionService operacionService;

    /*@GetMapping("/tarjetas")
    public List<Tarjeta> getTarjetas()
    {
        List<Tarjeta> tarjetas = tarjetaService.getTarjetas();
        
        return tarjetas;
    }*/


    @PostMapping("/operaciones")
    public OperacionResponse postValidarOperacion(@RequestBody Operacion operacion) {

        OperacionResponse r = new OperacionResponse();
        Validacion o = operacionService.validarOperacion(operacion);

        r.isOk = o == Validacion.OPERACION_VALIDA;
        r.message = "Operación exitosa";

        return r;

    }

    @PostMapping("/operaciones/tasas")
    public TasaResponse postGenerarTasa(@RequestBody Operacion operacion) {

        TasaResponse r = new TasaResponse();
        double tasa = tarjetaService.calcularTasa(operacion);

        r.isOk = true;
        r.importeTasa = tasa;
        r.message = "Tasa exitosa";

        return r;

    }
}
