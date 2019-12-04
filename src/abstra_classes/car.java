package abstra_classes;

public class car extends Machine {
    @Override
    public void start() {
        System.out.println("Car has start...");

    }

    @Override
    public void stuff() {
        System.out.println("Car doing some weird ...");
    }

    @Override
    public void shutdown() {
        System.out.println("Car shuttingdown....");
    }
}
