키의 정의 : 릴레이션에서 값을 탐색,정렬 할때 다른 속성과 구별되는 속성

슈퍼키 : 슈퍼키는 릴레이션에서 유일성을 만족하는 속성이다.
후보키 : 후보키는 릴레이션에서 유일성과 최소성을 만족하는 속성이다.
기본키 : 기본키는 후보키중에서 선택되며 널값을 가질 수 없고 동일한 값을 가질 수 없다.
대체키 : 대체키는 기본키로 선택되지 못한 속성
외래키 : 외래키는 다른 릴레이션에서 고유키 , 기본키에서 가져오며 릴레이션간의 관계를 구별하는 역할이다.

제약조건 : 제약조건이란 릴레이션에 데이터를 삽입할때 규칙을 정하여 올바른 데이터값만 삽입할 수 있도록 하는 조건

기본키 : 기본키는 릴레이션을 대표하는 키로서 각 속성을 유일하게 식별하는 값.
[외래키] : 열 값이 반드시 다른 릴레이션의 고유키나 기본키를 참조함.  
[고유키] : 기본키는 아니지만, 유일한 속성을 가지는 값 (Null값을 허용함)
notnull : 속성값이 null값을 가질 수 없는 것. 
default : 데이터에 속성값을 입력하지 않은 경우 기본적으로 삽입되는 데이터 
[check] : 범위나 조건을 설정하여 지정된 값만 허용하는 것.

개념적 데이터 모델링이란?
복잡한 현실세계를 개체 관계 속성을 이용하여 개념적으로 설계하는 과정.

논리적 데이터 모델링이란?
개념적 데이터 모델링을 설계하며 얻은 개념적 구조를 컴퓨터에 맞게 논리적으로 변환하는 과정.