
package org.reneyuman.bean;


public class Resta {
    double num1, num2;
    /*Constructor*/
    public Resta(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Resta() {
        
    }
    
    
    
    /*Getters an setters*/
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    /*Operacion*/
    public double operacionr(double num1, double num2){
        double res = num1 - num2;
        return res;
    }
    
}
