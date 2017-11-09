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
public class IA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Muestra obx = new Muestra();
        String nombre=obx.muestraNombre();
        String apellidos= obx.muestraApellidos();
        System.out.println("Encantado de conocerle "+nombre+" "+apellidos);
    }
    
}
