public class CarRouteCalculator implements RouteCalculator{
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("CAR route form " + source + " to " + destination);
    }
}
