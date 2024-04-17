package chater6.implement;

public class MonitorIPExample {
    public static void main(String[] args) {
        Monitor mc = new Monitor("FDSA12345", 25);

        System.out.println("===================");
        System.out.println("제품번호 : " + mc.productNo);
        System.out.println("모니터 크기(inch) : " + mc.inch);
        mc.printMaker();
        System.out.println("===================");
        System.out.println();

        for(int i=0; i<=5; i++) {
            mc.upLightness();
        }
        System.out.println();

        // 전원 on
        mc.setPower(true);
        mc.printPowerState();
        System.out.println();

        // 전원 off
        mc.setPower(false);
        mc.printPowerState();
        System.out.println();
    }
}
