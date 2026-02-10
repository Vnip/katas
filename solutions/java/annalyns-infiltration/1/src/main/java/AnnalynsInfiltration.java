class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // knightIsAwake = true;
        if(!knightIsAwake){
            return true;
        }else{
            return false;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        
        
        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
        return false;
    }
    return true;
        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       if(prisonerIsAwake && !archerIsAwake){
           return true;
       }else{
           return false;
       }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent && !archerIsAwake){
            return true;
        }else if (!petDogIsPresent && prisonerIsAwake && !knightIsAwake  && !archerIsAwake){
            return true;
        }else{
            return false;
        }

        
    }
}
