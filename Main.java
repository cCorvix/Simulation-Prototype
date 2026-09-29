public class Main {
    public static void main(String[] args) throws InterruptedException {

        String simStartInput = null;

        boolean loadingFinished = false;

        IO.println("Simulation Prototype V.1.6 indev 2. Type start ");
        simStartInput = IO.readln();

        TimePassing time = new TimePassing();
        AllWeather weather = new AllWeather();
        PlantGrowth plants = new PlantGrowth();
        NaturalDisasters disasters = new NaturalDisasters();
        StartSim load = new StartSim();

        if ("start".equalsIgnoreCase(simStartInput)) {

            load.startSim(args);

            loadingFinished = true;

        }

        if (loadingFinished == true) {

            //main task(time)
            new Thread(() -> {
                time.handleAllTime();
            }).start();

            //all other tasks(weather, plants, disasters, entities)
            new Thread(() -> {
                weather.checkForWeather();
            }).start();

            new Thread(() -> {
                weather.handleWeatherCondition();
            }).start();

            new Thread(() -> {
                plants.checkIfRaining();
            }).start();

            new Thread(() -> {
                plants.checkIfSunny();
            }).start();

            new Thread(() -> {
                disasters.tornado();
            }).start();

            new Thread (() -> {
                disasters.snowstorm();
            }).start();

            new Thread (() -> {
                disasters.hurricane();
            }).start();

        }






    }


}
