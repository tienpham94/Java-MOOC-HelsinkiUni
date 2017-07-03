
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
public class Suitcase {
    private int weight;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int weightBefore;
    
    public Suitcase(int weight)
    {
        this.weight = weight;
    }
    
    public void addThing(Thing thing)
    {
        if ((thing.getWeight() + this.weightBefore) <= this.weight)
        {
        things.add(thing);
        this.weightBefore += thing.getWeight();
        }
    }
    
    public String toString()
    {
        if (things.size() == 1)
        {
        return things.size() + " thing (" + this.weightBefore + " kg)";
        }
        else if(things.size() > 1)
        {
            return things.size() + " things (" + this.weightBefore + " kg)";
        }
        
        else 
        {
            return "empty (" + this.weightBefore + " kg)";
        }
    }
    
    public void printThings()
    {
        for(Thing thing: things)
        {
            System.out.println(thing);
        }
    }
    
    public int totalWeight()
    {
        int totalWeight = 0;
        for (Thing thing: things)
        {
            totalWeight += thing.getWeight();
        }
        
        return totalWeight; 
    }
    
    public Thing heaviestThing()
    {   if (!things.isEmpty()){
        Thing heaviest = things.get(0);
        for(Thing thing: things)
        {
            if(thing.getWeight()> heaviest.getWeight())
            {
                heaviest = thing;
            }
        }
        return heaviest;
    }
        
        
        else
        {
            return null;
        }
    }
}
