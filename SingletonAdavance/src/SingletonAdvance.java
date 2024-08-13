public class SingletonAdvance {

    private static SingletonAdvance instance;

    private SingletonAdvance() {

    }

    public static SingletonAdvance getInstance() {
        if (instance == null) {
            synchronized (SingletonAdvance.class) {
                if (instance == null) {
                    instance = new SingletonAdvance();
                }
            }
        }
        return instance;
    }
}
