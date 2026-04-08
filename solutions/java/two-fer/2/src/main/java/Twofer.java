public class Twofer {
    public String twofer(String name) {
        String oneFor = "One for ";
        String oneForMe = ", one for me.";
        return (name != null && !name.isEmpty()) 
            ? oneFor + name + oneForMe 
            : oneFor + "you" + oneForMe;
    }
}