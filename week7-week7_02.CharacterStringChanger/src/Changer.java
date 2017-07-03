
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuottu
 */
public class Changer {
    
    private ArrayList<Change> ch;
    
    public Changer()
    {
        this.ch = new ArrayList<Change>();
    }
            
    public void addChange(Change change)
    {
        this.ch.add(change);
    }
            
    public String change(String characterString)
    {
        String a = "";
        for(Change change: ch)
        {
           a = change.change(characterString);
        }
        
        return a;
    }
}
