import org.testng.annotations.*;
import org.testng.Assert;

public class ManAndWomenTests {

    @Test
    public void manAndWomanTests() {
        Man man = new Man("Bob", "Boui", 35);
        Woman woman = new Woman("Gretta", "Tumberg", 29);

        //////// Man assertions ////////
        System.out.println("//////// Man assertions ////////");

        Assert.assertEquals(man.getFirstName(), "Bob", "First name is incorrect");
        Assert.assertEquals(man.getLastName(), "Boui", "Last name is incorrect!");
        Assert.assertEquals(man.getAge(), 35, "Age is incorrect!");

        man.setAge(65);
        Assert.assertEquals(man.getAge(), 65);
        System.out.println("Is Retired: " + man.isRetired());
        Assert.assertTrue(man.isRetired(), "Is not retired");

        man.setAge(64);
        Assert.assertEquals(man.getAge(), 64);
        System.out.println("Is Retired: " + man.isRetired());
        Assert.assertFalse(man.isRetired(), "Is retired");

        man.setAge(70);
        Assert.assertEquals(man.getAge(), 70);
        System.out.println("Is Retired: " + man.isRetired());
        Assert.assertTrue(man.isRetired(), "Is not retired");

        System.out.println("--------------------");

        System.out.println("Default information for Man: ");
        Main.printPersonDetails(man);
        man.registerPartnership(woman);
        Assert.assertEquals(woman.getLastName(), man.getLastName(), "Last name is incorrect!");
        System.out.println("Information for Man after register partnership: ");
        Main.printPersonDetails(man);

        man.deregisterPartnership(false);
        Assert.assertEquals(woman.getLastName(), man.getLastName(), "Last name is incorrect!");
        System.out.println("Check on false revert last name: ");
        Main.printPersonDetails(man);

        System.out.println("Information for Man after true de register partnership: ");
        man.deregisterPartnership(true);
        Assert.assertEquals(man.getLastName(), "Boui", "Last name is incorrect!");
        Main.printPersonDetails(man);


        //////// Woman assertions ////////
        System.out.println("//////// Woman assertions ////////");

        Assert.assertEquals(woman.getFirstName(), "Gretta", "First name is incorrect!");
        Assert.assertEquals(woman.getLastName(), "Tumberg", "Last name is incorrect!");
        Assert.assertEquals(woman.getAge(), 29, "Age is incorrect!");

        woman.setAge(60);
        Assert.assertEquals(woman.getAge(), 60);
        System.out.println("Is Retired: " + woman.isRetired());
        Assert.assertTrue(woman.isRetired(), "Is not retired");

        woman.setAge(59);
        Assert.assertEquals(woman.getAge(), 59);
        System.out.println("Is Retired: " + woman.isRetired());
        Assert.assertFalse(woman.isRetired(), "Is retired");

        woman.setAge(69);
        Assert.assertEquals(woman.getAge(), 69);
        System.out.println("Is Retired: " + woman.isRetired());
        Assert.assertTrue(woman.isRetired(), "Is not retired");

        System.out.println("--------------------");

        System.out.println("Default information for Woman: ");
        Main.printPersonDetails(woman);
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getLastName(), man.getLastName(), "Last name is incorrect!");
        System.out.println("Information for Woman after register partnership: ");
        Main.printPersonDetails(woman);

        woman.deregisterPartnership(false);
        Assert.assertEquals(woman.getLastName(), man.getLastName(), "Last name is incorrect!");
        System.out.println("Check on false revert last name: ");
        Main.printPersonDetails(woman);

        System.out.println("Information for Woman after true de register partnership: ");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), "Tumberg", "Last name is incorrect!");
        Main.printPersonDetails(woman);
    }
}
