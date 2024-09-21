class Concatenation {
	public static void main(String args[]) {
		String str = "A";
		int a = 111;
		int b = 222;
		System.out.println(str + a + b); 		//  A111222
		System.out.println(str + (a + b)); 		//  A333 
		System.out.println(a + b + str); 		//   333A
		str += 10; 	// str = str + 10		//  
		System.out.println(str);  		//  A10
	}	
}







