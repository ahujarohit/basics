class EnhancedFor {
    public static void main(String args[]) {
        int num[] = {10, 20, 30, 40, 50};
        for(int x : num)
            System.out.println(x);
        String weekDays[] = {"Monday","Tuesday","Wednesday"};
        //ERROR String s;
        for(String s : weekDays)
            System.out.println(s);
    }
}