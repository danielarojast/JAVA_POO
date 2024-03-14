import java.util.ArrayList;
import java.util.Scanner;

public class Curso{
    private String codigo;
    private String  nombre;

    private ArrayList<Estudiante> listaEstudiantes;
    //para crear el id automatico se crea un metodo static
    private static int index = 1;

    public Curso(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    //metodo agregar estudiante

    public void agregarEstudiante(Scanner objScan){

        objScan.nextLine();

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = objScan.nextLine();
        System.out.println("Ingrese el email del estudiante: ");
        String email = objScan.nextLine();

        Estudiante objEstudiante = new Estudiante(index, nombre, email);
        index++;
        listaEstudiantes.add(objEstudiante);
        System.out.println("El estudiante se agrego correctamente \n");
    }

    public void listarEstudiantes(){

        if(this.listaEstudiantes.isEmpty()){
            System.out.println("No se hay estudiantes registrados");
        }else{
            System.out.println("\n Lista de todos los estudiantes del curso".concat(this.nombre));
            for(Estudiante temporal: this.listaEstudiantes){
                System.out.println(temporal.toString());
            }
        }
    }

    public void eliminarEstudiantes(Scanner objScan){
        this.listarEstudiantes();

        System.out.println("\nIngrese el id del estudiante a eliminar: ");
        int idEliminar= objScan.nextInt();

        boolean eliminado= this.listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idEliminar);
        if(eliminado){
            System.out.println("El estudiante se eliminó correctamente");
        }else{
            System.out.println("No se pudo eliminar el estudiante");
        }
    }


    //Setter y getter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
