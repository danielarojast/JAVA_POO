public class EmpleadoPermanente extends Empleado {
    private String tipo;

    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario, String tipo) {
        super(nombre, edad, idEmpleado, salario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntipo=" + tipo;
    }

}

