/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author admin
 */
public abstract class Shape {
    
    private String brush, paper, frame;
    
    public abstract String Draw();

    public Shape() {
    }

    public Shape(String brush, String paper, String frame) {
        this.brush = brush; 
        this.paper = paper; 
        this.frame = frame; 
    }

    @Override
    public String toString() {
        return Draw() + ", " + brush + ", " + paper + ", " + frame;
    }
    public String Brush() {
        return brush;
    }
    public String Paper() {
        return paper;
    }
    public String Frame() {
        return frame;
    }

    
}
