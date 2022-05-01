public class Person {
    public static final String NO_ADDRESS = "No address";
    public static final int NO_AGE = 0;
    private final String firstName;
    private final String lastName;
    private final String address;
    private int age;

    // constructor
    // minimum required information should be firstName and lastName
    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    // if person has age
    public boolean hasAge() {
        return Person.this.age > 0;
    }

    // if person has address
    /*public boolean hasAddress(Person p) {
        return Objects.equals(p.address, this.address);
    }

    public String getName() {
        return firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }*/

    // return age + 1 for person who has age
    public int getAge() {
        happyBirthday();
        return this.age;
    }

    // return No address if address is not defined
    /*public String getAddress() {
        return address != null ? address : NO_ADDRESS;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public void happyBirthday() {
        if (hasAge()) {
            this.age = age + 1;
        }
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/

    // child getting its parents lastname and address
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().lastName(lastName).address(address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + getAge() +
                ", address='" + address + '\'' +
                '}';
    }
}