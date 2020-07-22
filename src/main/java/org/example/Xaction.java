package org.example;

public class Xaction {

    int val;
    double temp;

    public Xaction(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val){
        this.val = val;
    }

    public void setTemp(double temp){
        this.temp = temp;
    }

    public double getTemp(){
        return this.temp;
    }
}
