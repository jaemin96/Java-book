package algorithm.basic.math.data;

import java.util.List;

public class LastValue extends Que {
    public int findLastValueOfQue() {
        int time = this.que.size(); // 반복할 횟수 지정
        if (!this.isQueEmpty()) {
            for (int i=0; i<time; i++) {
                this.pop(); // 가장 아래 요소 삭제! 234 42
                this.push(this.pop()); // 삭제 후 가장 아래 남은 요소를 가장 위로 옮기기 342 24
                if(this.que.size() == 1) {
                    return this.pop();
                }
            }
        } else {
            throw new Error("큐가 비어있습니다!");
        }

        return 0;
    }
}
