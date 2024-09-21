class ArithmeticOperators2 {		// ++ , --
									// i++ (Post), ++i (Pre)
	public static void main(String args[]) {
		int a = 3, b = 4;
		a = b++;
		System.out.println(a);	//4
		System.out.println(b);	//5
		a = ++b;
		System.out.println(a);	//6
		System.out.println(b);	//6
		b++;
		System.out.println(b);	//7
	}
}









