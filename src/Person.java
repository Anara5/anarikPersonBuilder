public class Person {
    public static final String NO_ADDRESS = "No address";
    public static final int NO_AGE = 0;
    // required fields
    protected String firstName;
    protected String lastName;
    // optional fields
    private String address;
    private int age;

    // constructor. minimum required information should be firstName and lastName
    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // return age + 1 for person who has age
    public int getAge() {
        happyBirthday();
        return this.age;
    }

    // return No address if address is not defined
    public String getAddress() {
        return address != null ? address : NO_ADDRESS;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age > 0) {
            this.age = age + 1;
        }
    }

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