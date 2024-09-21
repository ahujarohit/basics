class ContinueExample2 {
	public static void main(String args[]) {
		int x , y;
		skip:
		for(x = 2 ; x  < 4 ; x++) {
			System.out.println("x = " + x);
			for( y = 2 ; y < 6 ; y++) {
				System.out.println("y = " + y);
				if(x == y) {
					continue skip;	//Goto Line no 5
				}
			}
		}
	}
}
/*
x	y	x == y							Print x = 2, y = 2
2	2	2 == 2 (true)
3	2	3 == 2 (false)					Print x = 3, y = 2, y = 3
	3	3 == 3 (true)			
*/
