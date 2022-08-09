package codility;

import java.util.Stack;

public class Brackets {

  public int solution(String S) {
    // write your code in Java SE 8
    Stack<String> stack = new Stack<>(); //Stack: Last In First Out, .push:값 추가/.pop:값 삭제/.peek:가장 상단의 값 출력/.empty:비어있는지/.contains:값이 있는지

    for (int i=0; i<S.length(); i++) {
      String ch = S.substring(i, i+1); //String.subString(i): index값이 i위치 이후(i포함) 값 리턴/String.subString(i, x): index값이 i~x-1 리턴
      System.out.println(i + " 번째 ch : " + ch);
      if (ch.equals("(") || ch.equals("[") || ch.equals("{")) {
        stack.push(ch);
      } else {
        if (stack.isEmpty()) {
          return 0;
        }
        if (ch.equals(")")) {
          if (!stack.pop().equals("(")) { //stack에 넣은 가장 상단의 값 꺼내서 비교함
            return 0;
          }
        }
        if (ch.equals("]")) {
          if (!stack.pop().equals("[")) {
            return 0;
          }
        }
        if (ch.equals("}")) {
          if (!stack.pop().equals("{")) {
            return 0;
          }
        }
      }
    }
    if(!stack.isEmpty()) {
      return 0;
    }
    return 1;
  }

  public static void main(String[] args) {
    Brackets b = new Brackets();
    System.out.println(b.solution("{[()()]}"));
  }

  /**
   * N개의 문자로 구성된 문자열 S는 다음 조건 중 하나라도 참인 경우 적절하게 중첩된 것으로 간주됩니다.
   *
   * S는 비어 있습니다.
   * S는 "(U)" 또는 "[U]" 또는 "{U}" 형식을 갖습니다. 여기서 U는 적절하게 중첩된 문자열입니다.
   * S는 V와 W가 적절하게 중첩된 문자열인 "VW" 형식을 갖습니다.
   * 예를 들어 "{[()()]}" 문자열은 적절하게 중첩되지만 "([)()]"은 중첩되지 않습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(문자열 S); }
   *
   * N개의 문자로 구성된 문자열 S가 주어지면 S가 적절하게 중첩되면 1을 반환하고 그렇지 않으면 0을 반환합니다.
   *
   * 예를 들어, S = "{[()()]}"이 주어지면 함수는 1을 반환해야 하고 S = "([)()]"가 주어지면 함수는 위에서 설명한 대로 0을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..200,000] 범위 내의 정수입니다.
   * 문자열 S는 "(", "{", "[", "]", "}" 및/또는 ")" 문자로만 구성됩니다.
   */
}
