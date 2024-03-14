public class ProductoEspecifico extends Producto{

    private String categoria;
    private String marca;

    //METOTDOS

    public ProductoEspecifico(int id, String nombre, double precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    //setting

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //getting

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
