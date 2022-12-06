public class casting {
    public static void main(String[] args) {
        short myMinShortValue = Short.MIN_VALUE ; int myMinIntValue = Integer.MIN_VALUE ;
        byte myMinByteValue = Byte.MIN_VALUE ;

        short firstShort = 1 ; int firstInteger = 2 ; 
        System.out.println("First Short : " + firstShort);
        System.out.println("First Integer : " + firstInteger);



        byte firstByte = 1 , secondByte = 2 ;
        System.out.println("First Byte : " + firstByte);
        System.out.println("Second Byte : " + secondByte);
        int myTotal = (myMinIntValue / 2) ;
        System.out.println("Integer Value : " + myTotal);

        byte newByteValue = (byte) (myMinByteValue / 2) ;
        System.out.println("Byte Value : " + newByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("New Short Value : " + myNewShortValue);



    }
    
}
