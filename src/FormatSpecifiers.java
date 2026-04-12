public class FormatSpecifiers {

 //  Format Specifiers
//            %s	String	"Hello"
//            %d	integer , short ,  byte and long
//            %f	Floating-point number	3.141593 , double .
//            %.2f	Floating-point with 2 decimal places	3.14
//            %c	Single character	'A'
//            %b	Boolean	true
//            %x	Integer in hexadecimal	2a
//            %o	Integer in octal	52
//            %n	Newline (platform-independent)	line break


//          byte	8	-128 to 127	byte b = 10; no unsigned version
//          short	16	-32,768 to 32,767	short s = 1000; no unsigned version
//          int	32	-2 billion to 2 billion	int i = 50000; no unsigned version
//          long	64	Very large integers	long l = 1000000000L; no unsigned version
//          float	32	~7 decimal digits precision	float f = 3.14f; no unsigned version
//          double	64	~15 decimal digits precision	double d = 3.14159265359; no unsigned version
//          char	16	Single Unicode character	char c = 'A'; signed is possible 0 to 65535 2^16
//          boolean	1 (JVM dependent)	true or false	boolean flag = true;

    public static void main(String[] args)
    {
        String name= "Soumili";
        byte b = 127;
        long number = 1000000000L;
        double a = 34.20;
        float secondNumber = 10.120909f;
        float pi= 3.1467766f;
        char ch= 'A';
        boolean isAdult= true;
        short hex = 42;
        short octal = 16;

        // print all with printf
        System.out.printf(" %s %n", name);
        System.out.printf("%d %n", b);
        System.out.printf("%d %n", number);
        System.out.printf("%f %n", a);
        System.out.printf("%f %n", secondNumber);
        System.out.printf("%.4f %n", pi);
        System.out.printf("%c %n", ch);
        System.out.printf("%b %n", isAdult);
        System.out.printf("%d %n", hex);
        System.out.printf("%d %n", octal);

        /*
         Soumili
            127
            1000000000
            34.200000
            10.120909
            3.1468
            A
            true
            42
            16
         */
    }
}
