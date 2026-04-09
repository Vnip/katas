import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class DnDCharacter {

    int ability(List<Integer> scores) {
    List<Integer> mutableScores = new ArrayList<>(scores);
    mutableScores.sort(Collections.reverseOrder());
    return mutableScores.get(0) + mutableScores.get(1) + mutableScores.get(2);
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        for(int i = 0; i<4; i++){
            rolls.add((int)(Math.random() * 6) + 1 );
        }
        return rolls; 
    }

    int modifier(int input) {
         return (int) Math.floorDiv(input - 10, 2);
    }

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public DnDCharacter(){
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());    
    }
    
    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
       int conModifier = modifier(constitution);
        return 10 + conModifier; 
    }
}
