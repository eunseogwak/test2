public class Dice {
    private int value;

    public Dice(){
        value = 0;
    }

    public void roll(){
        value = (int)(Math.random()*6)+1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Dice dice1, dice2;
        int rollCount;

        dice1 = new Dice();
        dice2 = new Dice();
        rollCount = 0;



    }
}
