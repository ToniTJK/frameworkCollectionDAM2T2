package articulos;

import articulos.Caja;
import componentes.Componente;
import componentes.Rectangulo;
import componentes.Tipo;

import java.util.HashMap;
import java.util.Map;

public class testCaja {
    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo("asd asd asd", Tipo.ACERO,10.0,5.0);
        Rectangulo rect2 = new Rectangulo("qwe qwe qwe", Tipo.HOJALATA,10.0,20.0);
        Rectangulo rect3 = new Rectangulo("fgh fgh fgh", Tipo.ALUMINIO,20.0,5.0);


        Map<Componente, Integer> mapa = new HashMap<Componente, Integer>();
        mapa.put(rect1, 1);
        mapa.put(rect2, 2);
        mapa.put(rect3, 3);

        Caja c1 = new Caja("blablabla", mapa);

        c1.mostrarEstructura(mapa);
        //c1.getSuperficie();
        //System.out.println(c1);


    }
}
