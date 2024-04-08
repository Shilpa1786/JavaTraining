package Method;

//Write a Java method named findMax that takes an array of integers as a parameter and finds the maximum value in the array.
// The method should have a return type of int and should return the maximum value.
public class MaxMinValue {
    public static void main(String[] arg) {

        int arr[] = {10, 20, 30, 40, 80};
        int max = arr[0];
        int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }

            }
            System.out.println("Max value " + max);
        }
    }

