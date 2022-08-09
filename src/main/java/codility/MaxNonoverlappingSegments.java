package codility;

public class MaxNonoverlappingSegments {

  public int solution(int[] A, int[] B) {
    // write your code in Java SE 8
    int N = A.length;
    if (N <= 1) {
      return N;
    }

    int cnt = 1;
    int prev_end = B[0];

    int curr;
    for (curr = 1; curr < N; curr++) {
      if (A[curr] > prev_end) {
        cnt++;
        prev_end = B[curr];
      }
    }

    return cnt;
  }

  public static void main(String[] args) {
    MaxNonoverlappingSegments mnls = new MaxNonoverlappingSegments();
    System.out.println(mnls.solution(
        new int[] {1, 3, 7, 9, 9},
        new int[] {5, 6, 8, 9, 10}
    ));
  }

  /**
   * 한 줄에 0에서 N − 1까지 번호가 매겨진 N개의 세그먼트가 있으며, 그 위치는 배열 A와 B로 지정됩니다. 각 I(0 ≤ I < N)에 대해 세그먼트 I의 위치는 A[I]에서 B[ 나] (포함). 세그먼트는 끝을 기준으로 정렬됩니다. 즉, 0 ≤ K < N − 1이 되도록 K에 대해 B[K] ≤ B[K + 1]입니다.
   *
   * I ≠ J와 같은 두 개의 세그먼트 I 및 J는 적어도 하나의 공통점을 공유하는 경우 겹칩니다. 즉, A[I] ≤ A[J] ≤ B[I] 또는 A[J] ≤ A[I] ≤ B[J]입니다.
   *
   * 두 개의 겹치는 세그먼트가 포함되어 있지 않으면 세그먼트 집합이 겹치지 않는다고 말합니다. 목표는 최대 세그먼트 수를 포함하는 겹치지 않는 집합의 크기를 찾는 것입니다.
   *
   * 예를 들어, 다음과 같은 배열 A, B를 고려하십시오.
   *
   *     A[0] = 1 B[0] = 5
   *     A[1] = 3 B[1] = 6
   *     A[2] = 7 B[2] = 8
   *     A[3] = 9 B[3] = 9
   *     A[4] = 9 B[4] = 10
   * 세그먼트는 아래 그림에 나와 있습니다.
   *
   *
   *
   * 최대 세그먼트 수를 포함하는 겹치지 않는 집합의 크기는 3입니다. 예를 들어 가능한 집합은 {0, 2, 3}, {0, 2, 4}, {1, 2, 3} 또는 {1, 2, 4}. 4개의 세그먼트가 있는 겹치지 않는 집합이 없습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A, int[] B); }
   *
   * N개의 정수로 구성된 두 개의 배열 A와 B가 주어지면 최대 세그먼트 수를 포함하는 겹치지 않는 집합의 크기를 반환합니다.
   *
   * 예를 들어, 위에 표시된 배열 A, B가 주어지면 함수는 위에서 설명한 대로 3을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..30,000] 범위 내의 정수입니다.
   * 배열 A와 B의 각 요소는 [0..1,000,000,000] 범위 내의 정수입니다.
   * A[I] ≤ B[I], 각 I에 대해 (0 ≤ I < N);
   * B[K] ≤ B[K + 1], 각 K에 대해(0 ≤ K < N − 1).
   */
}
