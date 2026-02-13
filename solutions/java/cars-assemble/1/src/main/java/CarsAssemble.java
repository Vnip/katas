public class CarsAssemble {
    
    public double productionRatePerHour(int speed) {
        double productionRatePerHour = 0.0;
        if(speed >= 1 && speed <= 4){
            productionRatePerHour = speed * 221;
        }else if(speed >= 5 && speed <= 8){
            productionRatePerHour = 0.9 * (speed * 221);
        }else if(speed == 9){
            productionRatePerHour = 0.8 * (speed * 221);
        }else if(speed == 10){
            productionRatePerHour = 0.77 * (speed * 221);
        }
    return productionRatePerHour;
     }

    public int workingItemsPerMinute(int speed) {
        int workingItemsPerMinute = 0;
        if(speed >= 1 && speed <= 4){
            workingItemsPerMinute = speed * 221/60;
        }else if(speed >= 5 && speed <= 8){
            workingItemsPerMinute =  (int)(0.9 * speed * 221)/60;
        }else if(speed == 9){
            workingItemsPerMinute = (int) (0.8 * speed * 221)/60;
        }else if(speed == 10){
            workingItemsPerMinute = (int) (0.77 * speed * 221)/60;
        }

        return workingItemsPerMinute;
    
     }
}
