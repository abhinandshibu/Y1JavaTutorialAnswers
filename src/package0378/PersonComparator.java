package package0378;

public interface PersonComparator {

  int compareTo(Person p1, Person p2);

  default int compareStringsDictionaryOrder(String s1, String s2) {
    if (s1.compareTo(s2) > 0) {
      return 1;
    } else if (s1.compareTo(s2) < 0) {
      return -1;
    } else {
      return 0;
    }
  }
}
