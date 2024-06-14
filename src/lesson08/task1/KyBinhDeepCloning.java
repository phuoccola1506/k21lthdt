/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson08.task1;

import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class KyBinhDeepCloning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<VuKhi> dsvk = new ArrayList<>();
        dsvk.add(new VuKhi("Giao", 1));
        dsvk.add(new VuKhi("Kiem", 2));
        KyBinh kb1 = new KyBinh(1, dsvk);
        System.out.println("KyBinh1 = " + kb1);
    }
    
}
