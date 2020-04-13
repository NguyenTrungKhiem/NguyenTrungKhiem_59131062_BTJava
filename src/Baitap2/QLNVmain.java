package Baitap2;

import Baitap1.NhanVien;

public class QLNVmain {
    public static void main(String[] args)
    {
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
         
        NhanVien nv1 = new NhanVien("Trung Khiem", 20, "123 Vo Thi Sau", 7000000, 400);
        NhanVien nv2 = new NhanVien("Quoc Trung", 20, "Nha Trang", 10000000, 410);
        NhanVien nv3 = new NhanVien("Tan Kiet ", 21, "Ninh Hoa", 7000000, 450);
        NhanVien nv4 = new NhanVien("Quang Nghia", 21, "Ninh Hoa", 7000000, 450);
        NhanVien nv5 = new NhanVien("Quoc Huy", 21, "456 Vo Thi Sau", 8000000, 300);
        
        QLNV.them(nv1);
        QLNV.them(nv2);
        QLNV.them(nv3);
        QLNV.them(nv4);
        QLNV.them(nv5);
        
        QLNV.inDS();
    }
}
