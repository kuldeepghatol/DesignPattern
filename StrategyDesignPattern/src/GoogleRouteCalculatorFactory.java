public class GoogleRouteCalculatorFactory {


    public static RouteCalculator getFactory(Mode mode) {

         switch (mode){
             case BYKE -> {
                 return  new BykeRouteCalculator();
             }
             case CAR -> {
                 return new CarRouteCalculator();
             }
             default -> {
                 return new WalkRouteCalculator();
             }
         }

     }
}
