class AssignmentOperators {
    public static void main(String args[]) {
        int a = 5, c = 0;
        c = a;          
        System.out.println(c);      // c = 5
        c += a;                     // c = c + a;
        System.out.println(c);      // c = 10
        c -= a;                     // c = c - a;
        System.out.println(c);      // c = 5
        c *= a;                     // c = c * a;
        System.out.println(c);      // c = 25
        c /= a;                     // c = c / a;
        System.out.println(c);      // c = 5
        c %= a;                     // c = c % a;
        System.out.println(c);      // c = 0
    }
}