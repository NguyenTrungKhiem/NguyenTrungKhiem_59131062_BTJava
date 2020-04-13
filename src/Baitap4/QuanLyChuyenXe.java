/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

import java.util.ArrayList;
/**
 *
 * @author Khiem
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> DSCX = new ArrayList<>();
    
    public QuanLyChuyenXe(){
    }
    
    public void themChuyenXe(ChuyenXe cx)
    {
        DSCX.add(cx);
    }
    public void inDSCX()
    {
        for(int i=0;i<DSCX.size();i++)
            DSCX.get(i).xuatThongTin();
    }
    public double tinhDoanhThuXeNoiThanh()
    {
        double S = 0;
        for(int i=0;i < DSCX.size(); i++)
            if(DSCX.get(i) instanceof ChuyenXeNoiThanh){
            S += DSCX.get(i).getDoanhThu();
            }
        return S;
    }
    public double tinhDoanhThuXeNgoaiThanh()
    {
        double S = 0;
        for(int i=0 ; i< DSCX.size(); i++)
            if(DSCX.get(i) instanceof ChuyenXeNgoaiThanh){
            S += DSCX.get(i).getDoanhThu();
            }
        return S;
    }
    public double tongDoanhThu()
    {
        double S = 0;
        for(int i=0 ; i< DSCX.size(); i++){
            S += DSCX.get(i).getDoanhThu();
        }
        return S;
    }
}
