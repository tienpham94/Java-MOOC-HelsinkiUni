/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuottu
 */
public class Calculator {
    
    private Reader reader;
    private int cal = 0;
    
    public Calculator()
    {
       reader = new Reader();
    }
    
    public void start()
    {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                cal++;
            } else if (command.equals("difference")) {
                difference();
                cal++;
            } else if (command.equals("product")) {
                product();
                cal++;
            }
            else{
                continue;
            }
        }

        statistics();
    }
    
    private void sum()
    {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
        System.out.println("sum of the values " + (value1 +value2));
    }
    
    private void difference()
    {
        System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       int dif = value1 - value2;
        System.out.println("difference of the values " + dif);
    }
    
    private void product()
    {
        System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       System.out.println("product of the values " + (value1*value2));
              
    }
    
    private void statistics()
    {
        System.out.println("Calculations done " + cal );
    }
}
