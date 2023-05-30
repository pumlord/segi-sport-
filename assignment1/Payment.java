package assignment1;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Payment extends Booking{
    private String date;
    private String time;
    private double pay;

    public Payment(Package package1, User user, double pay) {
    	super (package1, user);
    	this.pay = pay;
    }
    
	public LocalDate getDate() {
    	LocalDate date = LocalDate.now();
    	return date;
    }
    
    public String getTime() {
    	time = new SimpleDateFormat("HH: mm: ss").format(Calendar.getInstance().getTime());
    	return time;
    }

    public void setPay (double pay) {
    	this.pay = pay;
    }
    
    public double getPay () {
    	return pay;
    }
    
    public double calculateBalance () {
    	return pay - super.getPackage1().calculateTotal(super.getPackage1().getPrice(), super.getPackage1().getDuration());
    }

    @Override
    public String toString() {
        return ("\nDate: " + getDate() +
        		"\nTime: " + getTime() + 
                "\nMoney received: " + pay + 
                "\nMoney return: " + calculateBalance() +
                "\nPackage name: " + super.getPackage1().getpName() +
                "\nUserName: " + super.getUser().getUserName() + 
                "\nUser ID: " + super.getUser().getUserID());
    }
}
