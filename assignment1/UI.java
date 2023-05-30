package assignment1;

public class UI {
	private int choice;
    private int action;
    
    public String toString(){
        return ("Please select an action: " +
                "1. Add court " +
                "2. Add package " +
                "3. Show courts " +
                "4. Show packages " +
                "5. User booking " +
                "6. Show booking " +
                "7. Payment " +
                "0. Exit ");
    }
    
	public String toString1() {
		return ("Welcome to SEGI SCS\n"+
				"1. Existing account\n" +
	                            "2. Register an account");
	                          
	}
	
	public String toString2() {
		return ("Are you a student/staff or outsider?\n"+
				"Press 1 for student/staff, 2 for outsider");
	}
	
	public String toString3() {
		return ("Welcome to SEGI SCS\n"+
				"--------------------------\n"+
				"Press numbers to continue\n"+
				"1 To view information about court\n"+
				"2 To view information about packages\n"+
				"3 To view information about booking\n"+
				"4 To view information about payment\n"+
				"5 To view information about report\n"+
				"0 To close program");
	}
}
