package TratamentoErros;

public class TesteTryCatch {
	public static void main(String[] args) {
		int vl = 1, v2 = 0, res = 0;
		char lista[] = { 1, 2, 3 };

		for (int i = 0; i < lista.length; i++) {
			try {
				if (i == 0)
					res = vl / v2;
				else
					lista[3] = 4;
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exceção: " + e);
			}
			System.out.println("i = " + i);
			System.out.println("res = " + res);
		}
	}
}