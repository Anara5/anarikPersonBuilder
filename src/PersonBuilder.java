import java.util.Objects;

public class PersonBuilder {

    protected String firstName;
    protected String lastName;
    private String address = Person.NO_ADDRESS;
    protected int age = Person.NO_AGE;

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder age(int age) {
        // if age is a negative integer
        if (age < 0) {
            throw new IllegalArgumentException("Age should be a positive integer");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    // firstName and lastName are required
    public Person build() {
        // if firstname is missing
        Objects.requireNonNull(firstName, "Please enter firstname");
        // if lastname is missing
        Objects.requireNonNull(lastName, "Please enter lastname");
        return new Person(firstName, lastName, age, address);
    }
}
