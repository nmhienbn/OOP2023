package Week11;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /** Hien. */
    public Person() {
    }

    /** Hien. */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /** Hien. */
    public String getName() {
        return name;
    }

    /** Hien. */
    public void setName(String name) {
        this.name = name;
    }

    /** Hien. */
    public int getAge() {
        return age;
    }

    /** Hien. */
    public void setAge(int age) {
        this.age = age;
    }

    /** Hien. */
    public String getAddress() {
        return address;
    }

    /** Hien. */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person p) {
        int t = this.name.compareTo(p.name);
        if (t == 0) {
            return this.age - p.age;
        }
        return t;
    }
}
