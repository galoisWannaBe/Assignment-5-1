import java.util.Scanner;

public class DenominatorExceptionTest {

    public static void main(String[] args) {

        int numerator = 0;
        int denominator = 0;
        Fraction fraction;
        Scanner sc = new Scanner(System.in);

        while(denominator == 0){

            System.out.println("Please enter the numerator");
            numerator = sc.nextInt();
            System.out.println("Please enter the denominator");
            denominator = sc.nextInt();

            try{

                fraction = new Fraction(numerator, denominator);

            } catch (DenominatorIsZeroException d) {

                System.err.print(d);

            }
        }
    }

}
