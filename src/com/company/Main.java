package com.company;
import java.math.BigInteger;
import java.security.MessageDigest;

public class Main {

    public static void main(String[] args) throws Exception {
// проверка, является ли число степенью 2ки
       /* int[] a = {1, 0, -2, 4, -8, 5};
        for (int b : a) {

            if (Integer.bitCount(Math.abs(b)) == 1) {//Integer.bitCount(int) определяет кол-во единичных битов в числе в двоичном виде
                System.out.println("b=" + b + "true");
            } else {
                System.out.println("b=" + b + "false");
            }

        }
        System.out.println('A'+'1');

        */
        //System.out.println(factorial(1));


// создание строки из нечетных элементов массива
        int [] a = {1,2,3,4,-5,6,-8};
        StringBuilder resStr= new StringBuilder();

        for (int b:a) {
            if (b%2!=0) { //проверка на наечетность
                resStr.append(b);
                resStr.append(",");
            }
        }
        if (resStr.length() != 0) {
            resStr.setLength(resStr.length()-1);//изменение длины строки
        }
        System.out.println(resStr.toString() + "\n");
    }
    /*
    public static BigInteger factorial(int value) {//рекурсивный метод вычисления факториала
        if (value<=1) {
            return new BigInteger("1");
        } else {
            return (BigInteger.valueOf(value)).multiply(factorial(value-1));
        }

    }*/


}

