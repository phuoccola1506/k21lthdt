/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05.task1;

/**
 *
 * @author TGDD
 */
public class Character implements DiChuyen{

    private String nameOfPlayer;
    private int level;
    private String gender;

    public Character(String nameOfPlayer, int level, String gender) {
        this.nameOfPlayer = nameOfPlayer;
        this.level = level;
        this.gender = gender;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Character{" + "nameOfPlayer=" + nameOfPlayer + ", level=" + level + ", gioiTinh=" + gender + '}';
    }
    
    public void sucManh() {
        System.out.println("Suc manh co ban = " + getLevel());
    }
    
    public void hanhDong() {
        System.out.println("...");
    }
    
    public void tanCong() {
        System.out.println("...");
    }
    
    @Override
    public void sangPhai() {
        System.out.println("Nhan vat di chuyen sang phai");
    }
    
    @Override
    public void sangTrai() {
        System.out.println("Nhan vat di chuyen sang trai");
    }
    
    @Override
    public void batNhay() {
        System.out.println("Nhan vat bat nhay len");
    }
    
    @Override
    public void boChay() {
        System.out.println("Nhan vat bo chay");
    }

}
