
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
public class Container {
    
    private int maxWeight;
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    private int weightNow;
    
    public Container(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase)
    {
        if (weightNow + suitcase.totalWeight() < maxWeight)
        {
            container.add(suitcase);
            weightNow += suitcase.totalWeight();
        }
        
    }
    
    
    public String toString()
    {
        if (container.size()>1){
        return container.size() + " suitcases (" + weightNow + " kg)";
        }
        else 
        {
            return container.size() + " suitcase (" + weightNow + " kg)";
        }
    }
    
    public void printThings()
    {
        for(Suitcase suitcase: container)
        {
            suitcase.printThings();
        }
    }        
}
