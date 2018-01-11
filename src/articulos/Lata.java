package articulos;

import componentes.Componente;


import java.util.Map;

public class Lata extends Articulo{
    public static int totalLatas = 1;

    public Lata(String descripcion, Map<Componente, Integer> estructura) {
        super(descripcion, estructura);
    }

    public static int getTotalLatas() {
        return totalLatas;
    }

    public int getId() {
        return totalLatas++;
    }

    @Override
    public Double getSuperficie() {
        return getSuperficie();
    }

    @Override
    public void mostrarEstructura(Map<Componente, Integer> estructura) {
        super.mostrarEstructura(estructura);
    }

    @Override
    public String toString() {
        return "\n"+"Lata: " + "\n"+
                "ID: " + getId() + "\n"+
                "Descripción: " + getDescripcion() + "\n"+
                "Estructura: " + getEstructura() + "\n"+
                "-------------------------" + "\n";
    }
}
