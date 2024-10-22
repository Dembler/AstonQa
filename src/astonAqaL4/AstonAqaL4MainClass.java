package astonAqaL4;

import astonAqaL4.AstonAqaL4WithoutArgs;
import astonAqaL4.AstonAqaL4WithArgs;
import java.util.Scanner;
import astonAqaL4.AstonAqaL4Arrays;

public class AstonAqaL4MainClass {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" В данном классе представлены методы с 1 по 14 включительно.\n Введите порядковый номер метода для проверки: ");
		int choose = scan.nextInt();
		while(choose < 1 || choose > 14) {
			System.out.println("\n Вы ввели некорректные данные, попробуйте снова");
			System.out.print("\n\n В данном классе представлены методы с 1 по 14 включительно.\n Введите порядковый номер метода для проверки: ");
			choose = scan.nextInt();
		}
		if (choose >= 1 && choose <= 14) {
			switch(choose) {
			case 1 :
				AstonAqaL4WithoutArgs.printThreeWords();
    			break;
    		case 2 :
    			AstonAqaL4WithoutArgs.cheekSumSign();
    			break;
    		case 3 :
    			AstonAqaL4WithoutArgs.printColor();
    			break;
    		case 4:
    			AstonAqaL4WithoutArgs.compareNumbers();
    			break;
    		case 5 :
    			int method5A = 10;
    			int method5B = 5;
    			System.out.println(AstonAqaL4WithArgs.boolSum(method5A,method5B));
    			break;
    		case 6 :
    			int method6A = -10;
    			AstonAqaL4WithArgs.plusOrMinus(method6A);
    			break;
    		case 7 :
    			System.out.println(AstonAqaL4WithArgs.boolPlusOrMinus(-5));
    			break;
    		case 8 :
    			int method8A = 4;
    			String str = "Метод №8 для домашнего задания от компании Aston";
    			AstonAqaL4WithArgs.stringWithInt(str, method8A);
    			break;
    		case 9 :
    			System.out.print("\nВведите год : ");
    			int year = scan.nextInt();
    			System.out.println(AstonAqaL4WithArgs.leapYear(year));
    			break;
			case 10 :
				AstonAqaL4Arrays.zeroOne();
				break;
			case 11 :
				AstonAqaL4Arrays.emptyArray();
				break;
			case 12 :
				AstonAqaL4Arrays.numberLowSix();
				break;
			case 13 :
				AstonAqaL4Arrays.diagElement();
				break;
			case 14 :
				int len = 10;
				int initialValue = 33;
				int[] array = AstonAqaL4Arrays.lenAndInitialValue(len, initialValue);
				for(int i = 0; i<array.length; i++) {
					System.out.print(array[i] + " ");
				}
				break;
		}
	}
	scan.close();
}
}
