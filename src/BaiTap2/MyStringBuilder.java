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
public class MyStringBuilder {
    private String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder addString(String s){
        this.str = this.str +  s;
        return this;
    }
    public MyStringBuilder addFloat(Float f){
        this.str = this.str + f;
        return this;
    }
    public MyStringBuilder addBoolean(Boolean b){
        this.str = this.str + b;
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
}
