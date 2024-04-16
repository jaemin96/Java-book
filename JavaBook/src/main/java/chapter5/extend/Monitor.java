package chapter5.extend;

public abstract class Monitor {
    public String productNo;
    public int inch;
    public boolean isPowered = false;

    public Monitor(String productNo, int inch) {
        this.productNo = productNo;
        this.inch = inch;
    }

    public abstract void printMaker();

    public void powerOn() {
        this.isPowered = true;
    }

    public void powerOff() {
        this.isPowered = false;
    }

    public void printPowerState() {
        if(this.isPowered) {
            System.out.println("모니터 전원이 켜진 상태입니다");
        }else {
            System.out.println("모니터 전원이 꺼진 상태입니다");
        }
    }
}
