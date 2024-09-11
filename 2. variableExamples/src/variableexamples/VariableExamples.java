/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variableexamples;

/**
 *
 * @author cstrovel
 */
public class VariableExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarations: 
        // Variable declarations consist of a data type and an identifier. The
        // data type comes first and determines how much space needs to be reserved
        // in memory as well as how the value stored in the variable is treated
        // by certain operators. The identifier should be descriptive of what the 
        // value stored in the variable represents.
        int numberOfStudents; // integers (int) contain only whole numbers, 1,5,-2, etc
        double costOfCourse; // double can contain numbers with decimal components. 3.14, 22.5
        String studentName; // Strings can contain words or sentances
        
        // assignment:
        // Varibles are meant to store values. We can change the current value
        // of a variable using the assignment operator =. Keep in mind values
        // need to be approriate for the variable's data type
        numberOfStudents = 56;
        costOfCourse = 834.95;
        studentName = "Greg";
        // numberOfStudents = 56.5; would not work. Int can not store decimal values
        
        // initialization:
        // when a variable is first assigned a value, it is known as 
        // "initialization". Initialization is an important step as it ensures
        // the varable has a known good value for later components of our program
        // to use. All three variables in the above example were initialized, but 
        // it is best practice to initialize a variable with a known good value
        // when it is first declared
        int numberOfTeachers = 0; // Actual value can be assigne later. Carefully
                                  // Carefully consider what your variable represents
                                  // when picking an initial value. 
                                  
        // Usage:
        // Variables are incredibly important in programming. Variables can keep
        // track of changing values during program execution.
        System.out.println("Starting Number of Teachers: " + numberOfTeachers);
        numberOfTeachers = numberOfTeachers + 5; // we've gained 5 teachers
        System.out.println("Ending number of teachers: " + numberOfTeachers);
        costOfCourse = costOfCourse * 1.10; // the cost of tuition is up 10%
        
    }  
}
