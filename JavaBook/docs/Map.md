# Map
Key와 Value로 구성된 객체이며 값의 타입을 지정할 수 있다.
~~~ java
Map<String, Integer> map = new Map<>();
~~~
map 객체는 String 타입의 key와 Integer 타입의 value로 구성된 객체이다.

## keySet()
Map 객체에서 key 값을 사용하고자 할 때 사용하는 메서드이다
~~~java
// E -> Map 객체 key 지정 타입
Set<E> keys = map.keySet();

// 사용 예시 == 모든 키 출력
for(E key: Keys) {
    System.out.println(key);
}
~~~

## Map.Entry
key와 value 한 쌍인 Set 인스턴스를 가지는 인터페이스이다.
주요 메서드로 entrySet() 메서드와 getKey(), getValue(), setValue(value)가 있다.

### entrySet()
Map 객체 내에서 모든 키-값 쌍을 이루는 Set을 반환한다.
~~~java
// K: key 타입, V: value 타입
for (Map.Entry<K, V> entry : map.entrySet()) {}
~~~

### getKey()
entry에서 key값을 사용하고자 할 때 사용하는 메서드
~~~java
for (Map.Entry<K, V> entry : map.entrySet()) {
    System.out.print(entry.getKey());
}
~~~

### getValue()
entry에서 value값을 사용하고자 할 때 사용하는 메서드
~~~java
for (Map.Entry<K, V> entry : map.entrySet()) {
    System.out.print(entry.getValue());
}
~~~

### setValue()
entry에서 특정 조건에 맞는 경우 value를 갱신할 때 사용하는 메서드
~~~java
for (Map.Entry<K, V> entry : map.entrySet()) {
    // entry에서 key가 hello인 경우
    if(entry.getKey().equals("hello")) {
        // key가 hello인 value 값을 world!!로 변경
        entry.setValue("world!!");
    }
}
~~~
