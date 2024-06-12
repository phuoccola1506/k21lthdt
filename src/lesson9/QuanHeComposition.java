/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson9;

import lesson9.vidu3.BanhXe;
import lesson9.vidu3.DongCo;
import lesson9.vidu3.XeHoi;

/**
 *
 * @author TGDD
 */
public class QuanHeComposition {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        // TODO code application logic here
        DongCo dc = new DongCo("Dong co xang");
        XeHoi car = new XeHoi(dc);
        BanhXe bx1 = new BanhXe(1.5);
        BanhXe bx2 = new BanhXe(1.5);
        BanhXe bx3 = new BanhXe(1.5);
        BanhXe bx4 = new BanhXe(1.5);
        car.addBanhXe(bx1);
        car.addBanhXe(bx2);
        car.addBanhXe(bx3);
        car.addBanhXe(bx4);
        
        System.out.println(car);
        
        System.out.println("Thay doi khi co clone va khong co clone");
        dc.setLoaiDongCo("Dong co dien");
        System.out.println("Dong co thay doi " + dc);
        bx1.setBanKinh(1.8);
        System.out.println(car);
    }
    
}
