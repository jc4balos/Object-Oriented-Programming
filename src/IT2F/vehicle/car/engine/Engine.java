package IT2F.vehicle.car.engine;

public class Engine {

    private String engineName="vtech";

    public String getEngineName(){
        System.out.println("hHAHAHAHA");
        return engineName;
    }

    private void start() {
        System.out.println("The engine is starting broom broom!!!!!!!!!!!!");
        System.out.println(engineName);
    }

    public void run() {
        start();
        start();
        start();
        start();
        start();

    }
}
