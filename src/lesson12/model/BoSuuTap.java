/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TGDD
 */
public class BoSuuTap {

    private List<HinhHoc> bst;

    public BoSuuTap() {
        this.bst = new ArrayList<>();
    }
    
    public void addHinhHoc(HinhHoc hh) {
        this.bst.add(hh);
    }

    public List<HinhHoc> getBst() {
        return bst;
    }

    public void setBst(List<HinhHoc> bst) {
        this.bst = bst;
    }

    @Override
    public String toString() {
        return "BoSuuTap{" + "bst=" + bst + '}';
    }

}
