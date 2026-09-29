import java.util.random.RandomGenerator;

public class AllWeather {
  
  public static String weatherData = "Sunny";
  
  public static boolean isActiveWeather = false;
  
  public void checkForWeather() {

    while (true) {

      if (TimePassing.secondsPassed % 3600 == 0) {

        int checkForWeather = RandomGenerator.getDefault().nextInt(1, 3);

        if (checkForWeather == 1) {

          isActiveWeather = true;

        }

      }

    }

  }


  public void handleWeatherCondition() {

    if (isActiveWeather == true) {
      //6 possible weather conditions
      int weatherCondition = RandomGenerator.getDefault().nextInt(1, 7);

      if (weatherCondition == 1) {

        weatherData = "Rainy";

      } else if (weatherCondition == 2) {

        weatherData = "Cloudy";

      }

    }

  }

}
