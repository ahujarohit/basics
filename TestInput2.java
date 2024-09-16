import java.util.Scanner;
class TestInput2 {
    public static void main(String args[]) {
        float radius, area = 0f, cir = 0f;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        radius = in.nextFloat();
        // area = 3.14f * radius * radius;
        area = (float) (Math.PI * Math.pow(radius, 2));
        cir = (float) (2 * Math.PI * radius);
        System.out.println("Area : " + area + "\nCircumference : " + cir);
        in.close();        
    }
}








