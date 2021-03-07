package package0378;

public class ForenameComparator implements PersonComparator {

  public ForenameComparator() {}

  @Override
  public int compareTo(Person p1, Person p2) {
    return compareStringsDictionaryOrder(p1.getForename(), p2.getForename());
  }
}
