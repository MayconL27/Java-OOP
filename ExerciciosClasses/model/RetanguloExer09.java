package model;

public class RetanguloExer09 {

    private Ponto c1, c2;
    private double x_centro, y_centro;
    

    public RetanguloExer09(Ponto c1, Ponto c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public String centro() {
        x_centro = (c1.getX() + c2.getX())/2;
        y_centro = (c1.getY() + c2.getY())/2;
        return "X = " + x_centro + "Y =" + y_centro;
        }

    


    @Override
    public String toString() {
        return "RetanguloExer09 [c1=" + c1 + ", c2=" + c2 + ", x_centro=" + x_centro + ", y_centro=" + y_centro + "]";
    }

    public double getX_centro() {
        return x_centro;
    }

    public void setX_centro(double x_centro) {
        this.x_centro = x_centro;
    }

    public double getY_centro() {
        return y_centro;
    }

    public void setY_centro(double y_centro) {
        this.y_centro = y_centro;
    }
        
    

    

    

    
}
