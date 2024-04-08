package controlflowstatements;

public class NestedIF {

    public static void main(String[] args) {

        String address = "Delhi,India";
        if (address.endsWith("India")) {
            if (address.startsWith("Merath")) {
                System.out.println("Your City is Merath");

            } else if (address.contains("Mumbai")) {
                System.out.println("Your City is Mumbai");

            } else {
                System.out.println(address);
            }
        }
    }
}
