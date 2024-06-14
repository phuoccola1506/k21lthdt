/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson08;

import lesson08.vidu2.SanPham;

/**
 *
 * @author TGDD
 */
public class ShallowCloning {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        
        SanPham sp1 = new SanPham(15, "XiaomiPhone");
        
        System.out.println(sp1);
        
        //Thuc hien phep gan
        SanPham sp2 = (SanPham)sp1.clone();
        sp2.setTenSP("Nokia");
        sp2.setMaSP(18);
        System.out.println(sp1);
        System.out.println(sp2);
    }
    
}
