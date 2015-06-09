/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit360.honeydo.controls;
import java.util.Scanner;

/**
 *
 * @author dustinjudd
 */
public class HoneyDo {
    
    String welcomeMsg = 
              "\n\t***********************************************************************"
            + "\n\t* Welcome to Honey-Do-List                                            *"                            
            + "\n\t*                                                                     *" 
            + "\n\t* Please Register Below                                               *"
            + "\n\t***********************************************************************"
            + "\n";
    
    public HoneyDo() {
        
    }

    public static void main(String[] args) {
        String email;
        String password;
    HoneyDo honeydo = new HoneyDo();
    honeydo.display();
        System.out.println("Please enter your email: ");
        Scanner userEmail = new Scanner(System.in);
        email = userEmail.nextLine();
        System.out.println("Please enter a password: ");
        Scanner userPassword = new Scanner(System.in);
        password = userPassword.nextLine();
        System.out.println("Your email is: " + email);
        System.out.println("Your password is: " + password);
    }
    private void display() {
        System.out.println(this.welcomeMsg);
    }
    
}
