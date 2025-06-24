/**
 * This Java program reads a list of integers from user input and stores the inputs into a 
 * Stack in sorted order.  
 * @author Nicole Rodriguez
 * @version 1.1
 * @since week 5 CSC 6301
 * Used ChatGpt to assist in deciding which Java Collections Frameworks to use in order to adhere 
 * to the assignment.
 */
import java.util.List;
import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;

/**
 * The main method that coordinates reading input, sorting, and printing.
 */
public class StackedNumbers {
    /**
     * The main method that coordinates reading input, sorting, and printing.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = readInput();
        sortList(numbers);
        printList(numbers);
    }
    /**
     * Reads integer input
     * Reuses the Java Stack from the Collections.sort() method to read the user's input
     * @return list of integers that user has entered
     */
    public static List<Integer> readInput() {
        //Creating Scanner to read input from user
        Scanner scan = new Scanner(System.in);

        //Reusing the Java Stack from collections framework to store input
        Stack<Integer> numbers = new Stack<>();
 
        System.out.println("Enter numbers to create a list or type done when finished: ");

        while (scan.hasNext()) {
            //account for error handling
            String input = scan.next();
            if (input.equalsIgnoreCase("done")) {
                //comparing one string from another string
                break;
            }
            try {
                //troubleshoot user error
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or type 'done' when finished. ");
            }    
            
        }

        scan.close();
        return numbers;
    }

    /**
    * Reusing sorting algorithm from the java collections framework, collections.sort
    * Sorts the user's list of integers in ascending order.
    * @param numbers to be sorted in the list
    */
    public static void sortList(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    /**
     * Prints users list of integers.
     * @param numbers the numbers to be printed
     */
    public static void printList(List<Integer> numbers) {
        //display results
        System.out.println("Here is the sorted Stack:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");

        }
        System.out.println();
    }
}