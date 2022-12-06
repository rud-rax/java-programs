public class datatypes1 {
    public static void main(String[] args) {
        // BYTE 
        byte b1 = 2 ;
        System.out.println("The byte variable is assigned to " + b1);
        System.out.println("Byte Value Range is from "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("Byte Size is "+Byte.SIZE);

        // SHORT
        short s1 = 3 ;
        System.out.println("The short variable is assigned to " + s1);
        System.out.println("Short Value Range is from "+ Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Short Size is "+Short.SIZE);

        // INTEGER
        int i1 = 9 ;
        System.out.println("The integer variable is assigned to " + i1);
        System.out.println("Integer Value Range is from "+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Integer Size is "+ Integer.SIZE);

        // LONG
        long l1 = 100L ;
        System.out.println("The long variable is assigned to "+ l1);
        System.out.println("Long Value Range is from "+Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Long Size is " + Long.SIZE);

        long l2 = 2_147_483_647_234L ;
        System.out.println("The second long variable is assigned to " + l2);
        // it is necessary to end the long int wirh suffix "L" because Java compiler will treat it as an integer by default

        

    }
}
