public class City {

    private String cityName;

    public String getCityName() {
        return cityName; // Blank 1 Question 1
    }

    public void setCityName(String cityName) {
        this.cityName = cityName; // Blank 2 Question 1
    }

    @Override
    public String toString() { // Blank 3 Question 1
        return this.cityName;
    }

}
