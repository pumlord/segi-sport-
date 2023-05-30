package assignment1;

public class Package {
    private String pname;
    private String courtname;
    private double price;
    private double duration;
	
	public Package(String pname, String courtname, double price, double duration) {
        this.pname = pname;
        this.courtname = courtname;
        this.price = price;
        this.duration = duration;
    }
	
	public String getpName () {
		return pname;
	}
	
	public double getPrice () {
		return price;
	}
	
	public double getDuration ()  {
		return duration;
	}
	
	public double calculateTotal (double price, double duration) {
		return price * duration;
	}

    @Override
    public String toString() {
        return ("Package name: " + pname + 
                "\nCourt name: " + courtname + 
                "\nPrice: " + price + 
                "\nDuration: " + duration + 
                "\nTotal: " + calculateTotal(price, duration));
    }
}
