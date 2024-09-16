class Assignment {
    public static void main(String args[]) {
        //Rule 1: Precedence
        long num = 10 + 10l;
        System.out.println(num);
        double num1 = 10.0 + 10f;
        System.out.println(num1);
        float num2 = 10l + 10f + 10;
        System.out.println(num2);
        int num3 = 10 + 'A'; 
        System.out.println(num3);

        //Range 2 : byte, short, char
        byte b = 127;       //128 Error
        short s = -32768;
        char c = 65535;

        //Rule 3 : Shortcut Assignment
        byte b1 = 127;
        b1 += 2;        //-127      127 + 1 = -128, 127 + 2 = -127
        System.out.println(b1);

        byte b2 = 10;
        byte b3 = 20;
        //ERROR byte b4 = b2 + b3;
        //byte b4 = (byte) (b2 + b3);
        int b4 = b2 + b3;
        System.out.println(b4);

        //ERROR byte b6 = b2 + b3;      //10 + 20 = 30
        byte b6 = 10 + 20;
        System.out.println(b6);


    }
}











