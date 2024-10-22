package astonAqaL4;

public class AstonAqaL4WithoutArgs {

	public static void printThreeWords() {
		System.out.println("Orange \n" + "Banana \n" + "Apple");
	}
	
	public static void cheekSumSign() {
		int a = 9;
		int b = 27;
		if (a+b >= 0) {
			System.out.println("Исходные данные: \na = " + a + "\nb = " + b + "\nРезультат: Сумма положительная");
		} else {
			System.out.println("Сумма отрицательная");
		}
	}
	
	public static void printColor() {
		int value = -5;
		System.out.println("value = -5");
		if(value <= 0) {
			System.out.println("Красный");
		} else if (value > 0 && value <= 100) {
			System.out.println("Жёлтый");
		} else {
			System.out.println("Зелёный");
		}
	}
	
	public static void compareNumbers() {
		int a = 90;
		int b = 27;
		if (a >= b) {
			System.out.println("Исходные данные: \na = " + a + "\nb = " + b + "\nРезультат: a >= b");
		} else {
			System.out.println("Исходные данные: \na = " + a + "\nb = " + b + "\nРезультат: a < b");
		}
	}
}
