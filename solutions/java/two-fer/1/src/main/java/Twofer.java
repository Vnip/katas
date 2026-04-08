public class Twofer {
    public String twofer(String name) {
        String oneFor = "One for ";
        String oneForMe = ", one for me.";
    if(name != null && !name.isEmpty()){
        return oneFor + name + oneForMe;
    }else{
        return oneFor + "you" + oneForMe;
    }
            
    }
}
