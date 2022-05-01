public class PersonBuilder {

    private String firstName = null,  lastName = null, address = Person.NO_ADDRESS;
    private int age = Person.NO_AGE;

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    // firstName and lastName are required
    public Person build() {
        // if firstname/lastname is missing
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalStateException("Please enter firstname");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalStateException("Please enter lastname");
        }
        // if age is a negative integer
        if (this.age < 0) {
            throw new IllegalArgumentException("Age should be a positive integer");
        }
        return new Person(firstName, lastName, age, address);
    }
}
