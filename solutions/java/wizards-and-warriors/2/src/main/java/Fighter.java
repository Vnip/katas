class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable(){
        return false;
    }

    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damagePoints = 0;

        if(fighter.isVulnerable() ){
            damagePoints = 10;
        }else {
             damagePoints = 6;
        }
            
        
        return damagePoints;
    }
}


class Wizard extends Fighter{
    public String toString(){
        return "Fighter is a Wizard";
    }

    boolean spellPrepared = false;
    
    public void prepareSpell(){
       spellPrepared = true;
    }

    @Override
    boolean isVulnerable(){
        if(spellPrepared){
            return false;
        }
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        int damagePoints = 0;

        if(spellPrepared){
            damagePoints = 12;
        }else {
            damagePoints = 3;
        }
        
        return damagePoints;
    }










    
    
}