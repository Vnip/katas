class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryPercentage;
    private int distanceDriven;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryPercentage = 100;
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
       return distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance){
        this.distance = distance;
    }
      
    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = 100/car.getBatteryDrain();
        int maxDistance = maxDrives * car.getSpeed();
        return maxDistance >= distance;
    }
}     
        
    


