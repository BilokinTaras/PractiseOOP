/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import program.Contact;
import program.Order;
import program.Students;

/**
 *
 * @author Taras
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Students students1 = new Students(1, "Taras", "Zhenya", 24, "Biology");
        System.out.println(students1);
        Contact contact1 = new Contact("Arhimed", "Anatoliy", "Pyshkina");
        System.out.println(contact1);
     
    }
    
}
