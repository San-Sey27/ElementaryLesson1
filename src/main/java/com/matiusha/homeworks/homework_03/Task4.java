package com.matiusha.homeworks.homework_03;

public class Task4 {
    public static void main(String[] args) {
        int n = 145;
        int tmp=0;

        while(n>0) {
            int a =n%10;
            n=n/10;
            tmp += fact(a);
        }
        
        if (n==tmp){
            System.out.println("Given number is STRONG");
        }else {
            System.out.println("Given number is not STRONG");
        }
    }

  private static int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
