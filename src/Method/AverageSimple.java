package Method;

public class AverageSimple {
    public static void main(String[] args) {

        int n = 5;
      int result = 0;
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        for(int i=0; i<n;i++ ){
            result =result+a[i];
            System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")  is ="+result/n);

        }
    }
}
