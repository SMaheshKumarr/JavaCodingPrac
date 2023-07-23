package practice;

public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String str="xXJavaxXSelenium"; String[] splt=str.split("xX"); for(String
		 * w:splt) { System.out.println(w); }
		 * 
		 * int n=12345; String s = String.valueOf(n); int len = s.length(); for(int
		 * i=len-1;i>=0;i--) {
		 * 
		 * System.out.print(s.charAt(i)); }
		 */

		String s1 = "I am Mahesh";

		// I ma hseham

		int lenn = s1.length();
		System.out.println(lenn);
		for (int k = lenn - 1; k >= 0; k--) {

			System.out.print(s1.charAt(k));
		}

		System.out.println("-----");

		String[] strSplit = s1.split(" ");

		for (int i = 0; i < strSplit.length; i++) {

			int eachword = strSplit[i].length();

			for (int j = eachword - 1; j >= 0; j--) {

				System.out.print(strSplit[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
