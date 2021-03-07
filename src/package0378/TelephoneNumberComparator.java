package package0378;

public class TelephoneNumberComparator implements PersonComparator {

  @Override
  public int compareTo(Person p1, Person p2) {
    return compareStringsDictionaryOrder(p1.getPhoneNo(), p2.getPhoneNo());
  }
}
