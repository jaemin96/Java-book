package algorithm.basic.math.search;

public class RecurringExam {
    static int RECURRING_NUMBER = 6; // 1~9 까지의 상수 값

    // 연속되는 값을 가지고 있는지 검사
    public boolean isRecurring(int value) {
        String stringValue = String.valueOf(value);
        int[] numberArray = new int[stringValue.length()];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = Character.getNumericValue(stringValue.charAt(i));
        }

        for (int i=0; i<numberArray.length; i++) {
            if(i+2 < numberArray.length) {
                if ((RECURRING_NUMBER == numberArray[i]) && (numberArray[i] == numberArray[i+1]) && (numberArray[i+1] == numberArray[i+2])) {
                    return true;
                }
            }
        }

        return false;
    }

    // nth(몇번째인지)에 해당하는 연속적인 값을 갖는 넘버 찾기
    public int findNthRecurringNumber(int nth) {
        int count = 0;
        int value = 110; // 3개의 값이 같은 경우를 찾기에 최솟값인 111보다 1작은 수인 110으로 초기화

        // 연속적인 수일 경우에만 count 증가, count=nth 인 경우 value 값 리턴
        while(nth != count) {
            value++;
            if(isRecurring(value)) {
                count++;
            }
        }

        return value;
    }
    public static void main(String[] args) {
        RecurringExam rc = new RecurringExam();

        int value = rc.findNthRecurringNumber(3);

        System.out.println("찾는 값은 >> " + value);
    }
}
