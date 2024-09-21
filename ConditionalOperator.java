//Ternary/ Conditional
// <cond> ? T-Part : F-Part
class ConditionalOperator {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a > b ? a : b;			//10 > 20 ? 10 : 20
		System.out.println(d); 			//20
		d = a > b & a > c ? a : b > c ? b : c;	//10 > 20 && 10 > 30 ? 10 : 20 > 30 ? 20 : 30;		
		System.out.println(d); 			//	30
	}	
}








