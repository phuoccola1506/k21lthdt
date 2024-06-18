/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.edu.pxu.lthdt.bai3;

import java.time.LocalDate;

/**
 *
 * @author TGDD
 */
public class XeOto {
    private String hangxe;
    private int namsanxuat;
    private float dongco;

    public XeOto(String hangxe, int namsanxuat, float dongco) {
        this.setHangxe(hangxe);
        this.setNamsanxuat(namsanxuat);
        this.setDongco(dongco);
    }

    public String getHangxe() {
        return hangxe;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public float getDongco() {
        return dongco;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public void setNamsanxuat(int namsanxuat) {
        LocalDate date = LocalDate.now();
        int namhientai = date.getYear();
        
        if (namsanxuat < 1885 || namsanxuat > namhientai) {
            System.out.println("Nam san xuat " + namsanxuat + " khong hop le.");
        } else {
            this.namsanxuat = namsanxuat;
        }
    }

    public void setDongco(float dongco) {
        if (dongco <= 0) {
            System.out.println("Dong co khong the co cong suat la " + dongco + "kW");
        } else {
            this.dongco = dongco;
        }
    }

    @Override
    public String toString() {
        if (namsanxuat == 0 || dongco == 0){
            return "XeOto{" + "hangxe=" + hangxe + '}';
        } else if (namsanxuat == 0) {
            return "XeOto{" + "hangxe=" + hangxe + ", dongco=" + dongco + '}';
        } else if (dongco == 0) {
            return "XeOto{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + '}';
        } else {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
        }
    }
    
    
}
