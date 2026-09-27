package lib.src;

public class test_methods {
    
    public static String read(String[] input){
        
        // for now assume simple 3 part expressions a + b / c - d / e * f / g div h

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[2]);

        char c = input[1].charAt(0);
        int symbol = c;

        // addition = 43    subtraction = 45    multiplication = 42     division = 47
        int result = -1;
        switch (symbol) {
            case 43: //addition
                result = arithmetic.addition(a, b);
                break;
            case 45: //subtraction
                result = arithmetic.subtraction(a, b);
                break;
            case 42: //multiplication
                result = arithmetic.multiplication(a, b);
                break;
            case 47: //division
                result = arithmetic.division(a, b);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("Result: " + result);

        return null;
    }

}