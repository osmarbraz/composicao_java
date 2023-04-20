
import javax.swing.JOptionPane;

public class Triangulo {

    private double base;
    private double altura;
    private FiguraGeometrica figura;

    public Triangulo() {
        this("", 0, 0);
    }

    public Triangulo(String cor, double base, double altura) {
        figura = new FiguraGeometrica(cor);
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void leitura() {
        figura.leitura();
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base")));
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));
    }

    public void imprimir() {
        figura.imprimir();
        JOptionPane.showMessageDialog(null, "A base e " + getBase());
        JOptionPane.showMessageDialog(null, "A altura e " + getAltura());
    }

    public String paraString() {
        return (figura.paraString() + "/ Base : " + getBase() + "/ Altura :" + getAltura());
    }

    public double getArea() {
        return ((getBase() * getAltura()) / 2.0);
    }
}