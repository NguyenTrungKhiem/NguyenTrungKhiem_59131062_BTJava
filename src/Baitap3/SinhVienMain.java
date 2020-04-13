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
public class SinhVienMain {
    
    public static void main(String[] args) 
    {
        SinhVienPoLy sv1 = new SinhVienIT(7, 7, 8, "Trung Khiem", "CNTT"){};
        System.out.println("Sinh vien IT");
        sv1.xuat();
        
        SinhVienPoLy sv2 = new SinhVienBiz(7, 8, "Quoc Trung", "Marketing") {
        };
        System.out.println("Sinh vien Biz");
        sv2.xuat();
    }
    
}
