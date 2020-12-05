/*
Alexander Crabtree
11/24/2020
This program shows off string properties. 
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //getting a user inputed name
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        //trimming the extra spaces on a name variable
        name = name.trim();
        
        //checking if there is more than one word
        int index1 = name.indexOf(" ");
        if (index1 == -1){
            System.out.println("Name not in valid format.");
        } else {
            //checking if there is more than two words if not displaying the
            //two names separatly
            int index2 = name.indexOf(" ", index1+1);
            if(index2 == -1){
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("First name:   " + firstName);
                System.out.println("Last Name:    " + lastName);
            } else {
                //checking if there is more than three words if not displaying the
                //three names separatly
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                    
                    System.out.println("First name:   " + firstName);
                    System.out.println("Middle name:  " + middleName);
                    System.out.println("Last Name:    " + lastName);
                } else{
                    System.out.println("Name not in valid format.");
                }
            }
        }
        
    }
}
