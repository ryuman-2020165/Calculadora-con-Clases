
package org.reneyuman.bean;


public class Division {

    private double num1, num2;
    /*Constructor*/
    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Division() {
    }
    
    
    
    /*Getters and setters*/
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
    
    public double operaciond (double num1, double num2){
        double res = num1 / num2;
        return res;
        
    }
    
}
