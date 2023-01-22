import java.util.Arrays;

public class Algoritmos {

	public static void main(String[] args) {
		int[] s = { 2, 4, 1, 3, 4, 55, 3 };
		Arrays.sort(s);
		int indice = binary(s,1);
		System.out.println(indice);

	}

	private static int binary(int[] s, int x) {
		int meio;
		int inicio;
		int fim;
		inicio = 0;
		fim = s.length - 1;
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (s[meio] == x) {
				return meio;
			} else if (s[meio] < x) {
				inicio = meio + 1;
			} else if (s[meio] > x) {
				fim = meio - 1;
			}
		}
		return -1;
	}
}
