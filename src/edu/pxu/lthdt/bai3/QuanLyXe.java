/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.pxu.lthdt.bai3;

/**
 *
 * @author TGDD
 */
public class QuanLyXe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        XeOto car = new XeOto("Lamborghini", 2023, 800);
        XeBus bus = new XeBus("VinBus", 2023, 400, 30);
        
        System.out.println(car);
        System.out.println(bus);
    }
    
}
