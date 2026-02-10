public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutes){
        Lasagna lasagna = new Lasagna();
        
        int remainMinutes = lasagna.expectedMinutesInOven() - minutes;

        return remainMinutes;
    }
    
    public int preparationTimeInMinutes(int numberOfLayers){

       int totalTime = numberOfLayers * 2;

        return totalTime;
    }
        

     public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes){
          Lasagna lasagna = new Lasagna();
        int prepTime = lasagna.preparationTimeInMinutes(numberOfLayers);

         int totalTime = prepTime + numberOfMinutes ;

         return totalTime;

 }
    
}
