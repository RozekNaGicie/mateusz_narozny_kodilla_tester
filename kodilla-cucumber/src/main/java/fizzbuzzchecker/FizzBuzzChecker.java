package fizzbuzzchecker;

public class FizzBuzzChecker {

    public String numberCheck(int number){
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
         else if(number % 3 == 0)
            return "Fizz";
         else if(number % 5 == 0)
            return "Buuz";
         else
            return "None";
    }
}
