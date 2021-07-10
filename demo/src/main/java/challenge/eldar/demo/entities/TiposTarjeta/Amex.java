package challenge.eldar.demo.entities.TiposTarjeta;

import java.time.LocalDate;

import challenge.eldar.demo.entities.Operacion;
import challenge.eldar.demo.entities.Interface.ICalcularTasa;

public class Amex implements ICalcularTasa{

    @Override
    public double calcularTasa(Operacion operacion) {
       
        double mes = LocalDate.now().getMonthValue();
        double tasa = mes * 0.1; 
        return tasa;
    }
    
}
