키 : 릴레이션에서 검색 , 정렬시 다른 속성과 구별되는 속성

슈퍼키 : 유일성을 만족하는 키
    -유일성 : 하나의 키값으로 튜플을 유일하게 식별할 수 있는 성질
후보키 : 기본키가 될 수 있는 키 , 유일성과 최소성을 만족함
    -최소성 : 키를 구성하는 속성들 중 꼭 필요한 최소한의 속성들로만 키를 구성하는 성질

기본키 : 후보키에서 선택된 키 null값을 가질 수 없음, [기본키로 선택된 속성은 동일한 값을 가질 수 없다.]

대체키 : 기본키가 되지 못한 후보키들.

외래키 : 다른 릴레이션에서 기본키이며, 릴레이션간의 관계를 나타낼때 사용하기도 함.


- 기본 키 : UNIQUE + NOT NULL을 만족하며 테이블을 대표하며 각 행을 유일하게 식별하는 값
- 외래 키 : 열 값이 부모 테이블의 참조 열 값을 반드시 참조, 참조되는 열은 유니크 하거나 기본 키 임 (NULL 허용 가능)
- 고유 키 : 중복된 값을 허용하지 않음, 유일한 값으로 존재 (NULL허용 가능)
- NOT NULL : NULL 값을 허용하지 않음, 값 입력 필수
- CHECK : 범위나 조건을 설정하여 지정된 값만 허용

    키의 정의 : 릴레이션에서 컴색, 정렬할때 다른 속성과 구별되는 키 
    슈퍼키 : 유일성을 만족하는 키
        - 유일성이란? 하나의 키값으로 다른 속성을 식별하는 키
    후보카 : 슈퍼키에서 선택되며 유일성과 최소성을 만족하는 키 
        - 최소성이란? 키를 구성하는 속성값중 불필요한 속성이 없는 것.
    기본키 : 후보키에서 선택되며 null값을 허용하지 않고 기본키로 선택된 속성은 중복된 값을 가질 수 없다.
    대체키 : 기본키로 선택되지 못한 속성
    외래키 : 다른 릴레이션에서 참조된 기본키,고유키 이고 , 릴레이션을 구별할 때도 사용한다

    제약조건 : 릴레이션에서 규칙을 정하여 올바른 값만 입력할 수 있게 만드는 조건.
    - 기본키 : unique + not null값을 가지며 테이블을 대표하며 다른 속성값을 식별할 수 있는 값.
    - 외래키 : 부모 릴레이션에서 참조된 고유키,기본키이다. 릴레이션을 연결할때 사용한다.
    - 고유키 : 중복된 값을 가지지 않고 유일한 값으로 존재 null값 허용
    - NotNull : Null값 허용 x 값 입력 필수.
    - Check : 범위나 조건을 설정하여 지정된 값만 허용.
    - default : 아무런 값을 입력하지 않은경우 기본값을 설정해주는 값.

    개념적 모델링이란?

    개체 속성 관계를 이용하여 복잡한 현실세계를 개념적으로 표현한기법
