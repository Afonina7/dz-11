public class Main {

    public static void main(String[] args) {
        Woman jane = new Woman("Jane", "Gross", 42);
        Man john = new Man("John", "Dilan", 68);

        System.out.println("Before partnership:");
        printPersonDetails(jane);
        printPersonDetails(john);

        john.setPartner(jane);
        jane.registerPartnership(john);

        System.out.println("After partnership:");
        printPersonDetails(john);
        printPersonDetails(jane);

        jane.deregisterPartnership(true);

        System.out.println("After divorce:");
        printPersonDetails(john);
        printPersonDetails(jane);
    }

    public static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Retired: " + person.isRetired());
        if (person.getPartner() != null) {
            System.out.println("Partner: " + person.getPartner().getFirstName() + " " + person.getPartner().getLastName());
        } else {
            System.out.println("Partner: None");
        }
        System.out.println("--------------------");
    }
}
