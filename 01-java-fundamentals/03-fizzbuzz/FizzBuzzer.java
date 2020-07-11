public class FizzBuzzer{

    public static void main(String[] args) {

        fizzBuzzTest(15);
        
    }


    public static String fizzBuzz(int value){
        if(value % 3 == 0 && value % 5 == 0)
            return "FizzBuzz";
        if (value % 3 == 0)
            return "Fizz";
        if (value % 5 == 0)
            return "Buzz";
        return Integer.toString(value);
        
    }
    
    public static void fizzBuzzTest(int value){
        for(int i = 0; i < value; i++){
            String result = fizzBuzz(i);
            String output = String.format("Number: %d :: Result: %s", i, result);
            System.out.println(output);
        }
    }
}
