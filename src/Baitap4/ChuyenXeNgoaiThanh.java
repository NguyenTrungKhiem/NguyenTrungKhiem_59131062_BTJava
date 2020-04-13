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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
        String noiDen;
        int soNgay;
        
    public ChuyenXeNgoaiThanh(String noiDen, int soNgay, String maSoChuyen, String hoTen, String soXe, double doanhThu) 
    {
        super(maSoChuyen, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
       @Override
    public void xuatThongTin(){
        System.out.println("Ma so chuyen: "+ maSoChuyen);
        System.out.println("Ho ten tai xe: "+ hoTen);
        System.out.println("So xe: "+ soXe);
        System.out.println("Noi den: "+ noiDen);
        System.out.println("So ngay di duoc: "+ soNgay);
        System.out.println("Doanh thu: "+ doanhThu);
    }
    
}
