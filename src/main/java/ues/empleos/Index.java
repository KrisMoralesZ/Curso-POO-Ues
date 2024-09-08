package ues.empleos;

public class Index {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro sistema de empleo");

        Vendedor vendedor = new Vendedor(
                1,"Rayo McQueen",10000,50, 50);
        System.out.println("Sueldo de " + vendedor.getNombreEmpleado() + ": " + vendedor.calcularSalario());

        Vigilante vigilante = new Vigilante(2, "Matter", 10000, 5, 50);
        System.out.println("sueldo de " + vigilante.getNombreEmpleado() + ": " + vigilante.calcularSalario());
    }
}
