package student_work;

public class Recursion {
    public static void main(String[] args){
        RecursionPrax rec = new RecursionPrax();
        System.out.println(rec.factorial(10));

    }


}

class RecursionPrax {
    int factorial(int num){
        if (num == 0) {

        }
        return num * factorial(num -1 );

    }
}
