package chapter5.extend;

public class BenQ extends Monitor{
    public BenQ(String productNo, int inch) {
        super(productNo, inch);
    }
    @Override
    public void printMaker() {
        System.out.println("This monitor made by BenQ");
    }
}
