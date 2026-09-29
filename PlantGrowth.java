public class PlantGrowth {
  
  public static boolean seedsWatered = false;

  public static boolean seedsHaveSun = false;

  public void checkIfRaining() {

    while (true) {
    
    if (AllWeather.weatherData == "Rainy") {

      seedsWatered = true;

      }

    }
  
  }

  public void checkIfSunny() {

    while (true) {

    if (AllWeather.weatherData == "Sunny") {

      seedsHaveSun = true;

    }

    }

  }





}
