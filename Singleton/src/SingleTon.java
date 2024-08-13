public class SingleTon {

    private static SingleTon instance;

    private SingleTon() {
        // private constructor
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
