public class Maps {

    public void findPath(String source, String destination, Mode mode) {
        RouteCalculator routeCalculator = GoogleRouteCalculatorFactory.getFactory(mode);
        routeCalculator.calculateRoute(source, destination);
    }
}
