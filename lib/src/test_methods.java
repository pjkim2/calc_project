package lib.src;

public class test_methods {

    public static void stack_read(String[] input){

        //assume simple expression of any length: a + b * c / d
        //attempt to implement pemdas priority (currently only multiplication and division)


        //create an array of all operators and operands
        // ie. a[] = [1, +, 2, -, 3, *, 4, /, 5]
        //check for pemdas conditions (i.e. mult/div)
        // solve each pemdas condition
        // ie. a[] = [1, +, 2, -, 12, /, 5]
        // ie. a[] = [1, +, 2, -, 2]    (int math)
        // solve other conditions
        // ie. a[] = [3, -, 2]
        // ie. a[] = [1]
        // solve conditions by:
        //  1. locate pemdas condition: a[5]
        //  2. pass a[4-6] into arithmetic & solve
        //  3. return answer
        //  4. move into new shortened array
        // ie. a[] = [1, +, 2, -, 3, *, 4, /, 5] -> b[] = [1, +, 2, -, 12, /, 5]
        //  5. continue on new array


        

    }

    public static boolean check_md(String[] input){
        boolean check = false;
        for (int i = 0; i < input.length; i++){
            char c = input[i].charAt(0);
            int symbol = c;
            if (symbol == 42 || symbol == 47){
                check = true;
            }
        }
        return check;
    }
    
    public static void simple_read(String[] input){
        
        //assume simple 3 part expressions a + b / c - d / e * f / g div h

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[2]);

        char c = input[1].charAt(0);
        int symbol = c;

        // addition = 43    subtraction = 45    multiplication = 42     division = 47
        int result = -1;
        switch (symbol) {
            case 43 -> result = arithmetic.addition(a, b);
            case 45 -> result = arithmetic.subtraction(a, b);
            case 42 -> result = arithmetic.multiplication(a, b);
            case 47 -> result = arithmetic.division(a, b);
            case 94 -> result = arithmetic.power(a, b);
            default -> System.out.println("Invalid operation");
        }

        System.out.println("Result: " + result);

    }

} 