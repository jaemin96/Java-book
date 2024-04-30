# 형변환

## INT 형

### Int to String
```java
String str = String.valueOf(123); // str = "123"
```
* str.length() - string 문자열 길이 측정
* str.charAt(index) - 문자열 index 위치의 문자 추출

### String to Int
```java
int number = Integer.parseInt(str); // number = 123
```
* 문자열을 정수형으로 변환 시 변환할 수 없는 문자열을 넣게 되면 NumberFormatException 에러가 발생하게 된다.
* Character.getNumericValue(char ch) - 문자가 0~9라면 숫자 그대로를 반환하고 그 외의 경우에는 -1을 반환한다.