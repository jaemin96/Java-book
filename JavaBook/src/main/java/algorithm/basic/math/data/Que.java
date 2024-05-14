package algorithm.basic.math.data;

import java.util.ArrayList;
import java.util.List;

public class Que {
    List<Integer> que;

    public Que() {
        this.que = new ArrayList<>();
    }

    // 요소 삽입
    public void push(int n) {
        this.que.add(n);
    }

    // 요소 추출
    public int pop() {
        if(!isQueEmpty()) {
            int value = this.que.get(0);
            this.que.remove(0);

            return value;
        }

        return -1;
    }

    // 큐 값 존재여부 확인
    public boolean isQueEmpty() {
        return this.que.isEmpty();
    }

    // 큐 요소 개수 출력
    public int getQueSize() {
        return this.que.size();
    }

    // 큐 가장 처음으로 들어온 값 찾기
    public int front() {
        if(!isQueEmpty()) {
            return this.que.get(0);
        }

        return -1;
    }

    // 큐 가장 마지막에 들어온 값 찾기
    public int last() {
        if(!isQueEmpty()) {
            return this.que.get(getQueSize()-1);
        }

        return -1;
    }
}
