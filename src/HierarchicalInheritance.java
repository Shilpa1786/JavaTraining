//Hierarchical Inheritance have same parents for two classes and user have two create different object for both the classes to

class Shapes {
    void print() {
        System.out.println("Shape");
    }
}
        class Triangle extends Shapes {
            void printTri() {
                System.out.println("Triangle");
            }
        }


        class Square extends Shapes {
            void printSquare() {
                System.out.println("Square");
            }
        }


        public class HierarchicalInheritance {
            public static void main(String[] args) {
                Square sq = new Square();
                sq.printSquare();
                sq.print();


                Triangle tr = new Triangle();


                tr.printTri();
                tr.print();


            }
        }





