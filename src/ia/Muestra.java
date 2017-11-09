/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

/**
 *
 * @author jdominguezdominguez
 */
public class Muestra {
    Pedir obx = new Pedir();
    public String muestraNombre(){
         String nombre = obx.pedirNombre();
                return nombre;
    }
    public String muestraApellidos(){
        String apellidos= obx.pedirApellidos();
            return apellidos;
    }
}
