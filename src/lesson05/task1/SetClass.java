/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson05.task1;

import luyentap.ztrashcanz.Wizard;

/**
 *
 * @author TGDD
 */
public class SetClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwordMan sm = new SwordMan("Phuoc", 150, "Nam", "Sword", 2, "Beginner");
        Cavalry cvr = new Cavalry("LuBu", 369, "Nam", "Spear", true, true, "Master");
        
        System.out.println(sm);
        sm.sangPhai();
        
        System.out.println(cvr);
        cvr.sucManh();
    }
    
}
