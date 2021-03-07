package package0378;

public class SurnameComparator implements PersonComparator {

  @Override
  public int compareTo(Person p1, Person p2) {
    return compareStringsDictionaryOrder(p1.getSurname(), p2.getSurname());
  }
}
