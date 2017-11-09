/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;
import java.util.Scanner;
/**
 *
 * @author jdominguezdominguez
 */
public class Pedir {
    Scanner sc=new Scanner(System.in);
    public String pedirNombre(){
        System.out.println("Como se llama usted?");
        String nombre=sc.nextLine(); //Se guarda el nombre
        return nombre;
    }
    public String pedirApellidos(){
        System.out.println("Cual es su primer apellido?");
        String apellido1=sc.nextLine(); //Se pide y guarda el primer apellido
        System.out.println("Y el segundo?");
        String apellido2=sc.nextLine(); //Se pide y guarda el segundo apellido
        String apellidos=apellido1+" "+apellido2; //Se guardan los dos apellidos en una sola variable
        return apellidos;

    }
}
