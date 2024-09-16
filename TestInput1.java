import java.util.Scanner;
class TestInput1 {
    public static void main(String args[]) {
        String name, address;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        name = obj.nextLine();
        System.out.println("Enter Your Address : ");
        address = obj.nextLine();
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        obj.close();
    }
} 