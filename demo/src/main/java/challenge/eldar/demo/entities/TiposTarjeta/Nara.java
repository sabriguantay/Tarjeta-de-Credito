package challenge.eldar.demo.entities.TiposTarjeta;

import java.time.LocalDate;

import challenge.eldar.demo.entities.Operacion;
import challenge.eldar.demo.entities.Interface.ICalcularTasa;

public class Nara implements ICalcularTasa{

    @Override
    public double calcularTasa(Operacion operacion) {

        double dia = LocalDate.now().getDayOfMonth();
        double tasa = dia * 0.5; 
        return tasa;
    }
    
}
