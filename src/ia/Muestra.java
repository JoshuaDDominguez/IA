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
    public String muestraNombre(){
        Pedir obx = new Pedir();
        String nombre = obx.pedirNombre();
                return nombre;
    }
}
