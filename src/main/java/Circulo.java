
import javax.swing.JOptionPane;

public class Circulo {

    private double raio;
    private FiguraGeometrica figura;

    public Circulo() {
        this("", 0);
    }

    public Circulo(String cor, double raio) {
        figura = new FiguraGeometrica(cor);
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void leitura() {
        figura.leitura();
        setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio")));
    }

    public void imprimir() {
        figura.imprimir();
        JOptionPane.showMessageDialog(null, "O raio e " + getRaio());
    }

    public String paraString() {
        return (figura.paraString() + "/ Raio : " + getRaio());
    }

    public double getArea() {
        return (Math.PI * getRaio() * getRaio());
    }
}
