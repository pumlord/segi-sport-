package assignment1;

public class Court {
	private String cname;
	   
    public Court(String cname){
        this.cname = cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return ("Court name: " + cname);
	}
}
