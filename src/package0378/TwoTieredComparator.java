package package0378;

public class TwoTieredComparator implements PersonComparator {

  private final PersonComparator first;
  private final PersonComparator second;

  public TwoTieredComparator(PersonComparator first, PersonComparator second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public int compareTo(Person p1, Person p2) {
    int firstComparison = first.compareTo(p1, p2);
    return (firstComparison != 0 ? firstComparison : second.compareTo(p1, p2));
  }
}
