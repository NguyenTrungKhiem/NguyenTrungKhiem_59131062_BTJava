/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap3;
/**
 *
 * @author Khiem
 */
public abstract  class SinhVienPoLy {
    protected String hoTen;
    protected String nganh;
    
    public SinhVienPoLy(){
    }

     public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
     
    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc()
    {
         if(getDiem()<5)
            return "Yeu";
        else if(getDiem()<6.5 && getDiem()>=5)
            return "Trung Binh";
        else if(getDiem()<7.5 && getDiem()>=6.5)
            return "Kha";
        else if(getDiem()<9 && getDiem()>=7.5)
            return "Gioi";
        return "Xuat sac";
    }
    
         public void xuat(){
        System.out.println("Ten "+ hoTen);
        System.out.println("Nganh "+ nganh);
        System.out.println("Diem "+ getDiem());
        System.out.println("Hoc luc "+ getHocLuc());
    } 
    
}
