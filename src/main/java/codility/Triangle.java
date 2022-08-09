package codility;

import java.util.Arrays;

public class Triangle {

  public int solution(int[] A) {
    // write your code in Java SE 8
    if(A.length < 3) {
      return 0;
    }

    Arrays.sort(A);

    for (int i=0; i<A.length-2; i++) {
      if((long)A[i] + A[i+1] > A[i+2]) {
        return 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Triangle t = new Triangle();
    System.out.println(t.solution(new int[] { 10,2,5,1,8,20 }));
  }

  /**
   * N개의 정수로 구성된 배열 A가 주어집니다. 삼중항(P, Q, R)은 0 ≤ P < Q < R < N이고 다음과 같은 경우 삼각형입니다.
   *
   * A[P] + A[Q] > A[R],
   * A[Q] + A[R] > A[P],
   * A[R] + A[P] > A[Q].
   * 예를 들어, 다음과 같은 배열 A를 고려하십시오.
   *
   *    A[0] = 10 A[1] = 2 A[2] = 5
   *    A[3] = 1 A[4] = 8 A[5] = 20
   * 삼중항(0, 2, 4)은 삼각형입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 배열 A가 주어지면 이 배열에 대한 삼각형 삼중항이 있으면 1을 반환하고 그렇지 않으면 0을 반환합니다.
   *
   * 예를 들어, 주어진 배열 A는 다음과 같습니다.
   *
   *    A[0] = 10 A[1] = 2 A[2] = 5
   *    A[3] = 1 A[4] = 8 A[5] = 20
   * 함수는 위에서 설명한 대로 1을 반환해야 합니다. 주어진 배열 A는 다음과 같습니다.
   *
   *    A[0] = 10 A[1] = 50 A[2] = 5
   *    A[3] = 1
   * 함수는 0을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−2,147,483,648..2,147,483,647] 범위의 정수입니다.
   */

}
