
package espcoh.ec.edu.gestorproducto.Modelo;

/**
 *
 * @author user
 */
public class Modelo {
    
    private int ID;
    private String nombre;
    private double precio;
    private boolean disponible;

    public Modelo(int ID, String nombre, double precio, boolean disponible) {
        this(nombre, precio);
    }

    public Modelo(String nombre, double precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    void ProductosDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
