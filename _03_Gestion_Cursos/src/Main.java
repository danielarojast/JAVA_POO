import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Instancia
        Scanner objScan = new Scanner(System.in);
        GestionCursos objGestion = new GestionCursos();

        int option = 0;
        do{

            System.out.println("""
                    MENU DE OPCIONES
                    1. Administar estudiantes
                    2. Administar cursos
                    3. Salir
                    Ingrese una opcion :
                    """);

            option = objScan.nextInt();

            switch (option) {
                case 1:
                    int opcion3 = 0;

                    do {
                        System.out.println("""
                                MENU DE ESTUDIANTES
                                1. Agregar estudiante
                                2. Listar estudiantes
                                3. Eliminar estudiante
                                4. Salir""");

                        opcion3 = objScan.nextInt();

                        switch (opcion3) {
                            case 1:
                                //listar los cursos para luego saber a que curso va a agregar el estudiante
                                objGestion.listarTodosLosCursos();
                                System.out.println("Ingresa el codigo del curso al que pertenece el nuevo estudiante");
                                String codigo = objScan.next();

                                Curso objCurso= objGestion.buscarCursoPorCodigo(codigo);

                                if(objCurso==null){
                                    System.out.println("No existe ningún curso con este codigo");
                                }else{
                                    objCurso.agregarEstudiante(objScan);
                                }

                                break;
                            case 2: // Listar estudiantes
                                objGestion.listarTodosLosCursos();
                                System.out.println("Ingresa el codigo del curso al que pertenece el nuevo estudiante");
                                codigo = objScan.next();

                                objCurso= objGestion.buscarCursoPorCodigo(codigo);

                                if(objCurso==null){
                                    System.out.println("No existe ningun curso con este codigo");
                                }else{
                                    objCurso.listarEstudiantes();
                                }

                                break;
                            case 3:   //Eliminar estudiantes de un curso especifico
                                objScan.nextLine();
                                //1. listar cursos

                                objGestion.listarTodosLosCursos();
                                // 2. preguntar codigo del curso
                                System.out.println("\nIngresa el codigo del curso al cual pertenece el estudiante: ");
                                codigo= objScan.nextLine();
                                //3.Buscar el burso que tenga ese codigo
                                Curso objcurso= objGestion.buscarCursoPorCodigo(codigo);
                                if(objcurso==null){
                                System.out.println("El codigo ingresado no coincide con ningun curso.");
                                }else{
                                    //4. elminar el estudiante del curso encontrado
                                    objcurso.eliminarEstudiantes(objScan);
                                }
                                break;
                        }

                    }while(opcion3 != 4);

                    break;
                case 2:
                    int option2 = 0;

                    do {
                        System.out.println("""
                                MENU DE CURSOS
                                1. Agregar curso
                                2. Listar cursos
                                3. Buscar por codigo
                                4. Salir""");

                        option2 = objScan.nextInt();

                        switch (option2) {
                            case 1:
                                objGestion.agregarCurso(objScan);
                                break;
                            case 2:
                                objGestion.listarTodosLosCursos();
                                break;
                            case 3:
                                System.out.println("Ingresa el codigo del curso que buscas: ");
                                String codigo = objScan.next();

                                Curso objCurso= objGestion.buscarCursoPorCodigo(codigo);
                                if(objCurso == null){
                                    System.out.println("No existe ningun curso con este codigo");
                                }else{
                                    System.out.println(objCurso.toString());
                                }

                                break;
                        }

                    }while (option2 != 4);

            }



        }while(option != 3);


    }

}