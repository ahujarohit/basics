class Switch {
    public static void main(String args[]) {
        boolean num = true;
        switch(num) {
            default : System.out.println("Not 10");  
                        break;
            case true : System.out.println("10");
                        break;
            
        }
    }
}
/* 
1. duplicate cases results in compilation error
2. it can be in any sequence (break)
3. switch supports byte, short, char, int, boolean, enum
4. Java 5 onwards switch supports String

*/