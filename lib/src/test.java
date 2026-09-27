package lib.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    
    public static void main(String[] args) throws IOException{
        //arithmeticTest();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String s = r.readLine();
        System.out.println("Buffered reader input: " + s);

        String[] w = s.split(" ");
        for (int i = 0; i < w.length; i++){
            System.out.println(w[i]);
        }

        test_methods.read(w);
        

    }

}