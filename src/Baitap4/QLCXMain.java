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
public class QLCXMain {
    public static void main(String[] args) {
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        ChuyenXeNoiThanh CXNT1 = new ChuyenXeNoiThanh(5, 170, "123456", "Nguyen Trung Khiem", "123AR2", 5000000);
        ChuyenXeNoiThanh CXNT2 = new ChuyenXeNoiThanh(2, 120, "456789", "Le Quoc Trung", "550AR3", 4200000);
        ChuyenXeNoiThanh CXNT3 = new ChuyenXeNoiThanh(3, 140, "123789", "Nguyen Tan Kiet", "DX1452", 5000000);
        ChuyenXeNgoaiThanh CXNgT1 = new ChuyenXeNgoaiThanh("Da lat", 4, "987654", "Pham Hong Phuoc", "7878A2", 6000000);
        ChuyenXeNgoaiThanh CXNgT2 = new ChuyenXeNgoaiThanh("Ha Noi", 4, "456123", "Nguyen Quoc Huy", "1245A3", 1300000);
        ChuyenXeNgoaiThanh CXNgT3 = new ChuyenXeNgoaiThanh("Hai Phong", 4, "321654", "Pham Ngoc Truong An", "197AR2", 4500000);
        
        QLCX.themChuyenXe(CXNT1);
        QLCX.themChuyenXe(CXNT2);
        QLCX.themChuyenXe(CXNT3);
        QLCX.themChuyenXe(CXNgT1);
        QLCX.themChuyenXe(CXNgT2);
        QLCX.themChuyenXe(CXNgT3);
        
        QLCX.inDSCX();
        
        System.out.println("Tổng doanh thu chuyến xe ngoại thành :"+QLCX.tinhDoanhThuXeNgoaiThanh());
        System.out.println("Tổng doanh thu chuyến xe nội thành :"+QLCX.tinhDoanhThuXeNoiThanh());
        System.out.println("tổng doanh thu cả 2 loại xe :"+QLCX.tongDoanhThu());
    }

}
