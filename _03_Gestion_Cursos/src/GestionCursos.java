import java.util.ArrayList;
import java.util.Scanner;

public class GestionCursos{
    private ArrayList<Curso>listaCursos;

    //Constructor
    public GestionCursos(){
        this.listaCursos = new ArrayList<>();
    }

    //metodos

    //Agregar un nuevo curso a la lista de cursos.

    public void agregarCurso(Scanner objScan){
        objScan.nextLine();

        System.out.println("Ingrese el codigo del curso: ");
        String codigo = objScan.nextLine();

        System.out.println("Ingrese el nombre del curso: ");
        String nombre = objScan.nextLine();

        //para verificar que el codigo no se repita(Se uso con el metodo de buscar por codigo)
        if(this.buscarCursoPorCodigo(codigo) != null){
            System.out.println("Ya existe un curso con el codigo: " + codigo);
        }else{
            //Crear el objeto curso
            Curso objCurso= new Curso(codigo,nombre);
            //Agregar dentro de la lista
           if(this.listaCursos.add(objCurso)){
               System.out.println("curso agregado correctamente");
           }else{
               System.out.println("No se pudo agregar el curso");
           }
        }
    }

    //Buscar curso por codigo (para agregarlo sin que se repita )

    public Curso buscarCursoPorCodigo(String codigoBuscar){
        for(Curso temporal: this.listaCursos){
            if(temporal.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return temporal;
            }
        }

        return null;
    }

    //Listar tooos los cursos
    public void listarTodosLosCursos(){
        if(this.listaCursos.isEmpty()){
            System.out.println("No se hay cursos registrados");
        }else{
                for (Curso temporal : this.listaCursos) {
                    System.out.println(temporal.toString());
                }
            }
        }
    }



    //Agregar estudiante a un curso
    /*public void agregarEstudiante(Scanner objScan){
        System.out.println("Ingrese nombre del estudiante: ");
        String nombre= objScan.nextLine();
        System.out.println("Ingrese el email del estudiante: ");
        String email= objScan.nextLine();
    }

}*/
