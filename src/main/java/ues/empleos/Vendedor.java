package ues.empleos;

public class Vendedor extends Empleado {
    private double horasComision;
    private double tarifaComision;

    public Vendedor(int numeroEmpleado, String nombreEmpleado, double sueldoEmpleado, double horasComision, double tarifaComision) {
        super(numeroEmpleado, nombreEmpleado, sueldoEmpleado);
        this.horasComision = horasComision;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double calcularSalario() {
        this.sueldoEmpleado += horasComision * tarifaComision;
        return sueldoEmpleado;
    }

    public double getHorasComision() {
        return horasComision;
    }

    public void setHorasComision(double horasComision) {
        this.horasComision = horasComision;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }
}
