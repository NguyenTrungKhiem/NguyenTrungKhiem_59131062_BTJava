/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author Khiem
 */
public class NhanVienmain {

    public static void main(String[] args) 
    {
      NhanVien nhanvien1 = new NhanVien ();
        nhanvien1.ten = "Trung Khiem";
        nhanvien1.diaChi = "123 Vo Thi Sau";
        nhanvien1.tuoi = 20;
        nhanvien1.tienLuong = 70000000;
        nhanvien1.tongGioLam = 400;
        
      NhanVien nhanvien2 = new NhanVien ();
        nhanvien2.ten = "Quoc Trung";
        nhanvien2.diaChi = "Nha Trang";
        nhanvien2.tuoi = 20;
        nhanvien2.tienLuong = 10000000;
        nhanvien2.tongGioLam = 410;
        System.out.println("Thong tin nhan vien 1:"+nhanvien1.getThongTin());
        System.out.println("Thong tin nhan vien 2:"+nhanvien2.getThongTin());
    }
    
}
