package codility;

public class MaxSliceSum {

  public int solution(int[] A) {
    // write your code in Java SE 8
    long sum = Integer.MIN_VALUE;
    long maxSum = Integer.MIN_VALUE;

    for (int a : A) {
      sum = Math.max(sum + a, a);
      maxSum = Math.max(sum, maxSum);
    }
    return (int)maxSum;
  }

  public static void main(String[] args) {
    MaxSliceSum mss = new MaxSliceSum();
    System.out.println(mss.solution(new int[] { 3,2,-6,4,0 }));
  }

  /**
   * N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다. 0 ≤ P ≤ Q < N과 같은 한 쌍의 정수(P, Q)를 배열 A의 조각이라고 합니다. 조각(P, Q)의 합은 A[P] + A[P +1] + ... + A[Q].
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 배열 A가 주어지면 A 조각의 최대 합을 반환합니다.
   *
   * 예를 들어, 주어진 배열 A는 다음과 같습니다.
   *
   * A[0] = 3 A[1] = 2 A[2] = -6
   * A[3] = 4 A[4] = 0
   * 함수는 다음과 같은 이유로 5를 반환해야 합니다.
   *
   * (3, 4)는 합이 4인 A 조각입니다.
   * (2, 2)는 합이 -6인 A 조각입니다.
   * (0, 1)은 합이 5인 A 조각입니다.
   * A의 다른 슬라이스에는 (0, 1)보다 큰 합이 없습니다.
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..1,000,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−1,000,000..1,000,000] 범위 내의 정수입니다.
   * 결과는 [−2,147,483,648..2,147,483,647] 범위의 정수가 됩니다.
   */
}
