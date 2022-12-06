// package FirstSteps;

public class decimals {
    public static void main(String[] args) {

        // FLOAT
        float myFloatNum = 4.89F ;
        System.out.println("The float variable is assigned to a value of " + myFloatNum);
        System.out.println("Float Value Range is from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        // DOUBLE
        double myDoubleNum = 4.90343223;
        System.out.println("The double variable is assigned to a value of "+ myDoubleNum);
        System.out.println("Double Value Range is from "+Double.MIN_VALUE + " to "+ Double.MAX_VALUE);

        int myIntValue  = 5 ;
        float myFloatValue = 5 ;
        double myDoubleValue = 5 ;
        System.out.println("Integer Value : " + myIntValue);
        System.out.println("Float Value : " + myFloatValue);
        System.out.println("Double Value : " + myDoubleValue);

        float mySecondFloatValue = 5.2345f ;
        System.out.println("Second Float Value : " + mySecondFloatValue);

        float myThirdFloatValue = (float) 6.825323 ; 
        System.out.println("Third Float Value : " + myThirdFloatValue);
        
    }
}
