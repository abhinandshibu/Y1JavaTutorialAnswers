package package0378;

public class Person {

  private final String forename;
  private final String surname;
  private final String phoneNo;

  public Person(String forename, String surname, String phoneNo) {
    this.forename = forename;
    this.surname = surname;
    this.phoneNo = phoneNo;
  }

  public String getForename() {
    return forename;
  }

  public String getSurname() {
    return surname;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  @Override
  public String toString() {
    return "Person{"
        + "forename='"
        + forename
        + '\''
        + ", surname='"
        + surname
        + '\''
        + ", phoneNo='"
        + phoneNo
        + '\''
        + '}';
  }
}
