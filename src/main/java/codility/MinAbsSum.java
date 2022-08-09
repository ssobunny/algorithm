package codility;

import java.util.Arrays;

public class MinAbsSum {

  public int solution(int[] A) {
    // write your code in Java SE 8
    if (A.length == 0) return 0;
    if (A.length == 1) return A[0];

    int sum = 0;
    int max = A[0];

    for (int i = 0; i < A.length; i++) {
      A[i] = Math.abs(A[i]);
      sum += A[i];
      max = Math.max(A[i], max);
    }

    int[] count = new int[max + 1];
    for (int num : A) {
      count[num]++;
    }

    int[] dp = new int[sum + 1];
    Arrays.fill(dp, -1);

    dp[0] = 0;

    for (int i = 0; i <= max; i++) {
      if (count[i] > 0) {
        for (int val = 0; val <= sum; val++) {
          if (dp[val] >= 0) dp[val] = count[i];
          else if (val >= i && dp[val-i] > 0) {
            dp[val] = dp[val-i] - 1;
          }
        }
      }
    }

    int result = sum;
    for (int i = 0; i <= sum/2; i++) {
      if (dp[i] >= 0) result = Math.min(result, sum - (2 * i));
    }
    return result;
  }

  public static void main(String[] args) {
    MinAbsSum mas = new MinAbsSum();
    System.out.println(mas.solution(new int[] { 1, 5, 2, -2 }));
  }

  /**
   * N 정수의 주어진 배열 A와 집합 {−1, 1}의 N 정수 시퀀스 S에 대해 val(A, S)를 다음과 같이 정의합니다.
   *
   * val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
   *
   * (0 요소의 합이 0이라고 가정합니다.)
   *
   * 주어진 배열 A에 대해 val(A,S)를 최소화하는 시퀀스 S를 찾고 있습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N 정수의 배열 A가 주어지면 집합 {−1, 1}에서 N 정수의 가능한 모든 시퀀스 S에 대해 val(A,S)의 모든 가능한 값에서 val(A,S)의 최소값을 계산합니다.
   *
   * 예를 들어, 주어진 배열:
   *
   *    A[0] = 1
   *    A[1] = 5
   *    A[2] = 2
   *    A[3] = -2
   * S = [−1, 1, −1, 1]의 경우 val(A, S) = 0이므로 함수는 0을 반환해야 합니다. 이는 가능한 최소값입니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..20,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−100..100] 범위 내의 정수입니다.
   */
}
