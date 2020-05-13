/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author admin
 */
public class Main2 {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder("Đinh")
                .addString("Tan Phuc")
                .addFloat(61f)
                .addString("CNTT")
                .addFloat(7f)
                .addBoolean(true);
        System.out.println(myStringBuilder.toString());
    }
}
