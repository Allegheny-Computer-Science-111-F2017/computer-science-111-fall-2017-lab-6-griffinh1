package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.random;
import java.util.Scanner;

public class ManipulateDna {

  /**
   *This program will manipulate and display DNA strings.
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Haeley M. Griffin " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string \"" + dna + "\"");
    System.out.println("Enter a string containing only C, G, T, and A: " + dna);
    // Step Two: Compute the complement of the DNA String
    String s1 = dna;
    String s2 = s1.replace('a','T');
    String s3 = s2.replace('t','A');
    String s4 = s3.replace('c','G');
    String s5 = s4.replace('g','C');
    dna = dna.toUpperCase();
    s5 = s5.toUpperCase();
    System.out.println("Complement of " + dna + " is " + s5);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    
    //new = dna.substring(0,randomeInsertionIndex) + randomChar + dna.substring(randomeInsertionIndex);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter

    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using the Manipulate Dna program.");
    System.out.println("Have an awesome day.");

  }

}
