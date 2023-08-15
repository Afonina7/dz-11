public class Woman extends Person {

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void registerPartnership(Man husband) {
        setLastName(husband.getLastName());
        setPartner(husband);
    }
}
