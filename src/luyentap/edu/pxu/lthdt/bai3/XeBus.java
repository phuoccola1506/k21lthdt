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
public class XeBus {
    private String hangxe;
    private int namsanxuat;
    private float dongco;
    private int soghe;

    public XeBus(String hangxe, int namsanxuat, float dongco, int soghe) {
        this.setHangxe(hangxe);
        this.setNamsanxuat(namsanxuat);
        this.setDongco(dongco);
        this.setSoghe(soghe);
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

    public int getSoghe() {
        return soghe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public void setNamsanxuat(int namsanxuat) {
        LocalDate date = LocalDate.now();
        int namhientai = date.getYear();
        
        if (namsanxuat < 1894 || namsanxuat > namhientai) {
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

    public void setSoghe(int soghe) {
        if (soghe <= 0) {
            System.out.println("So ghe " + soghe + " khong hop le.");
        } else {
            this.soghe = soghe;
        }
    }

    @Override
    public String toString() {
        if (namsanxuat == 0 || dongco == 0 || soghe == 0){
            return "XeBus{" + "hangxe=" + hangxe + '}';
        } else if (namsanxuat == 0) {
            return "XeBus{" + "hangxe=" + hangxe + ", dongco=" + dongco + ", soghe=" + soghe + '}';
        } else if (dongco == 0) {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", soghe=" + soghe + '}';
        } else if (soghe == 0) {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
        } else {
            return "XeBus{" + "hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe + '}';
        }
    }
    
    
}
