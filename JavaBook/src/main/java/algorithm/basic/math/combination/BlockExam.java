package algorithm.basic.math.combination;

/**
 * 1) 블럭은 벽과 벽이 막힌 모퉁이에서 계단식으로 세워지고 있다.
 * 2) 블럭은 '1층일 때 1개, 2층일 때 4개, 3층일 때 10개' 와 같이 쌓여져 간다.
 * 3) 위에서 아래로만 이동 가능하다.
 * 4) 각 블럭에서는 인접한 블록으로만 이동할 수 있다.
 */
public class BlockExam {
    // 층 수가 주어질 때 쌓아 올려진 블럭 총 개수
    public int getTotalBlock(int floor) {
        int total = 0;

        // 쌓여진 총 블럭의 개수는 이전 층까지 블럭의 개수와 새로 추가될 층의 블럭 수의 합이다.
        for (int i=1; i<=floor; i++) {
            // n번째 층에 쌓여질 개수는 등차가 1이고 첫째항이 1인 등차수열의 합으로 구할 수 있다.
            // floor 층까지 쌓여진 블럭의 개수를 구하기 위해 기존에 쌓여진 블럭에 해당 층에 필요한 블럭 수를 합해준다.
            total += i*(i+1)/2;
        }

        return total;
    }

    public int getMovePathTotal(int floor) {
        // 각 블럭에서 아래로 이동하는 경우 두 방향으로 이동할 수 있기에 경우의 수는 2^n 이다.
        return (int)Math.pow(2,floor);
    }
}
