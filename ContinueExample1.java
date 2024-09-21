class ContinueExample1 {
	public static void main(String args[]) {
		for(int i = 2; i <= 10 ; i+=2) {
			if( i == 6) {
				continue; //Take cursor to line 3
			}
			System.out.println(i);
		}
	}
}
/*
i	i == 6		Print
2	false		2
4	false		4
6	true
8	false		8
10	false		10
*/