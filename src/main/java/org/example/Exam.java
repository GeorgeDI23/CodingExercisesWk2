package org.example;

import java.util.Arrays;

public class Exam {
    public Exam(){

    }

    // For loop from 100 to 5 by 5
    // No stress
    public void for5(){
        for(int i = 100; i >= 5; i-=5){
            System.out.println(i);
        }
    }

    // Sum Integers from 9 to 17, print sum
    // No stress
    public void nineTo17(){
        int sum = 0;
        for(int i = 9; i <=17; i++){
            sum+= i;
        }
        System.out.println(sum);
    }

    //Find and print the smallest integer in an array a = [9, 5, 6, 3, 8, 2, 4];
    // No stress
    public void smallestArray(int[] a){
        int smallest = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < smallest){
                smallest = a[i];
            }
        }
        System.out.println(smallest);
    }

    //Find largest integer in an array
    // no stress
    public void largestArray(int[] a){
        int largest = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }
        System.out.println(largest);
    }

    //Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
    // No stress
    public void firstTrue(boolean[] tF){
        for(int i = 0; i < tF.length; i++){
            if(tF[i] == true){
                System.out.println(i);
            }
        }
    }

    //Find and print index of first true element in an array of booleans (must use a while loop)
    // No stress, just never forget
    public void firstTrueWhile(boolean[] tF){
        int i = 0;
        while(tF[i] != true){
            i++;
        }
        System.out.println(i);
    }

    //add 5 to every element of an array of integers
    // No stress
    public void fiver(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = a[i] + 5;
        }
        System.out.println(Arrays.toString(a));
    }

    //divide each element of a double array by 1.3
    // No stress
    public void doubleDivide(double[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = a[i] / 1.3;
        }
        System.out.println(Arrays.toString(a));
    }

    //raise each element of a double array to it's 3rd power and subtract the original element's value by the value divided by 3.0 a = [1.3, 5.4, 6.1, 1.0, 9.2];
    public void doubleRaise(double[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = Math.pow(a[i], 3.0) - a[i]/3.0;
        }
        System.out.println(Arrays.toString(a));
    }

    //zero out a 4 by 6 integer array
    // No stress
    public void zeroed(){
        int[][] fourBy6 = new int[4][6];
        for (int i = 0; i < fourBy6.length; i++){
            for (int j = 0; j < fourBy6[i].length; j++){
                fourBy6[i][j] = (i+1) * (j+1);
            }
        }

        for (int l = 0; l < fourBy6.length; l++){
            for (int m = 0; m < fourBy6[l].length; m++){
                fourBy6[l][m] = 0;
            }
        }


        for (int k = 0; k < fourBy6.length; k++) {
            System.out.println(Arrays.toString(fourBy6[k]));
        }
    }

    //multiply each element of a 5 by 5 array of integers by 7
    // No Stress
    public void fiverByFiver(){
        int[][] fiveBy5 = new int[5][5];
        for (int i = 0; i < fiveBy5.length; i++){
            for (int j = 0; j < fiveBy5[i].length; j++){
                fiveBy5[i][j] = (j+1);
            }
        }

        for(int l = 0; l < fiveBy5.length; l++){
            for (int m = 0; m < fiveBy5[l].length; m++){
                fiveBy5[l][m] = fiveBy5[l][m] * 7;
            }
        }

        for (int k = 0; k < fiveBy5.length; k++) {
            System.out.println(Arrays.toString(fiveBy5[k]));
        }

    }


    //create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans. each element
    // in the result should be true if the value in the argument array is even, else it's false.
    // No stress
    public void fiveToTrue(){
        int[][] fiveBy5 = new int[5][5];
        for (int i = 0; i < fiveBy5.length; i++){
            for (int j = 0; j < fiveBy5[i].length; j++){
                fiveBy5[i][j] = (j+1);
            }
        }

        boolean[][] trueEven= new boolean[5][5];

        for(int l = 0; l < fiveBy5.length; l++){
            for (int m = 0; m < fiveBy5[l].length; m++){
                if(fiveBy5[l][m] % 2 == 0){
                    trueEven[l][m] = true;
                } else {
                    trueEven[l][m] = false;
                }
            }
        }

        for (int k = 0; k < fiveBy5.length; k++) {
            System.out.println(Arrays.toString(fiveBy5[k]));
        }

        for (int n = 0; n < trueEven.length; n++) {
            System.out.println(Arrays.toString(trueEven[n]));
        }
    }


    //create a method that takes two doubles and returns the first parameter raised to the second parameter's value
    // No stress
    public void doublePow(double a, double b){
        double powPow = a;
        if(a == 0){
            powPow = 0;
        } else{
            for (double i = 2; i <= b; i++) {
                powPow *= a;
            }
        }
        System.out.println(powPow);
    }

    //create a method that returns a boolean if the Object passed to it is a Fish or not
    // No stress
    public void isXaction(Object a){
        if(a instanceof Xaction){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    //There is an object x which has a method (double)Balance(). Build an IF statement that prints "Paid Off" if
    // the result of the balance call is less than of equal to 1.0, else it prints the balance as a Dollar figure (2 decimal places)
    /* public void



     */

    //Build a WHILE loop that turns on the heat if the thermo.getTemp() is less than 72.0 else it turns on
    // the A/C if thermo.getTemp() is greater that 76.0.
    /*public void airCon(){
        Xaction temp = new Xaction(5);
        temp.setTemp(46.0);

        while(true){
            if(Xaction)
        }
    }*/



    //Find a number greater than Pi in a double array, print number and its index.
    // No stress
    public void greaterPi(double[] a){
        int i = 0;
        while(a[i] < Math.PI){
            i++;
        }
        System.out.println("The digit at point " + i + " is greater than pi and is " + a[i]);
    }


    // Given an array of objects (of class Xaction) w/nulls, sum all the values of the objects in the array,
    // using Xaction::getValue(). Print the sum.
    // no stress
    public void xActArray(){
        Xaction[] xArray = new Xaction[10];
        for(int i = 0; i < 10; i++){
            if(i % 3 == 0){
                continue;
            }
            xArray[i] = new Xaction(i);
        }

        int sum = 0;
        for(int i = 0; i < xArray.length; i++){
            if(xArray[i] != null){
                sum += xArray[i].getVal();
            }
        }
        System.out.println(sum);
    }

    //reverse an array of objects of type Xaction
    // no stress, dont forget xArray length is HALVED
    public void xRevers(){
        Xaction[] xArray = new Xaction[10];
        for (int i = 1; i <= 10; i++){
            xArray[i-1] = new Xaction(i);
        }

        int hold;
        for(int i = 0; i < xArray.length/2; i++){
            hold = xArray[i].getVal();
            xArray[i] = new Xaction(xArray[xArray.length-1-i].getVal());
            xArray[xArray.length-1-i]= new Xaction(hold);
        }

        for(int i = 0; i < xArray.length; i++){
            System.out.println(xArray[i].getVal());
        }
    }

    //Print a 5's times table
    // No stress
    public void fiveTimes(){
        for(int i = 1; i <=12; i++){
            String result = String.format("[ %2d ][ %2d ]", i, i*5);
            System.out.println(result);
        }
    }

    //detremine the hypotenuse of a 9 by 7 right triangle, assign it to a double
    // No stress
    public void hypopotenuse(){
        double sideA = 9.0;
        double sideB = 7.0;
        double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        System.out.println(sideC);

    }

}
