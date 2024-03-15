import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    private ArrayList<EmpleadoPermanente> listEmpleadoPermanente;
    private ArrayList<EmpleadoTemporal> listEmpleadoTemporal;

    //Constructor
    public GestionEmpleados() {
        this.listEmpleadoPermanente = new ArrayList<>() ;
        this.listEmpleadoTemporal = new ArrayList<>();
    }

    //Metodos
    Scanner objScan= new Scanner(System.in);
    int id= 0;

    //1. Añadir empelados
        public void agregarEmpleado(Scanner objScan){
            objScan.nextLine();

            System.out.println("\nSelecciona el tipo de empleado: \n" +
                    "1. Temporal \n" +
                    "2. Permanente\n" +
                    "Selecciona una opcion: \n");

            int opcion= objScan.nextInt();
            String tipo= "";

            if(opcion== 1){
                tipo = "Temporal";
            }else{
                tipo= "Permanente";
            }
            id++;
            objScan.nextLine();
            System.out.println("Nombre: ");
            String nombre = objScan.nextLine();
            System.out.println("Edad: ");
            int edad= objScan.nextInt();
            System.out.println("Salario: ");
            double salario= objScan.nextDouble();

            if(opcion == 1){
                EmpleadoTemporal objEmpleadoT= new EmpleadoTemporal(nombre, edad, id, salario, tipo );

                if(this.listEmpleadoTemporal.add(objEmpleadoT)){
                    System.out.println("\nEmpleado agregado correctamente\n");
                }else{
                    System.out.println("\nNo se pudo agregar el emplado\n");
                }
            }else{
                EmpleadoPermanente objEmpladoP= new EmpleadoPermanente(nombre, edad, id, salario, tipo);
                if(this.listEmpleadoPermanente.add(objEmpladoP)){
                    System.out.println("\nEl empleado fue agregado\n");
                }else{
                    System.out.println("\nNo se agrego el empleado\n");
                }
            }
        }

    //2. Eliminar Empleado
    public void eliminarEmpleado(int idEliminar, int  tipo){

        if(tipo == 1){
            boolean eliminado= this.listEmpleadoTemporal.removeIf(EmpleadoTemporal -> EmpleadoTemporal.getIdEmpleado()== idEliminar);
            if(eliminado){
                System.out.println("El empleado se elimino correctamente!");
            }else{
                System.out.println("No se pudo eliminar el empleado!");
            }

        }else{
            boolean eliminado= this.listEmpleadoPermanente.removeIf(EmpleadoPermanente -> EmpleadoPermanente.getIdEmpleado()== idEliminar);
            if(eliminado){
                System.out.println("El empleado se elimino correctamente!");
            }else{
                System.out.println("No se pudo eliminar el empleado!");
            }
        }
    }

    public Empleado buscarPorId(int tipo, int idBuscar){
            if(tipo == 1){
                for(EmpleadoTemporal item: this.listEmpleadoTemporal){
                    if(item.getIdEmpleado() == (idBuscar)){
                        return item;
                    }
                }

                return null;
            }else{
                for(EmpleadoPermanente item: this.listEmpleadoPermanente){
                    if(item.getIdEmpleado() == (idBuscar)) {
                        return item;
                    }
                }
                return null;
            }
    }

    //3. Mostrar empleados
    public void mostrarEmpleados(Scanner objScan){

        System.out.println("\nCuales empleados quieres ver: \n" +
                "1.Empliados Temporales\n" +
                "2.Empleados permanentes\n" +
                "3.Todos los empleados\n");
        int opcion = objScan.nextInt();
        if(opcion == 1){
            for(EmpleadoTemporal iterador: this.listEmpleadoTemporal){
                System.out.println(iterador.toString());
            }
        } else if (opcion == 2) {
            for(EmpleadoPermanente iterador: this.listEmpleadoPermanente){
                System.out.println(iterador.toString());
            }

        }else{
            System.out.println("EMPLEADO TEMPORALES: ");
            for(EmpleadoTemporal iterador: this.listEmpleadoTemporal){
                System.out.println(iterador.toString());
            }
            System.out.println("\nEMPLEADOS PERMANENTES: ");
            for(EmpleadoPermanente iterador: this.listEmpleadoPermanente){
                System.out.println(iterador.toString());
            }

        }

    }
}
