package codility;

public class PassingCars {

  public int solution(int[] A) {
    // write your code in Java SE 8
    int count = 0;
    int loopcount = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == 0) {
        loopcount += 1;
      } else {
        count += loopcount;
      }
      if (count > 1000000000) {
        return -1;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    PassingCars pc = new PassingCars();
    System.out.println(pc.solution(new int[]{1}));
  }

  /**
   * N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다. 배열 A의 연속 요소는 도로의 연속 자동차를 나타냅니다.
   *
   * 배열 A에는 0 및/또는 1만 포함됩니다.
   *
   * 0은 동쪽으로 여행하는 자동차를 나타내고,
   * 1은 서쪽으로 여행하는 자동차를 나타냅니다.
   * 목표는 지나가는 자동차를 계산하는 것입니다. P가 동쪽으로 여행하고 Q가 서쪽으로 여행할 때 0 ≤ P < Q < N인 한 쌍의 자동차(P, Q)가 지나가고 있다고 말합니다.
   *
   * 예를 들어, 다음과 같은 배열 A를 고려하십시오.
   *
   *   A[0] = 0
   *   A[1] = 1
   *   A[2] = 0
   *   A[3] = 1
   *   A[4] = 1
   * (0, 1), (0, 3), (0, 4), (2, 3), (2, 4)의 다섯 쌍의 자동차가 지나가고 있습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N 정수의 비어 있지 않은 배열 A가 주어지면 지나가는 자동차 쌍의 수를 반환합니다.
   *
   * 함수는 지나가는 자동차 쌍의 수가 1,000,000,000을 초과하면 -1을 반환해야 합니다.
   *
   * 예를 들면 다음과 같습니다.
   *
   *   A[0] = 0
   *   A[1] = 1
   *   A[2] = 0
   *   A[3] = 1
   *   A[4] = 1
   * 함수는 위에서 설명한 대로 5를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 0, 1 값 중 하나를 가질 수 있는 정수입니다.
   */
}
