
package Baitap2;

import Baitap1.NhanVien;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy
{
    ArrayList<NhanVien> DSNV = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        DSNV.add(nv);
    }

    @Override
    public void inDS() {
        for(int i=0;i<DSNV.size();i++){
            System.out.println(DSNV.get(i).getThongTin());
        }
    }

}
