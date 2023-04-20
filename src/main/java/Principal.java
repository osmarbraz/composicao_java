
public class Principal {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        triangulo.imprimir();

        Circulo circulo = new Circulo("Branco", 3);
        System.out.println(circulo.paraString());
    }
}