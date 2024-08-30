public class OrganizationTest {

    public static void main(String[] args) {
        // Create People
        People people = new People();
        people.setId(1);
        people.setName("Rahul");

        // Create Account
        Accounts accounts = new Accounts();
        accounts.setType(1);
        accounts.setName("Company-Accounts");
        accounts.setBalance(100000);

        // Create Organization
        Organization organization = new Organization();
        organization.setName("OnlineTutorialsPoint");
        organization.setCaption("Aggregation Vs Composition Tutorials");
        organization.setAccounts(accounts);
        organization.setPeople(people);

        System.out.println("Organization : " + organization);
    }
}
