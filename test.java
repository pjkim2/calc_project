public class test {
    
    public static void arithmeticTest(){

        int a = 10;
        int b = 2;

        int result1 = arithmetic.addition(a, b);
        System.out.println("Addition result: " + result1);

        int result2 = arithmetic.subtraction(a, b);
        System.out.println("Subtraction result: " + result2);

        int result3 = arithmetic.multiplication(a, b);
        System.out.println("Multiplication result: " + result3);

        int result4 = arithmetic.division(a, b);
        System.out.println("Division result: " + result4);
    }
    
    public static void main(String[] args){
        arithmeticTest();
    }

}