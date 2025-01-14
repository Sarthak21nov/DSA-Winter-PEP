
// Class 1 - DSA
public class Main {

    public static void PrintNumber(int num){
        if(num < 1){
            return;
        }
        System.out.println(num);
        num--;
        PrintNumber(num);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("Sum: " + (a+b));
        System.out.println("A/B: " + (a/b));

        String s = "LPU";
        System.out.println(s);

        if(a>=10){
            System.out.println("A is Greater than or equal to 10");
        } else{
            System.out.println("A is less than 10");
        }
        System.out.println();
        PrintNumber(10);

    }
}
