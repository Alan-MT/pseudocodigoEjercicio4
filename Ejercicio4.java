import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int edad;
		int m = 0;
		int n = 0;
		n = 156;
		for (int i=1;i<=20;i++) {
			System.out.println("Ingrese la edad");
			edad = sca.nextInt();
			if (edad<n) {
				n = edad;
			}
			if (edad>m) {
				m = edad;
			}
		}
		System.out.println("Edad Mayor"+m);
		System.out.println("edad Menor"+n);
	}


}

