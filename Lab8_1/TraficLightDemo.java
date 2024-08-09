public class TraficLightDemo {
    public static void main(String[] args) throws InterruptedException {

        TrafficLight traffic = new TrafficLight();
        traffic.setColor("green");

        for (int i = 0; i < 10; i++) {
            System.out.println(traffic.toString());
            traffic.change();
            Thread.sleep(2000);
        }
    }
}
