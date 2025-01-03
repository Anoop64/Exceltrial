package voting;

public class Voting extends Exception {

	Voting(String s) {
		super(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=-17;
		try {
			if (age<0) {
				throw new Voting("Invalid");
			}
			else if(age<18)
				throw new Voting("Not Eligible");
				else
					System.out.println("Eligible for Voting");
		} catch(Voting e) {
			System.out.println(e);
		}
		
	}

}
