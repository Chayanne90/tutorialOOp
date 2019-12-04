package abstra_classes;

class Camera extends Machine {


    @Override
    public void start() {

        System.out.println("Car has start...");
    }

    @Override
    public void stuff() {

        System.out.println("Doing stuf..");
    }

    @Override
    public void shutdown() {

        System.out.println("the camera is shuttingdown....");
    }
}
