class BreakExample1 {
	public static void main(String args[]) {
		int j = 0;
		while(true) {
			j = j + 2;
			if(j == 6) {
				break;
			}
			System.out.println(j);
		}
	}
}
/* 
j	Print	condition (j == 6)
2	2		2 == 6	false
4	4		4 == 6	false
6			6 == 6	true
*/