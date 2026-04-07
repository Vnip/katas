public class GameMaster {

    // Describe a Character
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " +
               character.getCharacterClass() + " with " +
               character.getHitPoints() + " hit points.";
    }

    // Describe a Destination
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() +
               ", which has " + destination.getInhabitants() +
               " inhabitants.";
    }

    // Describe a TravelMethod
    public String describe(TravelMethod travelMethod) {
        switch (travelMethod) {
            case WALKING:
                return "You're traveling to your destination by walking.";
            case HORSEBACK:
                return "You're traveling to your destination on horseback.";
            default:
                return "";
        }
    }

    // Describe Character + Destination + TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " +
               describe(travelMethod) + " " +
               describe(destination);
    }

    // Describe Character + Destination (default: WALKING)
    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}