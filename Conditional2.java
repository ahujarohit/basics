import java.util.Scanner;
class Conditional2 {
    public static void main(String args[]) {
        char c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character : ");
        c = in.next().charAt(0);
        switch(c) {
            case 'A' :
            case 'a' : System.out.println("Vowel A.");
                        break;
            case 'e' : System.out.println("Vowel E.");
                        break;                        
            case 'i' : System.out.println("Vowel I.");
                        break;                        
            case 'o' : System.out.println("Vowel O.");
                        break;                        
            case 'u' : System.out.println("Vowel U.");
                        break;                    
            default  :  System.out.println("Consonant");
        }
        in.close();
    }
}