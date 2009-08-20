package bradshawlab1;


        import javax.swing.JOptionPane;

public class CreditCard {

    public static void main(String[] args) {

        // Retrieve User Input
    String user = JOptionPane.showInputDialog("Enter your Credit Card number (no Spaces or dashes): ");
    long creditCard = Long.parseLong(user);

    valid(creditCard);


    }
    //Is card Valid
    public static void valid(long creditCard){

    if (0 == (sumOfEven(creditCard) + sumOfOdd(creditCard))%10){
            
    JOptionPane.showMessageDialog(null, "That is a valid Credit Card!");
    }
    else {

    JOptionPane.showMessageDialog(null, "That is not a valid Credit Card!");
    }
    }

    public static long sumOfEven(long creditCard){

      long sum = 0;
      creditCard = creditCard/10;
      for(;creditCard > 0;){


            long digit =creditCard%10;

            long test = digit * 2;
            
            if (test > 9){
                sum += doubleDigits(test);
            }
            else{
                sum += test;
            }


            //num = num * 10;
            creditCard = creditCard/100;

        }
        return sum;  

    }

    public static long sumOfOdd(long creditCard){


        long sum = 0;
        for(;creditCard > 0;){

            sum += creditCard%10;

            creditCard = creditCard/100;

        }
        return sum;
    }

    public static long doubleDigits(long test){

        long sum = 0;
        for(;test > 0;){

            sum += test%10;

            test = test/10;
        }

            return sum;
}
}
