public class CarRouteCalculator  extends GoogleRouteCalculator implements RouteCalculator{
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("CAR route form " + source + " to " + destination);
    }
}
