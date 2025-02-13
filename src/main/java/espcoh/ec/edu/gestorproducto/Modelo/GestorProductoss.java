

package espcoh.ec.edu.gestorproducto.Modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorProductoss {
    
    private String nombre;
    private double precio;
    private List<Modelo> productos;

    public GestorProductoss(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = new ArrayList<>(); 
    }
    
    public void agregarProductos(String nombre, double precio) {
        Modelo nuevosProductos = new Modelo(nombre, precio); 
        productos.add(nuevosProductos); 
    }
    
    public List<Modelo> listarProductosDisponibles() {
        List<Modelo> disponibles = new ArrayList<>();
        for (Modelo producto : productos) {
            if (producto.isDisponible()) { 
                disponibles.add(producto);
            }
        }
        return disponibles;
    }
    
    public List<Modelo> listarProductosNoDisponibles() {
        List<Modelo> noDisponibles = new ArrayList<>();
        for (Modelo producto : productos) {
            if (!producto.isDisponible()) {
                noDisponibles.add(producto);
            }
        }
        return noDisponibles;
    }
    
    public void marcarProductoComoDisponible(int ID) {
        for (Modelo producto : productos) {
            if (producto.getID() == ID) {
                producto.ProductosDisponible(); 
                return;
            }
        }
        throw new IllegalArgumentException("No hay este producto disponible con ID: " + ID);
    }
}

