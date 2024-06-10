/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

import lesson8.vidu1.SanPham;
import lesson8.vidu1.SanPham;

/**
 *
 * @author TGDD
 */
public class NoneCloning {
    public static void main(String[] args) {
        
        SanPham sp1 = new SanPham(15, "XiaomiPhone");
        
        System.out.println(sp1);
        
        //Thuc hien phep gan
        SanPham sp2 = sp1;
        sp2.setTenSP("Nokia");
        System.out.println(sp1);
        System.out.println(sp2);
    }
}
