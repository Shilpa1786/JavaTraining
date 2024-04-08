package Variables;

public class ThisSimpleProgram {

        public int number;

        // Constructor
        public ThisSimpleProgram(int num) {
            this.number = num; // Here, 'this.number' refers to the instance variable 'number' of the current object
        }

        // Method to print the value of the instance variable
        public void printNumber() {
            System.out.println("Number: " + this.number); // Here, 'this.number' refers to the instance variable 'number' of the current object
        }

        public static void main(String[] args) {
            ThisSimpleProgram obj1 = new ThisSimpleProgram(10);
            ThisSimpleProgram obj2 = new ThisSimpleProgram(20);

            obj1.printNumber(); // Output: Number: 10
            obj2.printNumber(); // Output: Number: 20
        }
    }
/*In the MyClass constructor and printNumber method, you can see the use of this to refer to the instance
 variable number of the current object. This makes it clear that
you're referring to the member variable of the class rather than any local variable or
parameter with the same name.*/

