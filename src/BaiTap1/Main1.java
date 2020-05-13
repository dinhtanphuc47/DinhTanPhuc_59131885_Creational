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
public class Main1 {
    public static void main(String[] args) {
        HoaDonHeader HDH = new HoaDonHeader("001","13/03/1999","Ngo Ba Kha");
        HoaDon hd = new HoaDon.HoaDonBuilder().setHoaDonHeader(HDH).build();
        CTHD cthd1 = new CTHD("san pham 1",90,1000000,2.0f);
        CTHD cthd2 = new CTHD("san pham 2",80,2000000,5.0f);
        System.out.println(hd.toString());
}
