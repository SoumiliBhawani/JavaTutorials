public class CallStackDemo {

    public static void println(String message)
    {
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        println("Main");
        main1();
        // main2();
        // main3();
    }

    // Non static method
    public static void main1()
    {
        println("Inside main 1");
        main2();
    }
    public static void main2()
    {
        println("Inside main 2");
        main3();
    }
    public static void main3()
    {
        println("Inside main 3");
    }
}
