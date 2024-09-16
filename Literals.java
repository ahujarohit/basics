class Literals {
    public static void main(String args[]) {
        int num1 = 1__2____3;           //Decimal
        System.out.println(num1);
        int num2 = 012_3;                //Octal
        System.out.println(num2);
        int num3 = 0X12_3a_F_c;                //Hexa
        System.out.println(num3);
        //ERROR int num4 = 0X12_3a_F_cL;                //Hexa
        long num4 = 0X12_3a_F_cL;                //Hexa
        System.out.println(num4);
        // ERROR float a = 1.23;
        float a = 1.23f;
        System.out.println(a);
        double b = 1.23;
        System.out.println(b);
        double b1 = 1.23d;
        System.out.println(b1);
        //  ERROR boolean bool1 = True;        
        boolean bool1 = true;        
        System.out.println(bool1);
        char c = '\u0023';
        System.out.println(c);
        String str = "hell\u0001 w\u0001rld";
        System.out.println(str);
        String str1 = """
                        This is a new World
                        This <b>is </b> a new World
                        This "is" a new World
                        This is a new World
                        
                        """;
        System.out.println(str1);
    }
}









