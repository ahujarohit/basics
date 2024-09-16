import java.util.Scanner;
class Conditional1 {
    public static void main(String args[]) {
        char c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character : ");
        c = in.next().charAt(0);
        if(c >= 65 && c <= 90) 
            System.out.println("Upper Case");
        else if(c >= 'a' && c <= 'z') 
            System.out.println("Lower Case");
        else if(c >= '0' && c <= '9') 
            System.out.println("Digit");
        else
            System.out.println("Special");
        in.close();
    }
}