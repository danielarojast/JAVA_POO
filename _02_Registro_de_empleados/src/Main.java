import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner objScan = new Scanner(System.in);
        GestionEmpleados objGestionEmpleado = new GestionEmpleados();

        int opcion = 0;

        do {
            System.out.println("\nSeleccione una opcion: \n" +
                    "1. Añadir empleado.\n" +
                    "2. Eliminar empleado.\n" +
                    "3. Ver lista de empleados.\n" +
                    "4. Salir\n" +
                    "Selecciona una opcion: \n");

            opcion= objScan.nextInt();

            switch (opcion){
                case 1:
                    objGestionEmpleado.agregarEmpleado(objScan);
                    break;
                case 2:
                    System.out.println("tipo de empleado al que pertenece: " +
                            "\n1. Temporal" +
                            "\n2. Permanente" +
                            "\n Seleccione una opcion: ");

                    int tipo= objScan.nextInt();

                    System.out.println("Ingresa el id del empleado a eliminar: ");
                    int idEliminar= objScan.nextInt();

                    if(objGestionEmpleado.buscarPorId(tipo, idEliminar)== null){
                        System.out.println("El Id no fue encontrado.");
                        break;
                    }else{
                        objGestionEmpleado.eliminarEmpleado(idEliminar, tipo);
                    }

                    break;
                case 3:
                    objGestionEmpleado.mostrarEmpleados(objScan);
                    break;
            }
        }while(opcion != 4);

    }
}
