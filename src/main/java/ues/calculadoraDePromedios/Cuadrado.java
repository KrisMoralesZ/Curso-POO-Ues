package ues.calculadoraDePromedios;

public class Cuadrado extends Figura{

    public Cuadrado(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.getLado(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado() * 4;
    }
}
