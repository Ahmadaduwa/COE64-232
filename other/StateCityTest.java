import java.util.ArrayList;
public class StateCityTest { 

    public static void main(String[] args) {

        // create State
        State state = new State(); // Blank 10 Question 1

        state.setStateName("California"); // Blank 11 Question 1

        // create city         
        City city = new City(); // Blank 12 Question 1

        city.setCityName("Los Angeles");

        City city2 = new City();

        city2.setCityName("San Diago"); // Blank 13 Question 1

        // create ArrayList of City
        ArrayList<City> cityList = new ArrayList<>(); // Blank 14 and 15 Question 1

        cityList.add(city); // Blank 16 Question 1

        cityList.add(city2); // Blank 17 Question 1

        // add city to State     
        state.setState(cityList); // Blank 18 Question 1

        // display state and city information   
        System.out.println(state.getCitys() + " are cities in the state " + state.getStateName()); // Blank 19 and 20 Question 1

    }     

}
