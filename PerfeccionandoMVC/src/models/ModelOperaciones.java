
package models;


public class ModelOperaciones {
    private int num1 = 1;
    private int num2 = 2;
    private int r = 3;
    public int getN1(){
        return num1;
    }
    public void setN1(int num1){
        this.num1 = num1;
    }
    public int getN2(){
        return num2;
    }
    public void setN2(int num2){
        this.num2 = num2;
    }
    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r = r;
    }
    public void suma(){
        r = num1 + num2;
    }
    public void resta(){
        r = num1 - num2;
    }
    public void multiplicacion(){
        r = num1 * num2;
    }
    public void division(){
        r = num1 / num2;
    }
}
