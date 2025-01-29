



public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		// Cast command line arguments to float values
		float temperature = Float.parseFloat(args[0]);
		float humidity = Float.parseFloat(args[1]);
		float pressure = Float.parseFloat(args[2]);

		weatherData.setMeasurements(temperature, humidity, pressure);
		
	}
}
