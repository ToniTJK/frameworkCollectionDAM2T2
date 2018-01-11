package articulos;

import componentes.Componente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Caja extends Articulo{
    public static int totalCajas = 0;

    //Contructor
    public Caja(String descripcion, Map<Componente, Integer> estructura) {
        super(descripcion, estructura);
    }

    //Getters
    public static int getTotalCajas() {
        return totalCajas;
    }

    public int getId() {
        return totalCajas++;
    }

    @Override
    public Double getSuperficie() {
        return getSuperficie();
    }

    @Override
    public Map<Componente, Integer> getEstructura() {
        return super.getEstructura();
    }

    @Override
    public String toString() {
        return "\n"+"Caja: " + "\n"+
                "ID: " + getId() + "\n"+
                "Descripción: " + getDescripcion() + "\n"+
                "Estructura: " + getEstructura() + "\n"+
                "-------------------------" + "\n";
    }
}
