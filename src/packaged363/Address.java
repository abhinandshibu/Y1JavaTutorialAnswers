package packaged363;

public class Address {

    private final int houseNumber;
    private final String address1;
    private final String address2;
    private final String postCode;

    public Address(int houseNumber, String address1, String address2, String postCode) {
        this.houseNumber = houseNumber;
        this.address1 = address1;
        this.address2 = address2;
        this.postCode = postCode;
    }

    public boolean sameAddress(Address other) {
        return houseNumber == other.houseNumber
                && address1.equals(other.address1)
                && address2.equals(other.address2)
                && postCode.equals(other.postCode);
    }

    @Override
    public String toString() {
        return houseNumber + " " + address1 + ", " + address2 + ", " + postCode;
    }

}
