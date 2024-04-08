package OOPS;

class Vegies {
    int fruits, leafyvegies;

    public void setFruits(int fruits) {
        if(fruits>=10){
        this.fruits = fruits;
        }
        else {
            System.out.println("Its not Fruit");
        }
    }

    public int getFruits() {
        return fruits;
    }


}

public class GetterSetterwithlimitedValues {
    public static void main(String[] args) {
        Vegies v1 =new Vegies();
        v1.setFruits(10);
        System.out.println("Vegies are:-" +v1.getFruits());

    }
}
