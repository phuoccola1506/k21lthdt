/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.task1;

/**
 *
 * @author TGDD
 */
public class DongCo implements Cloneable {

    private String loaiDongCo;
    private double congSuat;

    public DongCo(String loaiDongCo, double congSuat) {
        this.loaiDongCo = loaiDongCo;
        this.congSuat = congSuat;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "DongCo{" + "loaiDongCo=" + loaiDongCo + ", congSuat=" + congSuat + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
