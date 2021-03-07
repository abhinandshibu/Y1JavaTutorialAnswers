package package0378;

import java.util.Set;

public class Demo {

  public static Person findMin(Set<Person> people, PersonComparator comparator) {
    if (!people.iterator().hasNext()) {
      return null;
    }
    Person min = people.iterator().next();

    for (Person person : people) {
      if (comparator.compareTo(person, min) < 0) {
        min = person;
      }
    }
    return min;
  }

  public static void main(String[] args) {

    Person p1 = new Person("Abhinand", "Shibu", "07414253245");
    Person p2 = new Person("Murray", "Dooleys", "42069012345");
    Person p3 = new Person("Jarvee", "Terre", "012345678912");
    Person p4 = new Person("Abhinandan", "Shibu", "04923948192");
    Person p5 = new Person("Abhinand", "Shibu", "04923948192");

    ForenameComparator fc = new ForenameComparator();
    // p1 is "less than" p2 as "A" < "M"
    System.out.println(fc.compareTo(p1, p2));

    SurnameComparator sc = new SurnameComparator();
    System.out.println(findMin(Set.of(p1, p2, p3), sc));

    TwoTieredComparator sfc = new TwoTieredComparator(sc, fc);
    System.out.println(sfc.compareTo(p1, p4));

    TelephoneNumberComparator tc = new TelephoneNumberComparator();
    TwoTieredComparator sftc = new TwoTieredComparator(sfc, tc);
    System.out.println(sftc.compareTo(p1, p5));
  }
}
