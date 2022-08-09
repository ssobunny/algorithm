package codility;

public class Nesting {

  public int solution(String S) {
    // write your code in Java SE 8
    int counter = 0;
    for(int i=0; i<S.length(); i++) {
      if(S.substring(i, i+1).equals("(")) {
        counter++;
      } else {
        counter--;
      }
      if(counter < 0) {
        return 0;
      }
    }
    return counter == 0 ? 1 : 0;
  }

  public static void main(String[] args) {
    Nesting n = new Nesting();
    System.out.println(n.solution("(()(())())"));
  }

  /**
   * N개의 문자로 구성된 문자열 S는 다음과 같은 경우 적절하게 중첩되어 호출됩니다.
   *
   * S는 비어 있습니다.
   * S는 "(U)" 형식을 갖습니다. 여기서 U는 적절하게 중첩된 문자열입니다.
   * S는 V와 W가 적절하게 중첩된 문자열인 "VW" 형식을 갖습니다.
   * 예를 들어, 문자열 "(()(())())"은 적절하게 중첩되지만 문자열 "())"은 중첩되지 않습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(문자열 S); }
   *
   * N개의 문자로 구성된 문자열 S가 주어지면 문자열 S가 적절하게 중첩되면 1을 반환하고 그렇지 않으면 0을 반환합니다.
   *
   * 예를 들어 S = "(()(())())"이 주어지면 함수는 1을 반환해야 하고 S = "())"가 주어지면 위에서 설명한 대로 함수는 0을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..1,000,000] 범위 내의 정수입니다.
   * 문자열 S는 "(" 및/또는 ")" 문자로만 구성됩니다.
   */

}
