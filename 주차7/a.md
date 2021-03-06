키속성이란 무엇인가?
릴레이션에 존재하는 속성들을 식별하는데 사용한다

제약조건이란 무엇인가 ?
릴레이션에 규칙을 정해서 올바른 데이터만 입력 받을수 있도록 제한하는 조건.
릴레이션에 규칙을 정하여 정확한 데이터만 받을 수 있도록 하는 조건.

### 개념적 모델링에대해 설명하시오
개체 속성 관계를 이용하여 현실세계를 개념적으로 표현하는 기법

개념적 구조를 컴퓨터 환경에 맞도록 변환하는 과정.
개체, 속성, 관계를 이용해서 실세계를 개념적으로 표현하는 기법입니다.



### 정규화란 무엇인가??
릴레이션에서 중복된 데이터를 최소화하여 데이터를 구조화하는 작업
삽입 삭제 수정이상이 일어나지 않도록 하는 과정.

제 1정규화란 무엇인가?
제1 정규화란 비정규형 릴레이션에서 도메인들이 원자값을 가지도록 만드는 과정

제 2정규화란 무엇인가?
제1 정규형이면서 릴레이션에서 기본키가 아닌 각 속성들이 기본키에 완전 함수적 종속이 되게 하는 과정.
키에 속하지 않는 속성 모두가 키에 완전 함수 종속


기본키가 두개 이상일 경우 기본키 내의 일부 속성값에만 종속되어있는경우 완전 함수적 종속이 되게 만드는 과정

제 3정규화란 무엇인가?
제2 정규형이면서 릴레이션에서 이행적 함수 종속이 일어나지 않도록 하기 위한 과정.

이행적 함수 종속이란 무엇인가?
릴레이션에서 속성 X Y Z값이 있을 때 Y는 X에 종속되고 Z는 Y값에 종속될 때 Z가 X값에 종속되는 경우를 말한다.

부분 함수 종속이란 무엇인가?
- 종속자가 기본키가 아닌 다른 속성에 종속되거나, 기본키가 여러 속성으로 구성되어 있을 경우 기본키를 구성하는 속성 중 일부만 종속되는 경우

완전 함수 종속이란 무엇인가?
- 종속자가 기본키에만 종속되며, 기본키가 여러 속성으로 구성되어 있을 경우 기본키를 구성하는 모든 속성이 포함된 기본키의 부분집합에 종속된 경우

결정자에 대해 설명하시오.
- 속성 간의 종속성을 규명할 때 기준이 되는 값

종속자에 대해 설명하시오.
- 결정자의 값에 의해 정해지는 값

수정이상에 대해 설명하시오.
- 중복 데이터 중에서 일부만 수정되어 정보의 모순이 발생하는 것

삽입이상에 대해 설명하시오.
- 불필요한 정보를 함께 저장하지 않음
- 어떤 정보를 저장하는 것이 불가능 하기에 원하지 않는 정보를 강제로 삽입해야 하는 것
- 기본키에는 NULL값을 저장할 수 없기 때문에 가상의 정보라도 넣어야함

삭제이상에 대해 설명하시오.
- 유용한 정보를 함께 삭제하지 않고는 어떤 정보를 삭제하는 것이 불가능한 것

ERD 관계에서 실선과 점선의 차이는 무엇인가?
- 실선 : 필수 관계
- 점선 : 선택적 관계


Entity, Attribute, Relationship, Diagram 에 대하여 설명해라.
- 개체(엔티티) : 현실세계에서 다른 모든 것들과 구분이 되는 유형, 무형의 것으로 업무수행을 위해서 알아햐 할 대상
- 속성(에트리뷰트) : 정보의 요소로써 관리되는 항목, 엔티티의 성질, 분류, 수량, 상태, 특성 등을 구체적으로 나타내는 세부항목
- 관계(릴레이션십) : 엔티티사이의 업무적인 연관성을 논리적으로 표현한 것

개념적 데이터 모델링
개념적 모델링 과정에서얻은 개념적 구조를 컴퓨터환경에 맞도록 변환하는 과정

키 : 슈퍼 키(Super Key): 유일성을 만족하는 키. 예를 들면, {학번 + 이름}, {주민등록번호 + 학번}
후보 키(Candidate key): 유일성과 최소성을 만족하는 키. 기본키가 될 수 있는 후보이기 때문에 후보키라고 불린다. 예를 들면, 주민등록번호, 학번 등
기본 키(Primary key): 후보 키에서 선택된 키. NULL값이 들어갈 수 없으며, 기본키로 선택된 속성(Attribute)은 동일한 값이 들어갈 수가 없다.
대체 키(Surrogate key): 후보 키 중에 기본 키로 선택되지 않은 키.
외래 키(Foreign Key): 어떤 테이블(Relation) 간의 기본 키(Primary key)를 참조하는 속성이다. 테이블(Relation)들 간의 관계를 나타내기 위해서 사용된다.

제약조건이 무엇들이 있는가? 그것에 대해 각각 설명해라.
- 기본 키 : UNIQUE + NOT NULL을 만족하며 테이블을 대표하며 각 행을 유일하게 식별하는 값
- 외래 키 : 열 값이 부모 테이블의 참조 열 값을 반드시 참조, 참조되는 열은 유니크 하거나 기본 키 임 (NULL 허용 가능)
- 고유 키 : 중복된 값을 허용하지 않음, 유일한 값으로 존재 (NULL허용 가능)
- NOT NULL : NULL 값을 허용하지 않음, 값 입력 필수
- CHECK : 범위나 조건을 설정하여 지정된 값만 허용

복합 키(Composite Key): 2개 이상의 속성(attribute)를 사용한 키.