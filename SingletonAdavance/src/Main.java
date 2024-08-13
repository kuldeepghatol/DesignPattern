//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        SingletonAdvance singletonAdvance = SingletonAdvance.getInstance();


        Thread a = new Thread(() -> {
            System.out.println( "First Instance  :" +  SingletonAdvance.getInstance());
        });
       Thread b =  new Thread(() -> {
            System.out.println( "Second Instance :" +  SingletonAdvance.getInstance());
        });
       a.start();
       b.start();
       a.join(1000);
       b.join(1000);

    }
}