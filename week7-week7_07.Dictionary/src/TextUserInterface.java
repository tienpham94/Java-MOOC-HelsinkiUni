
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuottu
 */
public class TextUserInterface {
    
    private Scanner read;
    private Dictionary dic;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary)
    {
        this.read = reader;
        this.dic = dictionary;
    }
    
    public void start()
    {
        System.out.println("Statement:");
        System.out.println("    add - add a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface");
        
        while(true)
        {
            System.out.println("");
            System.out.print("Statement: ");
            String word = read.nextLine();
            if (word.equals("quit"))
            {
                System.out.println("Cheers!");
                break;
            }
            
            else if (word.equals("add"))
            {
                add();
            }
            
            else if (word.equals("translate"))
            {
                translate();
            }
            
            else 
            {
                System.out.println("Unknown statement");
            }
            
        }
        
    }
    
    public void add()
    {
        System.out.print("In Finnish: ");
        String word1 = read.nextLine();
        System.out.print("Translation: ");
        String word2 = read.nextLine();
        dic.add(word1, word2);
    }
    
    public void translate()
    {
        System.out.print("Give a word: ");
        String word1 = read.nextLine();
        System.out.print("Translation: "+ dic.translate(word1));
    }
}
