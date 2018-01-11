package componentes;

public class testComponentes {
    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo("pepe", Tipo.ACERO,2.0,2.0);
        Rectangulo rect2 = new Rectangulo("robles", Tipo.ALUMINIO,5.0,5.0);
        Tapa t1 = new Tapa("hola", Tipo.HOJALATA,20.0);
        Tapa t2 = new Tapa("ralf", Tipo.ACERO,10.0);

        System.out.println(rect);
        System.out.println(rect2);
        System.out.println(t1);
        System.out.println(t2);

        Tapa.getTotalTapas();
        Rectangulo.getTotalRectangulos();
        Componente.getContadorComp();

    }
}
