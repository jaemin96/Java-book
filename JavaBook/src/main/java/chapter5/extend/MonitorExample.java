package chapter5.extend;

public class MonitorExample {
    public static void main(String[] args) {
        Monitor monitorA = new Samsung("LQWKR8891", 20);
        Monitor monitorB = new LG("FDFDFD123", 24);
        Monitor monitorC = new BenQ("BENQ456678", 27);

        monitorA.powerOn();
        monitorC.powerOn();

        System.out.println("=== MonitorA ===");
        monitorA.printMaker();
        System.out.println("Monitor Product number : " + monitorA.productNo);
        System.out.println("Monitor Inch : " + monitorA.inch);
        monitorA.printPowerState();
        System.out.println();

        System.out.println("=== MonitorB ===");
        monitorB.printMaker();
        System.out.println("Monitor Product number : " + monitorB.productNo);
        System.out.println("Monitor Inch : " + monitorB.inch);
        monitorB.printPowerState();
        System.out.println();

        System.out.println("=== MonitorC ===");
        monitorC.printMaker();
        System.out.println("Monitor Product number : " + monitorC.productNo);
        System.out.println("Monitor Inch : " + monitorC.inch);
        monitorC.printPowerState();
        System.out.println();






    }
}
