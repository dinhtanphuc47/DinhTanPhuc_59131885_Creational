/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author admin
 */
public class HoaDonHeader {
    String maHD, ngayBan, tenKH;
    public HoaDonHeader(String maHD, String ngayBan, String tenKH){
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }
    @Override
    public String toString(){
        return "Header: " + maHD + " " + ngayBan + " " + tenKH + "\n";
    }

    public static class HoaDonBuilder{
        String maHD, ngayBan, tenKH;
        public HoaDonBuilder() {
            
        }
        public HoaDonBuilder addMaHD(String maHD){
            this.maHD = maHD;
            return this;
        }
        public HoaDonBuilder addNgayBan(String ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        public HoaDonBuilder addTenKH(String tenKH){
            this.tenKH = tenKH;
            return this;
        }
        public HoaDonHeader hoadonbuilder(){
           return new HoaDonHeader(maHD, ngayBan, tenKH);
        }
        
    }
}
