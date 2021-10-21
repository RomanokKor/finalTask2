package com.roma;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = (s.nextLine()).split("");
        System.out.println(Arrays.toString(arr));
        switch (arr[1]) {
            case "-":
                if (Objects.equals(arr[0], "x")) {
                    int a = Integer.parseInt(arr[2]);
                    int b = Integer.parseInt(arr[4]);
                    System.out.println(a + b);
                } else if (Objects.equals(arr[2], "x")) {
                    int a = Integer.parseInt(arr[4]);
                    int b = Integer.parseInt(arr[0]);
                    System.out.println(b - a);
                } else if (Objects.equals(arr[4], "x")) {
                    int a = Integer.parseInt(arr[0]);
                    int b = Integer.parseInt(arr[2]);
                    System.out.println(a - b);
                }
                break;

            case "+":
                if (Objects.equals(arr[0], "x")) {
                    int a = Integer.parseInt(arr[2]);
                    int b = Integer.parseInt(arr[4]);
                    System.out.println(b - a);
                } else if (Objects.equals(arr[2], "x")) {
                    int a = Integer.parseInt(arr[4]);
                    int b = Integer.parseInt(arr[0]);
                    System.out.println(a - b);
                } else if (Objects.equals(arr[4], "x")) {
                    int a = Integer.parseInt(arr[0]);
                    int b = Integer.parseInt(arr[2]);
                    System.out.println(a + b);
                }
                break;
        }
    }
}

