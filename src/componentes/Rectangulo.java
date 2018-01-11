package componentes;

public class Rectangulo extends Componente {

    public static int totalRectangulos = 1;
    private Double base;
    private Double altura;

    public Rectangulo(String descripcion, Tipo material, Double base, Double altura) {
        super(descripcion, material);
        this.base = base;
        this.altura = altura;
    }

    // Getter

    public static void getTotalRectangulos() {
        int result = totalRectangulos-1;
        System.out.println("Total de Rectangulos: " + result);}

    public int getId() {return totalRectangulos++;}

    public Double getBase() {return base;}

    public Double getAltura() {return altura;}

    @Override
    public Double getSuperficie() {
        return base * altura;
    }

    @Override
    public Double getPerimetro() {
        return (base+base) + (altura+altura);
    }

    @Override
    public String toString() {
        return  "Rectangulo: " + "\n"+
                "ID: " + getId() + "\n"+
                "Descripción: " + getDescripcion() + "\n"+
                "TipoMaterial: " + getMaterial() + "\n"+
                "Base: " + getBase() + "\n"+
                "Altura: " + getAltura() + "\n"+
                "Superficie: " + getSuperficie() + "\n"+
                "Perimetro: " + getPerimetro() + "\n"+
                //"Total de Rectangulos: " + getTotalRectangulos() + "\n"+
                //"Total de Componente: " + Componente.getContadorComp() + "\n"+
                "-------------------------";
    }
}

class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo("pepe", Tipo.ACERO,2.0,2.0);
        Rectangulo rect2 = new Rectangulo("robles", Tipo.ALUMINIO,5.0,5.0);

        System.out.println(rect);
        System.out.println(rect2);

        Rectangulo.getTotalRectangulos();


    }
}