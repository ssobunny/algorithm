package codility;

public class BinaryGap {
  public int solution(int N) {
    String str = Integer.toBinaryString(N); //10진수 -> 2진수
    int strLength = str.length();
    int cnt = 0;
    int result = 0;

    Loop1: for (int i = 1; i < strLength; i++) {
      if (str.charAt(i) == '0') { //String.charAt(i): i번째 문자 뽑기
        cnt++;
      } else {
        if ((strLength / 2) <= cnt) { //10진수를 2로 더이상 나눌 수 없을 때까지 나누면서 2진수를 구한다.
          result = cnt;
          break Loop1;
        }
        result = (result > cnt) ? result : cnt;
        cnt = 0;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    BinaryGap bg = new BinaryGap();
    System.out.println(bg.solution(1047));
    System.out.println(bg.solution(32));
  }

  /**
   * 양의 정수 N 내의 이진 간격은 N의 이진 표현에서 양쪽 끝에서 1로 둘러싸인 연속 0의 최대 시퀀스입니다.
   *
   * 예를 들어, 숫자 9는 이진 표현 1001을 갖고 길이가 2인 이진 간격을 포함합니다. 숫자 529는 이진 표현이 1000010001이고 두 개의 이진 간격(길이 4 중 하나와 길이 3 중 하나)을 포함합니다. 숫자 20은 이진 표현 10100을 포함하고 다음을 포함합니다. 길이가 1인 하나의 이진 간격. 숫자 15는 이진 표현 1111을 가지며 이진 간격이 없습니다. 숫자 32는 이진 표현 100000을 가지며 이진 간격이 없습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int N); }
   *
   * 양의 정수 N이 주어지면 가장 긴 이진 간격의 길이를 반환합니다. N에 이진 간격이 포함되지 않은 경우 함수는 0을 반환해야 합니다.
   *
   * 예를 들어, N = 1041이 주어지면 함수는 5를 반환해야 합니다. N은 이진 표현이 10000010001이고 가장 긴 이진 간격은 길이가 5이기 때문입니다. N = 32가 주어지면 함수는 0을 반환해야 합니다. N은 이진 표현이 '100000'이고 바이너리 갭이 없습니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..2,147,483,647] 범위의 정수입니다.
   */
}
