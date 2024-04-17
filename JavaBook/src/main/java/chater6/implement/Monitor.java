package chater6.implement;

public class Monitor implements MonitorController{
    public String productNo;
    public int inch;
    public int lightness = 95;
    public boolean isPowered = false;

    public Monitor(String productNo, int inch) {
        this.productNo = productNo;
        this.inch = inch;
    }

    public void upLightness() {
        if (this.lightness >= MAX_LIGHTNESS) {
            System.out.println("최대 밝기 입니다.");
        } else {
            this.lightness += 1;
            System.out.println("밝기 : " + this.lightness);
        }
    }

    public void downLightness() {
        if (this.lightness <= MIN_LIGHTNESS) {
            System.out.println("최저 밝기 입니다.");
        } else {
            this.lightness -= 1;
            System.out.println("밝기 : " + this.lightness);
        }
    }

    public void setPower(boolean isPowered) {
        this.isPowered = isPowered;
        if(isPowered) {
            System.out.println("모니터 전원을 켭니다");
        }else {
            System.out.println("모니터 전원을 끕니다");
        }
    }

    public void printMaker() {
        System.out.println("이 모니터는 공장에서 만들어졌습니다.");
    }

    public void printPowerState() {
        if(this.isPowered) {
            System.out.println("모니터 전원이 켜진 상태입니다");
        }else {
            System.out.println("모니터 전원이 꺼진 상태입니다");
        }
    }
}
