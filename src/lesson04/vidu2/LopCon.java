/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04.vidu2;

/**
 *
 * @author TGDD
 */
public class LopCon extends LopCha {
    private String thuocTinhString;

    public LopCon(String thuocTinh1, int thuocTinh2, double thuocTinh3, String thuocTinhString) {
        super(thuocTinh1, thuocTinh2, thuocTinh3);
        this.thuocTinhString = thuocTinhString;
    }

    public String getThuocTinhString() {
        return thuocTinhString;
    }

    public void setThuocTinhString(String thuocTinhString) {
        this.thuocTinhString = thuocTinhString;
    }

    @Override
    public String toString() {
        return super.toString() + ", thuocTinhString= "+ thuocTinhString + '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
