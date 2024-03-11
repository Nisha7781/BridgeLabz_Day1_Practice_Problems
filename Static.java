class Static 
{
    static int a = 10;

    static {
        System.out.println("Static block executed.");
    }

    static void add() {
        int b = 15;
        int c = 5;
        int d = b+c;
        System.out.println("Addition is: "+d);
    }

    public static void main(String[] args) {
        System.out.println("Static variable: " + a);
        add();
    }
}
