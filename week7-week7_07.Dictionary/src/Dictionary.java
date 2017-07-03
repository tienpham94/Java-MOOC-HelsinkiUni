
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuottu
 */
public class Dictionary {
    
    private HashMap<String,String> dic;
    
    public Dictionary()
    {
        this.dic = new HashMap<String,String>();
    }
    
    public String translate(String word)
    {
        if(this.dic.containsKey(word))
        {
            return dic.get(word);
        }
        
        return null;
        
    }
    
    public void add(String word,String translate)
    {
        this.dic.put(word, translate);
    }
    
    public int amountOfWords()
    {
        return this.dic.size();
    }
    
    public ArrayList<String> translationList()
    {
        ArrayList<String> list = new ArrayList<String>();
        for(String translation: dic.keySet())
        {
            list.add(translation + " = " + dic.get(translation));
        }
        
        return list;
    }
}
