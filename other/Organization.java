public class Organization {

    private String name;
    private String caption;
    private People people;  // uses People
    private Accounts accounts; // owns Accounts

    public Organization() { 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public String toString() {
        return "Organization{" + "name=" + name + ", caption=" + caption + ", people=" + people + ", accounts=" + accounts + '}';
    }
}
