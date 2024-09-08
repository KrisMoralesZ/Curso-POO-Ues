package ues.empleos;

public class Vigilante extends Empleado {
    private double horasExtras;
    private double tarifaHorasExtra;

    public Vigilante(int numeroEmpleado, String nombreEmpleado, double sueldoEmpleado, double horasExtras, double tarifaHorasExtra){
        super(numeroEmpleado, nombreEmpleado, sueldoEmpleado);
        this.horasExtras = horasExtras;
        this.tarifaHorasExtra = tarifaHorasExtra;
    }

    @Override
    public double calcularSalario() {
        this.sueldoEmpleado += horasExtras * tarifaHorasExtra;
        return sueldoEmpleado;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getTarifaHorasExtra() {
        return tarifaHorasExtra;
    }

    public void setTarifaHorasExtra(double tarifaHorasExtra) {
        this.tarifaHorasExtra = tarifaHorasExtra;
    }
}
