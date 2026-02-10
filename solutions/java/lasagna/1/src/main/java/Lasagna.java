public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes){
        Lasagna lasagna = new Lasagna();
        
        int remainMinutes = lasagna.expectedMinutesInOven() - minutes;

        return remainMinutes;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){

       int totalTime = numberOfLayers * 2;

        return totalTime;
    }
        

    // TODO: define the 'totalTimeInMinutes()' method
     public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes){
          Lasagna lasagna = new Lasagna();
        int prepTime = lasagna.preparationTimeInMinutes(numberOfLayers);

         int totalTime = prepTime + numberOfMinutes ;

         return totalTime;
      //   totalCookingMin = preparationTime + time lasagna has spent in oven

 }
    
}
