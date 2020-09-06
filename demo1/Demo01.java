package com.bianyiit.cast;

public class Demo01 {

    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            if (num % 2 == 1){
                num = num + i;
            }
        }
        System.out.println(num);
    }

}
