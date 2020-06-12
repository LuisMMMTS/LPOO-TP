import java.util.Objects;

public abstract class Person extends User implements Comparable<Person>{
    private String name;
    private int age=0;

    public Person(String name) {
        super(name,0);
        this.name = name;
    }

    public Person(String name, int age) {
        super(name,age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
