
package ray.kcca;

 import java.util.Arrays;
public class AQIAnalyzer {  
    public static void main(String[] args) {
       
 {
        int[] aqiReadings = new int[30];
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = (int) (Math.random() * 300) + 1;
        }
        System.out.println("Generated AQI Readings: " + Arrays.toString(aqiReadings));
        Arrays.sort(aqiReadings);
        double median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        System.out.println("Median AQI: " + median);
        int hazardousDays = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) hazardousDays++;
        }
        System.out.println("Hazardous Days (AQI > 200): " + hazardousDays);
    }
    }    
}
