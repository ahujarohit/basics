class BreakExample2 {
	public static void main(String args[]) {
		int j, k;
		abc:
		for(j = 0 ; j < 5 ; j++) {
			System.out.println("j= " + j);
			for( k = 2 ; k < 5 ; k++) {
				System.out.println("k= " + k);
				if( j == k) {
					break  abc;
				}
			}
		}
	}
}
// abc: (label) should be immediate before the loop
/*
j	k				Print j = 0, k = 2,  k = 3, k = 4
0	2
	3
	4
1	2				Print j = 1, k = 2,  k = 3, k = 4
	3
	4
2	2				Print j = 2, k = 2
*/ 