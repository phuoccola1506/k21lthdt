/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4.task1;

import java.time.LocalDate;

/**
 *
 * @author TGDD
 */
public class Nguoi {
    private String hoTen;
    private int namSinh;

    public Nguoi(String hoTen, int namSinh) {
        this.setHoten(hoTen);
        this.setNamsinh(namSinh);
    }

    public String getHoten() {
        return hoTen;
    }

    public int getNamsinh() {
        return namSinh;
    }

    public void setHoten(String hoTen) {
//        for (int i = 0; i < hoTen.length(); i++) {
//            if (hoTen.charAt(i) >= 0 && hoTen.charAt(i) <= 9) {
//                
//            }
//        }
        this.hoTen = hoTen;
        
    }

    public void setNamsinh(int namSinh) {
        LocalDate ngayhientai = LocalDate.now();
        int namhientai = ngayhientai.getYear();
        
        if (namSinh < 1900 || namSinh > namhientai)
        {
            System.out.println("Nam sinh khong phu hop");
        } else {
            this.namSinh = namSinh;
        }
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + '}';
    }
    
    
}
