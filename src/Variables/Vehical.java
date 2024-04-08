package Variables;

//Using the super Keyword
//Create a parent class called Vehicle with instance variables for speed and year.
// The Vehicle class should have a constructor to initialize these variables and a method to display
// the details of the vehicle.Next, create a child class called Car that extends the Vehicle class.
// The Car class should have an additional instance variable for model and a constructor to initialize all the variables (including the ones inherited from the parent class).
// Override the display method to include the car's model in the output.
public class Vehical {
    public int speed;
    public int year;

    public Vehical(int sp, int yr) {
        this.speed = sp;
        this.year = yr;
    }
void disply(){
    System.out.println(+this.speed+" " +this.year);
}
    }
  class Car extends Vehical {
      public String model;
     Car(int sp, int yr,String mod){
         super(sp,yr);
         this.model=mod;

      }
      public void displayDetails()
      {
          super.disply();

          System.out.println("Model:  "+this.model);
      }

      public static void main(String[] args) {
          Car as6 = new Car(10,2023,"i10");
          as6.displayDetails();

      }


}



