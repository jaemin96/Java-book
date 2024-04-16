package chapter5.extend;

public class Samsung extends Monitor{
    public Samsung(String productNo, int inch) {
        super(productNo, inch);
    }
    @Override
    public void printMaker() {
        System.out.println("This monitor made by Samsung");
    }
}
