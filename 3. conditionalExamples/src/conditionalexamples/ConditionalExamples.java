/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionalexamples;

/**
 *
 * @author cstrovel
 */
public class ConditionalExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables to be used in this example
        int x = 1;
        int y = 0;
        boolean result = false; // boolean data type can take on a "true" or "false" value
        boolean F = false;
        boolean T = true;
        
        System.out.println("********** Conditional Logic **********");
        System.out.println("The value of X: " + x);
        System.out.println("The value of Y: " + y);
        System.out.println();
        
        // ********** conditional logic using comparison operators  **********
        // < - Less Than
        // > - Greater Than
        // == - Equal to
        // != - Not equal to
        // operators allow us to compare two values to determine their relationship
        // to eachother. The result always has a value of "true" or "false"
        
        // less than <
        result = x < y; 
        System.out.println("X < Y: " + result); // output shows variable contents
        
        // greater than >
        result = x > y;
        System.out.println("X > Y: " + result); 
      
        // equal to == (do not confuse with the assignment operator =)
        result = x == y;
        System.out.println("X == Y: " + result); 
        
        // not equal to !=
        result = x != y;
        System.out.println("X != Y: " + result);
        
        // ********** Binary Operators  **********
        // && - AND
        // || - OR
        // ! - NOT
        // binary operators allow us to compare two boolean values, the result is
        // itself a boolean value
        
        // AND &&, both compared values must be true for the result of an && operation
        // to be true. Any compared false value will cause the result an && operation
        // to be false.
        System.out.println("\n");
        System.out.println("********** Binary Logic **********");
        System.out.println("The value of F: " + F);
        System.out.println("The value of T: " + T);
        System.out.println();
        
        // false and false
        result = F && F;
        System.out.println(F + " && " + F + ": " + result); 
        
        // false and true
        result = F && T;
        System.out.println(F + " && " + T + ": " + result);
        
        // true and true
        result = T && T;
        System.out.println(T + " && " + T + ": " + result);
        System.out.println();
        
        // OR ||, result is true if either or both of the compared values are true.
        // result is false only when both compared values are false
        
        // false or false
        result = F || F;
        System.out.println(F + " || " + F + ": " + result);
        
        // false or true
        result = F || T;
        System.out.println(F + " || " + T + ": " + result);
        
        // true or true
        result = T || T;
        System.out.println(T + " || " + T + ": " + result);
        System.out.println();
        
        // NOT !, also called negation. Flips a boolean value. True becomes false,
        // false becomes true
        
        // not true
        result = !T;
        System.out.println("!" + T + ": " + result);
        
        // not false
        result = !F;
        System.out.println("!" + F + ": " + result);  
    }
}
