package algorithm.basic.math.search;

import algorithm.basic.math.util.Input;

import java.util.*;

// 임의의 value N개 중 M개의 선택된 값으로 지정한 Total 과 가장 근사한 값을 찾기
public class BruteForceExam {
    int[] selected = new int[3]; // 선택된 3개의 값을 가지는 배열 선언
    int close_sum, close_diff; // 근사한 합과 근사한 차
    List<Integer> inputs;
    public BruteForceExam() {
        inputs = new ArrayList<>();
    }

    List<Integer> getSortedInput() {
        List<Integer> sortedInputs = new ArrayList<>(inputs);
        Collections.sort(sortedInputs);

        return sortedInputs;
    }

    public void BruteForce(List<Integer> list, int target) {
        this.close_sum = Integer.MAX_VALUE; // 초기 토탈값 처리를 위해 int 맥스 0x7777 값 할당
        this.close_diff = Integer.MAX_VALUE; // 초기 차이 값 처리를 위해 int 맥스 0x7777 값 할당

        // 완전 탐색을 위해 i,j,k 중첩 반복을 사용
        for(int i=0; i<list.size()-2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    System.out.println("[" + i + "]" + "[" + j + "]" + "[" + k + "]");
                    int sum = list.get(i) + list.get(j) + list.get(k);
                    if (sum <= target) {
                        int diff = target - sum;
                        if (diff < this.close_diff) {
                            this.close_diff = diff;
                            this.close_sum = sum;
                            this.selected[0] = list.get(i);
                            this.selected[1] = list.get(j);
                            this.selected[2] = list.get(k);
                        }

                        if (diff == 0) {
                            return;
                        }
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int N; // N: 임의로 입력할 값의 개수
        int target; // target: 임의로 지정한 값
        BruteForceExam bf = new BruteForceExam();
        Scanner sc = new Scanner(System.in);
        Input ipt = new Input();

        System.out.print("N ");
        N = ipt.intInput(sc,3,100);
        System.out.print("target ");
        target = ipt.intInput(sc,10,300000);

        System.out.print(">> ");
        for (int i=0; i<N; i++) {
            int inputValue = sc.nextInt();
            bf.inputs.add(inputValue);
        }

        List<Integer> sortedInputs = bf.getSortedInput();
        bf.BruteForce(sortedInputs, target);

        System.out.println("*** 최종 결과 ***");
        System.out.print("임의의 수 중 선택된 3개의 수 >> ");
        for (int select : bf.selected) {
            System.out.print(select+" ");
        }
        System.out.println();
        System.out.println("선택된 3개의 수의 합 >> " + bf.close_sum);
        System.out.println("선택된 3개의 수의 합과 Target 의 차이 >> " + bf.close_diff);
    }
}
