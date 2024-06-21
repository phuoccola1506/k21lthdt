/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson12;

import lesson12.model.Counter;

/**
 *
 * @author TGDD
 */
public class QuanLyCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter c1 = new Counter();
        System.out.println("Hien tai lop counter co " + Counter.getCount() + " doi tuong trong bo nho");
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Hien tai lop counter co " + Counter.getCount() + " doi tuong trong bo nho");
    }
    
}
