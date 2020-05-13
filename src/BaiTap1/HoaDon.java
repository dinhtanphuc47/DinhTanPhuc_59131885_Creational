/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HoaDon {
    ArrayList<CTHD> listCTHD = new ArrayList<>();
    HoaDonHeader hoaDonHeader;
    public HoaDon(HoaDonHeader hoaDonHeader){
        this.hoaDonHeader = hoaDonHeader;
    }
    protected HoaDon(HoaDonBuilder hoadonbuilder){
        this.hoaDonHeader = hoadonbuilder.hoaDonHeader;
        this.listCTHD = hoadonbuilder.CTHD;
    }
    public static class HoaDonBuilder {
        ArrayList<CTHD> listCTHD = new ArrayList<>();
        HoaDonHeader hoaDonHeader;
        private ArrayList<CTHD> CTHD;


        public HoaDonBuilder setHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public HoaDonBuilder addCTHD(CTHD cthd) {
            this.listCTHD.add(cthd);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }

    }
    public String inHD(){
        String strHD = hoaDonHeader.toString()+"Chi tiết hóa đơn\n";
        for(int i = 0; i < listCTHD.size(); i++){
            strHD += listCTHD.get(i).toString();
        }
        return strHD;
    }

}