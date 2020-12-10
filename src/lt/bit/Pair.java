package lt.bit;

public class Pair implements IParticipantName {

    static private int counter = 1;

    private int number;
    private IParticipantName first;
    private IParticipantName second;

    public Pair(IParticipantName first, IParticipantName second) {
        this.number = counter++;
        this.first = first;
        this.second = second;
    }

    @Override
    public String getName() {
        return "Poros " + number + " laimetojas/a";
    }

    public String content() {
        return number + ") " + first.getName() + " - " + second.getName();
    }
}
