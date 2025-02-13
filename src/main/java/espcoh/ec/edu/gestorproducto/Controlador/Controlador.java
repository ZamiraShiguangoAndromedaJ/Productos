/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espcoh.ec.edu.gestorproducto.Controlador;

import espcoh.ec.edu.gestorproducto.Modelo.Modelo;
import espcoh.ec.edu.gestorproducto.Modelo.Vista.Vista;

/**
 *
 * @author user
 */
public class Controlador {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.GestorProducto = new gestorProducto;
       
    }
     public void GestorProducto(){
        
        try {
            if (this.lista != null) {
                Producto objProducto = new producto();
                objProducto.setAgregarProducto(this.lista.getAgregarProducto());
                objProducto.setListaProducto(this.lista.getListaProducto());
                GestorProducto.Salir(objProducto);

            } else {
                lista.error("si hay procucto");
            }
        } catch (Exception e) {
            lista.error("ERROR No HAY PRODUCTO");
        }
            
          
}
