package assignment1;

public class Booking {
    private Package package1;
    private User user;

    public Booking(Package package1, User user) {
        this.package1 = package1;
        this.user = user;
    }

	public Package getPackage1() {
        return package1;
    }

    public void setPackage1(Package package1) {
        this.package1 = package1;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return("Your booking details are as below: " +
                "\nUser: " + user +
                "\nBooking: " + package1);
    }

}
