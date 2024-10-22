package astonAqaL4;

import java.util.Scanner;

public class AstonAqaL4Arrays {

	public static void zeroOne() {
		int[] numbers = {1,0,1,1,0,0,1,0,1,1,1,0,1,0,1,0,0};
		System.out.println("Исходный массив: ");
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] == 1) {
				numbers[i] = 0;
			} else {
				numbers[i] = 1;
			}
		}
		System.out.println("\nПреобразованный массив: ");
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
		}
	}
	
	public static void emptyArray() {
		int[] numbers = new int[100];
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = i + 1;
		}
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void numberLowSix() {
		int[] numbers = {1,5,3,2,11,4,5,2,4,8,9,1};
		System.out.println("Исходный массив: ");
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] < 6) {
				numbers[i] *= 2;
			}
		}
		System.out.println("\nПреобразованный массив: ");
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static void diagElement() {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Задайте размер матрицы NxN: ");
        int n = scan.nextInt();
        scan.close();
        int secondDiag = n-1;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
                array[i][i] = 1;
                array[i][secondDiag] = 1;
                secondDiag -= 1;
        }
            
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
	}
	
	public static int[] lenAndInitialValue(int len, int initialValue) {
		System.out.println("Исходные данные: \nlen = " + len + "\ninitialValue = " + initialValue + "\n\nРезультат: ");
		int[] array = new int[len];
		for(int i = 0; i<array.length; i++) {
			array[i] = initialValue;
		}
		
		return array;
	}
}