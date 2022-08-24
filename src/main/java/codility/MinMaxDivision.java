package codility;

public class MinMaxDivision {

  public int solution(int K, int M, int[] A) {
    // write your code in Java SE 8
    int min = 0;
    int max = 0;
    for (int a : A) {
      max += a;
      min = Math.max(min, a);
    }

    int bestAnswer = max;

    while (min <= max) {
      int mid = (min + max) / 2;
      int blocks = checkBlocks(A, mid);
      if (blocks > K) {
        min = mid + 1;
      } else {
        max = mid - 1;
        if (mid < bestAnswer) {
          bestAnswer = mid;
        }
      }
    }
    return bestAnswer;
  }

  private int checkBlocks(int[] A, int guess) {
    int blocks = 1;
    int blockSum = 0;

    for (int a : A) {
      blockSum += a;
      if (blockSum > guess) {
        blockSum = a;
        blocks++;
      }
    }
    return blocks;
  }

  public static void main(String[] args) {
    MinMaxDivision mmd = new MinMaxDivision();
    System.out.println(mmd.solution(3, 5, new int[] { 2, 1, 5, 1, 2, 2, 2 }));
  }

  /**
   * [문제]
   * 정수 K, M 및 N 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다. 배열의 모든 요소는 M보다 크지 않습니다.
   *
   * 이 배열을 연속 요소의 K 블록으로 나누어야 합니다. 블록의 크기는 0에서 N 사이의 정수입니다. 배열의 모든 요소는 일부 블록에 속해야 합니다.
   *
   * X에서 Y까지의 블록 합계는 A[X] + A[X + 1] + ... + A[Y]와 같습니다. 빈 블록의 합은 0입니다.
   *
   * 큰 합계는 모든 블록의 최대 합계입니다.
   *
   * 예를 들어, 다음과 같은 정수 K = 3, M = 5 및 배열 A가 제공됩니다.
   *
   *   A[0] = 2
   *   A[1] = 1
   *   A[2] = 5
   *   A[3] = 1
   *   A[4] = 2
   *   A[5] = 2
   *   A[6] = 2
   * 배열은 예를 들어 다음 블록으로 나눌 수 있습니다.
   *
   * [2, 1, 5, 1, 2, 2, 2], [], [] 총합이 15입니다.
   * [2], [1, 5, 1, 2], [2, 2] 큰 합이 9입니다.
   * [2, 1, 5], [], [1, 2, 2, 2] 큰 합이 8입니다.
   * [2, 1], [5, 1], [2, 2, 2] 큰 합이 6입니다.
   * 목표는 큰 금액을 최소화하는 것입니다. 위의 예에서 6은 최소 큰 합계입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int K, int M, int[] A); }
   *
   * 주어진 정수 K, M 및 N 정수로 구성된 비어 있지 않은 배열 A는 최소 큰 합계를 반환합니다.
   *
   * 예를 들어, 주어진 K = 3, M = 5 및 배열 A는 다음과 같습니다.
   *
   *   A[0] = 2
   *   A[1] = 1
   *   A[2] = 5
   *   A[3] = 1
   *   A[4] = 2
   *   A[5] = 2
   *   A[6] = 2
   * 함수는 위에서 설명한 대로 6을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N 및 K는 [1..100,000] 범위 내의 정수입니다.
   * M은 [0..10,000] 범위 내의 정수이고;
   * 배열 A의 각 요소는 [0..M] 범위 내의 정수입니다.
   */
}
