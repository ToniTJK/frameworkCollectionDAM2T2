package articulos;

import componentes.Componente;
import sun.invoke.empty.Empty;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;

public abstract class Articulo {
    public static int totalArticulos = 0;
    private int id;
    private String descripcion;
    private Map<Componente,Integer> estructura =new HashMap<Componente,Integer>();

    public Articulo(String descripcion, Map<Componente, Integer> estructura) {
        this.id = totalArticulos++;
        this.descripcion = descripcion;
        try {
            this.estructura = estructura;
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getTotalArticulos() {
        return totalArticulos;
    }

    public int getId() {
        return totalArticulos++;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<Componente, Integer> getEstructura() {
        return estructura;
    }

    //Methods
    public abstract Double getSuperficie();
    
    public void mostrarEstructura(Map<Componente, Integer> estructura){
        for (Map.Entry<?,?> e:estructura.entrySet())
            System.out.println(e.getKey()+ " - Unidades: "+e.getValue());
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estructura=" + estructura +
                '}';
    }
}
