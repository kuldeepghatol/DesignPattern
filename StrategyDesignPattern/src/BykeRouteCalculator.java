public class BykeRouteCalculator implements RouteCalculator{
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Byke route form " + source + " to " + destination);
    }
}
