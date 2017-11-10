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
        String nombre=sc.nextLine();
        int variable=0;
        return nombre;
    }
}
