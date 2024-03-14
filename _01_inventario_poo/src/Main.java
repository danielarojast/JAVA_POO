import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=0;

        Scanner sc = new Scanner(System.in);
        Inventario objInventario= new Inventario();

        do{
            System.out.println("Ingrese una opcion : \n" +
                    "1. Agregar producto \n" +
                    "2. Listar productos \n" +
                    "3. Eliminar producto \n" +
                    "4. Buscar producto por nombre \n" +
                    "5. Buscar producto por categoria \n" +
                    "6. Salir \n\n" +
                    "Selecciona un producto:");

            opcion= sc.nextInt();

            int id= 0;

            switch(opcion) {

                case 1:  //Agregar producto

                    //Crear el producto
                    id++;
                    System.out.println("Ingrese el nombre del producto: \n" );
                    String nombre= sc.nextLine();
                    System.out.println("precio: ");
                    double precio= sc.nextDouble();
                    System.out.println("A que categoria pertenece: ");
                    String categoria= sc.nextLine();
                    System.out.println("Marca: ");
                    String marca= sc.nextLine();

                    ProductoEspecifico objProducto= new ProductoEspecifico(id,nombre,precio, categoria, marca);

                    //Agregar productos al inventario

                    objInventario.agregarProducto(objProducto);

                    break;

                case 2:
                    //llamar el inventario
                    Inventario objInventario= new Inventario();
                    //Listar productos
                    objInventario.listarProductos();
                    break;

                case 3:
                    //Eliminar producto
                    System.out.println("Despues de eliminar");
                    objInventario.eliminarProducto(2);
                    break;

                case 4:
                    //Buscar producto por nombre
                    System.out.println("Buscando producto por nombre");
                    ProductoEspecifico objProducto3= objInventario.buscarPorNombre("lapiz");
                    break;

                case 5:
                    //Buscar producto por categoria
                    System.out.println("Buscando producto por categoria");
                    ProductoEspecifico objProducto4= objInventario.buscarPorCategoria("papeleria");
                    //Listar productos
                    objInventario.listarProductos();
                    break;
            }

        }while(opcion != 6);

    }
}