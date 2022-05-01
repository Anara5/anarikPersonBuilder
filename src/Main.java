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
                    .firstName("Alex")
                    .lastName("Gert")
                    .age(38)
                    .address("Stockholm")
                    .build();
            Person daughter = dad.newChildBuilder()
                    .firstName("Elin")
                    .build();
            System.out.println("Dad " + dad + " has a daughter " + daughter);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // age invalid
            Person grandma = new PersonBuilder()
                    .firstName("Kate")
                    .lastName("Granny")
                    .age(100)
                    .build();
            System.out.println("Grandma " + grandma);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
