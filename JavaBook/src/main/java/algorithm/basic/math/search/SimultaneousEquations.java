package algorithm.basic.math.search;

import algorithm.basic.math.util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimultaneousEquations {
    boolean isFound = false;

    public Map<String, Integer> findXY(int[] inputs) {
        Map<String, Integer> result = new HashMap<>();
        for (int i=-1000; i<1000 && !isFound; i++) {
            for (int j=-1000; j<1000; j++) {
                if((inputs[0]*i + inputs[1]*j == inputs[2]) && (inputs[3]*i + inputs[4]*j == inputs[5])) {
                    result.put("x", i);
                    result.put("y", j);
                    this.isFound = true;
                    break;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] inputs = new int[6];
        Input ipt = new Input();
        Scanner sc = new Scanner(System.in);
        SimultaneousEquations se = new SimultaneousEquations();

        System.out.print(">> ");
        for (int i=0; i<6; i++) {
            inputs[i] = ipt.intInput(sc,-1000,1000);
        }

        Map<String, Integer> xy = se.findXY(inputs);

        System.out.print("x:" + xy.get("x") + " y:" + xy.get("y"));

        sc.close();
    }
}
