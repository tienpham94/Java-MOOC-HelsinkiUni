/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuottu
 */
public class Change {
    
    private char fromCharacter;
    private char toCharacter;
    
    
    public Change(char fromCharacter, char toCharacter)
    {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString)
    {
        String a = "";
        for(int i=0; i< characterString.length(); i++)
        {
            char b = characterString.charAt(i);
            if(b == this.fromCharacter)
            {
                a += this.toCharacter;
            }
            
            else{
                a += b;
            }
            
        }
        
        return a;
        
    }
}
