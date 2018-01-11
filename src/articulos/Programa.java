package articulos;

import componentes.Componente;
import componentes.Rectangulo;
import componentes.Tapa;
import componentes.Tipo;

import java.util.HashMap;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo("asd asd asd", Tipo.ACERO,10.0,5.0);
        Rectangulo rect2 = new Rectangulo("qwe qwe qwe", Tipo.HOJALATA,10.0,20.0);
        Rectangulo rect3 = new Rectangulo("fgh fgh fgh", Tipo.ALUMINIO,20.0,5.0);

        Tapa t1 = new Tapa("hola", Tipo.HOJALATA, 20.0);
        Tapa t2 = new Tapa("ralf", Tipo.ACERO, 10.0);
        Tapa t3 = new Tapa("asd", Tipo.ALUMINIO, 10.0);

        Map<Componente, Integer> mapa1 = new HashMap<Componente, Integer>();
        mapa1.put(rect1, 1);
        mapa1.put(t2, 2);
        mapa1.put(rect3, 3);

        Caja c1 = new Caja("Primera Caja", mapa1);
        Caja c2 = new Caja("Segunda Caja", mapa1);

        Map<Componente, Integer> mapa2 = new HashMap<Componente, Integer>();
        mapa2.put(t1, 1);
        mapa2.put(t2, 2);
        mapa2.put(t3, 3);

        Lata lata1 = new Lata("Primera Lata",mapa2);
        Lata lata2 = new Lata("Segunda Lata",mapa2);

        lata1.mostrarEstructura(mapa2);

        //System.out.println(lata1);

    }
}
