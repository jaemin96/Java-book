package algorithm.basic.math.sort;

public class WordSortExam {
    public String[] sortingWord(String[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                // 길이가 짧은 단어 순서대로 정렬
                if (array[i].length() > array[j].length()) {
                    String temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

                // 길이가 같은 경우,
                if (array[i].length() == array[j].length()) {
                    // 두 문자열의 index 위치의 문자를 하나하나 비교해서
                    for (int x=0; x<array[i].length(); x++) {
                        // 좌항 값이 큰 경우 우항과 값 교체
                        if (array[i].charAt(x) > array[j].charAt(x)) {
                            String temp;
                            temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }

        return array;
    }
    public static void main(String[] args) {
        WordSortExam ws = new WordSortExam();
        String[] array = {"c", "min", "ae", "ab", "haha"};

        String[] newArray = ws.sortingWord(array);

        for (String item : newArray) {
            System.out.print(item+" ");
        }
    }
}