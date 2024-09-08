package ues.empleos;

public abstract class Empleado {
    protected int numeroEmpleado;
    protected String nombreEmpleado;
    protected double sueldoEmpleado;

    public Empleado(int numeroEmpleado, String nombreEmpleado, double sueldoEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public abstract double calcularSalario();
}
