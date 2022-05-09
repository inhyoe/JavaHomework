## 객체지향
1. 객체 추상화 : 박스
    - 상태 : 상태는 값을 입력하는 것
        - ex [가로,세로,높이]
    - 동작 : 상태 값을 입력받는 것   
        - ex [부피,겉넓이]

2. UML
    ```
    Box
    -------
    +width : int
    +height : int
    +depth L int
    ```

3. 클래스
- 필드 => 비공개 => 접근자, 설정자
- 메소드
- 생성자 => 중복정의(Overloading)
- toString(), equals(), ...
- 정적메소드
- 인스턴스 메소드 void a()
- 정적메소드 (static) : 필드를 사용하지 않으면 static을 사용한다.(array.format ...)
- 인스턴스메소드
https://velog.io/@withcolinsong/static메소드와-인스턴스-메소드
-----------------------

절차지향 메소드
static 선언 이유? : 필드를 사용하지 않아서