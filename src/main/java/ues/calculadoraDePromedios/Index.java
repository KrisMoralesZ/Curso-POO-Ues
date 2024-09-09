package ues.calculadoraDePromedios;

public class Index {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Calculadora de Figuras");

        Cuadrado cuadrado = new Cuadrado(10);
        System.out.println("El Area del cuadrado es: "+ cuadrado.calcularArea());
        System.out.println("El Perimetro del cuadrado es: "+ cuadrado.calcularPerimetro());

        Circulo circulo = new Circulo(10);
        System.out.println("El Area del circulo es: "+ circulo.calcularArea());
        System.out.println("El Perimetro del circulo es: "+ circulo.calcularPerimetro());
    }
}
