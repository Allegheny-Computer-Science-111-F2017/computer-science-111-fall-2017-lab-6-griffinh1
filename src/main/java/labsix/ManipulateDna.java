package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *This program pulls in a dna sting from an already existing file and minipulates it.
 */

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
    Random generator = new Random();
    int v1 = generator.nextInt(4);
    String ranChar = dna.substring(v1, v1 + 1);
    int ranPos = generator.nextInt(dna.length());
    String dna2 = dna.substring(0,ranPos) + ranChar + dna.substring(ranPos);
    System.out.println("Inserting " + ranChar + " at position " + ranPos + " gives " + dna2);

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int ranPos2 = generator.nextInt(dna.length());
    String dna3 = dna.substring(0,ranPos2) + dna.substring(ranPos2 + 1);
    System.out.println("Deleting from position " + ranPos2 + " gives " + dna3);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int v2 = generator.nextInt(4);
    String ranChar2 = dna.substring(v1, v1 + 1);
    int ranPos3 = generator.nextInt(dna.length());
    String dna4 = dna.substring(0,ranPos3) + ranChar2 + dna.substring(ranPos3 + 1);
    System.out.println("Changing position " + ranPos3 + " gives " + dna4);

    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using the Manipulate Dna program.");
    System.out.println("Have an awesome day.");

  }

}
