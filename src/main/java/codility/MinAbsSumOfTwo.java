package codility;

import java.util.Arrays;

public class MinAbsSumOfTwo {

  public int solution(int[] A) {
    // write your code in Java SE 8
    int N = A.length;
    Arrays.sort(A);
    int tail = 0;
    int head = N - 1;
    int minAbsSum = Math.abs(A[tail] + A[head]);
    while (tail <= head) {
      int currentSum = A[tail] + A[head];
      minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
      // If the sum has become
      // positive, we should know that the head can be moved left
      if (currentSum <= 0)
        tail++;
      else
        head--;
    }
    return minAbsSum;
  }

  public static void main(String[] args) {
    MinAbsSumOfTwo mast = new MinAbsSumOfTwo();
    System.out.println(mast.solution(new int[] {-8, 4, 5, -10, 3}));
  }

  /**
   * A를 N개의 정수로 구성된 비어 있지 않은 배열이라고 하자.
   *
   * 한 쌍의 인덱스(P, Q)에 대한 2의 절대 합은 0 ≤ P ≤ Q < N에 대한 절대값 |A[P] + A[Q]|입니다.
   *
   * 예를 들어 다음 배열 A:
   *
   *   A[0] = 1
   *   A[1] = 4
   *   A[2] = -3
   * 인덱스 쌍 (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2)가 있습니다.
   * 쌍 (0, 0)에 대한 2의 절대 합은 A[0] + A[0] = |1 + 1| = 2.
   * 쌍 (0, 1)에 대한 2의 절대 합은 A[0] + A[1] = |1 + 4| = 5.
   * 쌍 (0, 2)에 대한 2의 절대 합은 A[0] + A[2] = |1 + (−3)| = 2.
   * 쌍 (1, 1)에 대한 2의 절대 합은 A[1] + A[1] = |4 + 4| = 8.
   * 쌍 (1, 2)에 대한 2의 절대 합은 A[1] + A[2] = |4 + (−3)| = 1.
   * 쌍 (2, 2)에 대한 2의 절대 합은 A[2] + A[2] = |(−3) + (−3)| = 6.
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 비어 있지 않은 배열 A가 주어지면 이 배열의 인덱스 쌍에 대해 2의 최소 abs 합을 반환합니다.
   *
   * 예를 들어 다음 배열 A가 있다고 가정합니다.
   *
   *   A[0] = 1
   *   A[1] = 4
   *   A[2] = -3
   * 함수는 위에서 설명한 대로 1을 반환해야 합니다.
   *
   * 주어진 배열 A:
   *
   *   A[0] = -8
   *   A[1] = 4
   *   A[2] = 5
   *   A[3] =-10
   *   A[4] = 3
   * 함수는 |(−8) + 5|를 반환해야 합니다. = 3.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−1,000,000,000..1,000,000,000] 범위의 정수입니다.
   */
}
