import java.util.ArrayList;
public class AggregationDemo {

    public static void main(String[] args) {

        // create Person object
        Person person = new Person(); // Blank 9 Question 2

        person.setName("Paul"); // Blank 10 Question 2    

        // create Mobile object  
        Mobile number1 = new Mobile(null, null, null); // Blank 11 Question 2

        number1.setMobileNo("8868923136"); // Blank 12 Question 2

        Mobile number2 = new Mobile(null, null, null);  // Blank 13 Question 2

        number2.setMobileNo("8630023310");  

        // create ArrayList of Mobile and add mobile
        ArrayList<Mobile> numberList = new ArrayList<>(); // Blank 14 Question 2

        numberList.add(number1); // Blank 15 Question 2

        numberList.add(number2);  

        // add ArrayList of Mobile to Person
        person.setNumbers(numberList); // Blank 16 Question 2

        // display mobile information of person
        System.out.print(person.getNumbers().get(0).getMobileNo() + " "); // Blank 17 Question 2

        System.out.print(person.getNumbers().get(1).getMobileNo()); // Blank 18 and 19 Question 2

        System.out.println(" are mobile numbers of the person " + person.getName()); // Blank 20 Question 2

    }

}
