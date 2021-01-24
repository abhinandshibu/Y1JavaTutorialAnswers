package packaged363;

import java.util.StringTokenizer;

public class Person {

    private final Name name;
    private final String nationalInsuranceNumber;
    private final Date dateOfBirth;
    private final Address address;

    public Person(Name name, String nationalInsuranceNumber,
                  Date dateOfBirth, Address address) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "DOB: " + dateOfBirth + "\n"
                + "Address: " + address + "\n"
                + "NI: " + nationalInsuranceNumber;
    }

}
