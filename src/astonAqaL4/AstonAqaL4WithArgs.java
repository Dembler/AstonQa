package astonAqaL4;

public class AstonAqaL4WithArgs {

	public static boolean boolSum(int a, int b) {
		if(a + b >= 10 && a + b <= 20) {
			System.out.println("Исходные данные: \na = " + a + "\nb = " + b + "\nРезультат: ");
			return true;
		} else {
			System.out.println("Исходные данные: \na = " + a + "\nb = " + b + "\nРезультат: ");
			return false;
		}
	}
	
	public static void plusOrMinus(int a) {
		if(a>=0) {
			System.out.println("Исходные данные: \na = " + a + "\nРезультат: В метод передали положительное цисло");
		} else {
			System.out.println("Исходные данные: \na = " + a + "\nРезультат: В метод передали отрицательное цисло");
		}
	}
	
	public static boolean boolPlusOrMinus(int a) {
		if(a>=0) {
			System.out.println("Исходные данные: \na = " + a + "\nРезультат: ");
			return false;
		} else {
			System.out.println("Исходные данные: \na = " + a + "\nРезультат: ");
			return true;
		}
	}
	
	public static void stringWithInt(String str, int a) {
		System.out.println("Исходные данные: \nCтрока = " + str + "\nКол-во: " + a +"\nРезультат: ");
		for(int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}
	
	public static boolean leapYear(int a) {
		if(a%4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println("Результат: ");
			return true;
		} else {
			System.out.println("Результат: ");
			return false;
		}
	}
}
