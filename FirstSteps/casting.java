public class casting {
    public static void main(String[] args) {
        short myMinShortValue = Short.MIN_VALUE ; int myMinIntValue = Integer.MIN_VALUE ;
        byte myMinByteValue = Byte.MIN_VALUE ;

        short firstShort = 1 ; int firstInteger = 2 ; 

        byte firstByte = 1 , secondByte = 2 ;

        int myTotal = (myMinIntValue / 2) ;

        byte newByteValue = (byte) (myMinByteValue / 2) ;

        short myNewShortValue = (short) (myMinShortValue / 2);

    }
    
}
