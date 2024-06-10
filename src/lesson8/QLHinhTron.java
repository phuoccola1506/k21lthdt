/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson8;

/**
 *
 * @author TGDD
 */
public class QLHinhTron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HinhTron o1 = new HinhTron(7);
        HinhTron o2 = o1;
        o2.setBankinh(15);

        System.out.println(o1);
        System.out.println(o2);
    }

}
