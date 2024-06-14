/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson04.vidu2;

/**
 *
 * @author TGDD
 */
public class QuanLyChaCon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LopCha obj1 = new LopCha("Lop Cha", 15, 3.141785);
        
        obj1.thuocTinh2 = 16;
        obj1.thuocTinh3 = 7.5;
        obj1.phuongThuc2();
        obj1.phuongThuc3();
        obj1.viduGoiPrivate();
        System.out.println(obj1);
        
        LopCon obj2 = new LopCon("Con", 100, 9.9, "CNTTK21");
        
        System.out.println(obj2);
    }
    
}
