package bradshawlab1;

public class PerfectNumbers {

    public static void main(String[] args) {


        int testValue = 0;
        int divisor = 0;
        //Start looping through numbers
        for (int num = 0; num < (10000); num++) {
            int test = 0;

            testValue = (testValue + 1);

            for (int num1 = 1; num1 < testValue; num1++) {

                divisor = testValue % num1;

                if (divisor == 0) {
                    test = (test + num1);
                }
            
            }
            if (test == testValue) {
                System.out.println("Perfect Number: " + testValue);
        }
        }
    }
}
