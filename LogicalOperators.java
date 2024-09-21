class LogicalOperator {
	public static void main(String args[]) {
		int a = 5;
		int b = 5;
		if ((b == a) | ( a < ++b))	
			System.out.println("Here");
		System.out.println(" a : " +  a + " b : " + b);		
		System.out.println(a^b);
	}		
}
/*
Short Circuit OR || : First Correct
OR | : Complete
Short Circuit AND && : First Incorrect
AND && : Complete

*/