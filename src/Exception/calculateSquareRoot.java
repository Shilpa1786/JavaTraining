package Exception;
//Write a Java method named calculateSquareRoot that takes a non-negative integer as a parameter
// and calculates its square root.
// If the parameter is negative,
// the method should throw an IllegalArgumentException.
public class calculateSquareRoot {
    public static void main(String[] args) {
    double result;
        double nonnegative = 5;
        double negative = -5;
try {
            result = Math.sqrt(negative);
            System.out.println(result);
        }
        catch(IllegalArgumentException ex){
            System.out.println("System throws exception " +ex+ " on negative values entered");

        }
        System.out.println(nonnegative);
    }
}
