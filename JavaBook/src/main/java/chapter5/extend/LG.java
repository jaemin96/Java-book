package chapter5.extend;

public class LG extends Monitor{
    public LG(String productNo, int inch) {
        super(productNo, inch);
    }
    @Override
    public void printMaker() {
        System.out.println("This monitor made by LG");
    }
}
