public class WakeRouteCalculator  extends GoogleRouteCalculator implements RouteCalculator{
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Walk route form " + source + " to " + destination);
    }
}
