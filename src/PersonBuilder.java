public class PersonBuilder {

    protected String firstName;
    protected String lastName;
    private String address = Person.NO_ADDRESS;
    protected int age = Person.NO_AGE;

    public PersonBuilder firstName(String firstName) {
        // if firstname is missing
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalStateException("Please enter firstname");
        }
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        // if lastname is missing
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalStateException("Please enter lastname");
        }
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
        return new Person(firstName, lastName, age, address);
    }
}
