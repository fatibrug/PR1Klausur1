package at.campus02.iwi.recursion;

public class MultiplicationDemoApp {

    public static void main(String[] args) {


        System.out.println(multiplicate(5, 5));
    }

    public static int multiplicate(int number1, int number2){
        if(number1 == 0 || number2 == 0){
            return 0;
        }else if(number1 == 1) {
             return number2;}
             else if (number2 == 1){
                 return number1;
        } else
        return number2 + multiplicate(--number1, number2);
    }
}
