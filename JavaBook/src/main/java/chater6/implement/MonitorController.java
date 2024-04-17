package chater6.implement;

public interface MonitorController {
    int MAX_LIGHTNESS = 100;
    int MIN_LIGHTNESS = 0;

    void upLightness();
    void downLightness();
    void setPower(boolean isPowered);
    void printMaker();
    void printPowerState();
}
