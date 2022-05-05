public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .firstName("Anna")
                .lastName("Wolf")
                .age(34)
                .address("Oslo")
                .build();
        Person son = mom.newChildBuilder()
                .firstName("Richard")
                .build();
        System.out.println(mom + " has a son, " + son);

        try {
            // missing required fields
            Person dad = new PersonBuilder()
                    .build();
            System.out.println(dad);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // age invalid
            new PersonBuilder()
                    .age(100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
