package exception_handling_mini_asssignment3_1;

public class AgeBelowEighteenException extends Exception {
    public AgeBelowEighteenException() {
        super("Not eligible to vote since age is less than 18");
    }
}

