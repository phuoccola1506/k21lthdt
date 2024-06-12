/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson9;

import lesson9.vidu2.HoaDon;
import lesson9.vidu2.SanPham;

/**
 *
 * @author TGDD
 */
public class QuanHeAggregation {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        // TODO code application logic here
        SanPham sp1 = new SanPham("Cafe");
        HoaDon hd = new HoaDon(15);
        hd.addSanPham(sp1);
        SanPham sp2 = new SanPham("Cafe sua");
        hd.addSanPham(sp2);
        
        System.out.println(hd);
    }
    
}
