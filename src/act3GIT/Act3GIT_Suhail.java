package act3GIT;

public class Act3GIT_Suhail {

	public static void main(String[] args) {
		System.out.println("20 números aleatorios entre 1 y 10.");
		int[] a;
		a = new int[20];
		int i;
		System.out.print("[");
		for (i = 0; i < a.length - 1; i++) {
			a[i] = ((int)(Math.random() * 10));
			System.out.print(a[i] + " ");
		} System.out.print("]");
	}

}
