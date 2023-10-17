package Sort.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CyclicSort cyclicSort = new CyclicSort();
        System.out.println("Please enter the number of elements in the array:");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] num = new int[s];

        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < s; i++) {
            num[i] = sc.nextInt();
        }

        int result = cyclicSort.firstMissingPositiveNumber(num);
        System.out.println("The smallest missing positive integer is: " + result);
    }
}