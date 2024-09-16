class LoopingStructure {
    public static void main(String args[]) {
        int i;
        i = 1;      //initialization
        while(i <= 100) {   //condition
            System.out.print("\t" + i);
            i++;        //re-init
        }
        do {
            System.out.print("\t" + i);
            i++;        //re-init
        } while (i <= 200);
        for(; i <= 300; i++)
            System.out.print("\t" + i);
    }
}