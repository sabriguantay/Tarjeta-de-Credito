package challenge.eldar.demo.entities.TiposTarjeta;

import java.time.LocalDate;

import challenge.eldar.demo.entities.Operacion;
import challenge.eldar.demo.entities.Interface.ICalcularTasa;

public class Visa implements ICalcularTasa{

    @Override
    public double calcularTasa(Operacion operacion) {

        double mes = LocalDate.now().getMonthValue();
        double tasa =(LocalDate.now().getYear()) / mes;
        return tasa;
    }
    
}
