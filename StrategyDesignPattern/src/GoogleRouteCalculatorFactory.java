public class GoogleRouteCalculatorFactory {


    public static GoogleRouteCalculator getFactory(Mode mode) {

         switch (mode){
             case BYKE -> {
                 return  new BykeRouteCalculator();
             }
             case CAR -> {
                 return new CarRouteCalculator();
             }
             default -> {
                 return new WakeRouteCalculator();
             }
         }

     }
}
