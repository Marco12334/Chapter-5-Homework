public class Address {
    String name;
    String streetAddress;
    String city;
    String state;

    public void nameAddress(String name, String address) {
        this.name = name;
        this.streetAddress = address;
    }

    public void cityState(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public static void main(String[] args) {
        Address userAddress = new Address();
        userAddress.nameAddress("John Doe", "1234 Java St.");
        userAddress.cityState("Codeville", "JA");
        System.out.println(userAddress.name + "\n" + userAddress.streetAddress + "\n" + userAddress.city + ", " + userAddress.state);
    }
}
