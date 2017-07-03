/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuottu
 */
public class Main {
    public static void main(String[] args) {
       Changer scandiesAway = new Changer();
  scandiesAway.addChange(new Change('ä', 'a'));
  scandiesAway.addChange(new Change('ö', 'o'));
  System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
        
        
    }
}
