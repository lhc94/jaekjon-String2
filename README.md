# String 과 StringBuilder의 차이
String

```
      String str1 = "Hollw";
		  System.out.println(str1.hashCode());
		  //69907568
		  String str2 = "world";
		  str1 = str1 + str2;
		  
		  System.out.println(str1.hashCode());
      //-196760286
```
같은 `str1` 객체이지만 해쉬값이 다르다 => 메모리주소값이 다르다

이전의 `str1`의 메모리값은 결국 쓰레기 공간이 되어버린다 -> 성능면에서 좋지않다

이걸 보안하기위한

`StringBuilder`가 있다

### `StringBuilder`는 `String`클래스와 달리 문자를 추가하거나 삭제, 변경하는 인스턴스들이 있어 가능하다
