package com.company;

public class Main {
    public static void printAllNums(double[] nums1) {
        System.out.print("|");
        for (double num : nums1) {
            if(num>=0){
                System.out.print(num + "|");
            }

        }
        System.out.println();
    }

    public static double midNum(double[] numbers) {
        double average = 0;
        double c=0;
        for (double num : numbers) {
            if(num>=0){
                average = num + average;
                c++;
            }

        }
        return ((double) average / c);

    }
    public static void main(String[] args) {

        double[] nums22 = {-5.5, -10.3, 7.2, -8.6, 9.8, 9.1, 10.5, 12.6, -2.3, 4.5, -3.4, 5.8, 1.2, -0.3, 7.8};


        System.out.print("All the nums22: ");
        printAllNums(nums22);
        System.out.println("The average num is " + midNum(nums22));
    }

}