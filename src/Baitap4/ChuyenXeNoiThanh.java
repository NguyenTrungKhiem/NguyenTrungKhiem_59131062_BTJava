/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

/**
 *
 * @author Khiem
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
        int soTuyen;
        double soKm;
        
     public ChuyenXeNoiThanh(int soTuyen, double soKm, String maSoChuyen, String hoTen, String soXe, double doanhThu) 
     {
        super(maSoChuyen, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
        @Override
    public void xuatThongTin(){
        System.out.println("Ma so chuyen: "+ maSoChuyen);
        System.out.println("Ho ten tai xe: "+ hoTen);
        System.out.println("So xe: "+ soXe);
        System.out.println("So tuyen: "+ soTuyen);
        System.out.println("So km di duoc: "+ soKm);
        System.out.println("Doanh thu: "+ doanhThu);
    }
    
}
