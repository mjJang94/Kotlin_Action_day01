# Kotlin_Action_day01

## 정말 자주보지만 정말 관심없던 것에 대하여
var - 변경 가능한 참조인 변수로, variable에서 따온 키워드   
val - 변경 불가능한 참조를 저장한 변수로, value에서 따온 키워드   

## 함수에 대한 이름
- if문을 사용할 때 중괄호 {} 를 생략하고 return을 제거하면서 등호를 식 앞에 붙여 간결한 함수를 작성할 수 있다.
<pre>
<code>
fun max(a:Int, b:Int) : Int = if(a>b) a else b
</code>
</pre>
이러한 형태의 함수는 **'식이 본문인 함수'** 라고 부르고 중괄호로 둘러싸인 함수를 **'블록이 본문인 함수'** 라고 불린다.

## enum 클래스 정의
- 코틀린에서는 **enum class** 를 사용하지만 자바에서는 enum을 사용한다.   
코틀린에서 enum은 소프트 키워드라고 불리는 존재다. enum은 class 앞에 있을 때는 특별한 의미를 지니지만 다른 곳에서는 이름에 사용할 수 있다.

## 인자 없는 when문
- when에 아무 인자도 없으면 각 분기의 조건이 boolean 결과를 계산하는 식이여야 한다. 이 샘플 코드는 **?)추가 객체를** 만들지는 않지만 가독성이 더 떨어지는 단점이 있다.

?) 추가 객체는 when의 분기조건에 있는 다른 두 식과 같은지 비교하기 위해 여러 set인스턴스를 생성한다.
