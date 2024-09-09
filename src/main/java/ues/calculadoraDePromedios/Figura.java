package ues.calculadoraDePromedios;

public abstract class Figura {
    protected double lado;

    public Figura(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

}
