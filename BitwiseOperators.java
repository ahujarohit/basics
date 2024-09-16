class BitwiseOperators {
    public static void main(String args[]) {
        int a = 10, b = 11, c = 0;
        c = a & b;
        System.out.println(c);
        
        c = a | b;
        System.out.println(c);

        c = a | b;
        System.out.println(c);

        c = a ^ b;
        System.out.println(c);

        c = a << 2;
        System.out.println(c);

        c = a >> 2;
        System.out.println(c);

        c = ~a;
        System.out.println(c);

        // int x = 10;
        // int y = ~x;
        // System.out.println(y);

    }
}