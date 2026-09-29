package lib.src;
public class arithmetic {
    
    public static int addition(int a, int b){  return a+b;  }

    public static int subtraction(int a, int b){  return a-b;  }

    public static int multiplication(int a, int b){  return a*b;  }

    public static int division(int a, int b){  return a/b;  }

    public static int power(int a, int b){   int c = a; for (int i = 1; i < b; i++){a = a*c;}   return a;}

}
