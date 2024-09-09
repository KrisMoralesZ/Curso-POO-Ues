package ues.calculadoraDePromedios;

public class Circulo extends Figura{

    public Circulo(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return Math.pow((Math.PI * this.lado), 2);

    }

    @Override
    public double calcularPerimetro() {
        return (this.lado * 2) * Math.PI;

    }
}
