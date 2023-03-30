package tests;

public class FibonaciSeries {

	public static void main(String[] args) {

		int n1=0;
		int n2=1;
		int n3 = n1 + n2;
		int max = 8;

		for(int i=0;i<=max;i++) {
			System.out.print(n1 + " ");
			n3 = n1+n2;
			n1=n2;
			n2=n3;
		}
}

}
/*
 * // 0 1 1 2 3 5 8 13..... n1=0; n2=1 n3=n1+n2 n1=n2 n2=n3
 */
