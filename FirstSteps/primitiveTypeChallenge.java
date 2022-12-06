public class primitiveTypeChallenge {
    public static void main(String[] args) {
        byte myByteNum = 100 ;
        short myShortNum = 32_000 ;
        int myIntNum = 2_000_000_000 ;
        long myLongNum = 50_000L + 10L * (myByteNum + myShortNum + myIntNum) ;

        // long myLongNum = (long) (50_000 + 10 * (myByteNum + myShortNum + myIntNum)) ;


        System.out.println("The long variable is assigned to = " + myLongNum);
    }
}
