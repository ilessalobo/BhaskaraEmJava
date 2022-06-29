package curso_nelio;

public class Bhaskara {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		/* sqrt verifica a raiz quadrada de um número */
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);

		/* pow eleva o número ao valor informado */
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado " + y + " = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		/* abs verifica qual o valor absoluto de um número */
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

		/* Exemplo usando Fórmula de Bhaskara */

		double delta;
		double a = 0;
		double b = 0;
		double c = 0;
		double x1 = 0;
		double x2 = 0;

		delta = Math.pow(b, 2.0) - 4 * a * c;

		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b + Math.sqrt(delta)) / (2.0 * a);

	}

}
