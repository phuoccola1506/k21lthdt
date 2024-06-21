/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap.bai11;

/**
 *
 * @author TGDD
 */
public class LapTop extends SanPham {

    private int ram;
    private String cpu;

    public LapTop(int ram, String cpu, int maSP, String tenSP, int sl, double giaca) {
        super(maSP, tenSP, sl, giaca);
        this.ram = ram;
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "LapTop{" + super.toString() + "ram=" + ram + ", cpu=" + cpu + '}';
    }

}
