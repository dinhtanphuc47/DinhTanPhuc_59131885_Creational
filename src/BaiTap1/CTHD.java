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
public class CTHD {
    private String sanpham;
    private int soluong;
    private int dongia;
    private float chietkhau;

    public CTHD(String sanpham, int soluong, int dongia, float chietkhau) {
        this.sanpham = sanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }
    @Override
    public String toString() {
        return "Sản phẩm: " + this.sanpham + 
               "\nSố lượng: " + this.soluong +
               "\nĐơn giá " + this.dongia + 
               "\nChiết khấu: " + this.chietkhau;
    }
}
