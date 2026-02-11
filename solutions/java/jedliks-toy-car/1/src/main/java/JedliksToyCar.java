public class JedliksToyCar {
    public int distanceDriven;
    public int batteryPercentage;

    public JedliksToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }
    
    public static JedliksToyCar buy() {
                return new JedliksToyCar();
            }

    public String distanceDisplay() {
                  return "Driven " + distanceDriven + " meters";
        

    }

    public String batteryDisplay() {
     if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
        
            }

    public void drive() {
           if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }

    }
}
