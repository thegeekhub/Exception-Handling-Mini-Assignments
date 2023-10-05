package exception_handling_mini_asssignment3_1;

public class Candidate {
	
	 private int age;

	    public Candidate(int age) {
	        this.age = age;
	    }

	    public void checkEligibilityToVote() throws AgeBelowEighteenException {
	        if (age < 18) {
	            throw new AgeBelowEighteenException();
	        } else {
	            System.out.println("Candidate is eligible to vote.");
	        }
	    }

	public static void main(String[] args) {
		try {
            int candidateAge = 16; 
            Candidate candidate = new Candidate(candidateAge);
            candidate.checkEligibilityToVote();
        } catch (AgeBelowEighteenException e) {
            System.out.println(e.getMessage());
        }
	}

}
