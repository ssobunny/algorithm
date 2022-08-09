package codility;

public class MaxCounters {

  public int[] solution(int N, int[] A) {
    // write your code in Java SE 8
    int maxValue = 0;
    int minValue = 0;

    int[] counters = new int[N];

    for(int i=0; i<A.length; i++) {
      int operation = A[i];
      if(operation == N+1) {
        //Max value operation
        minValue = maxValue;
      } else {
        //Increment operation
        operation--;
        counters[operation] = Math.max(counters[operation]+1, minValue+1);
        maxValue = Math.max(maxValue, counters[operation]);
      }
    }

    for(int i=0; i<counters.length; i++) {
      counters[i] = Math.max(counters[i], minValue);
    }
    return counters;
  }

  public static void main(String[] args) {
    MaxCounters mc = new MaxCounters();

    int[] result = mc.solution(5, new int[] { 3,4,4,6,1,4,4 });
    for(int i : result) {
      System.out.println(i);
    }
  }

  /**
   * 처음에는 0으로 설정된 N 개의 카운터가 제공되며 두 가지 작업이 가능합니다.
   *
   * 증가(X) - 카운터 X가 1만큼 증가하고,
   * 최대 카운터 - 모든 카운터는 모든 카운터의 최대값으로 설정됩니다.
   * M개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다. 이 배열은 연속 작업을 나타냅니다.
   *
   * A[K] = X, 1 ≤ X ≤ N인 경우 연산 K는 증가(X),
   * A[K] = N + 1이면 작업 K는 최대 카운터입니다.
   * 예를 들어, 주어진 정수 N = 5와 배열 A는 다음과 같습니다.
   *
   *     A[0] = 3
   *     A[1] = 4
   *     A[2] = 4
   *     A[3] = 6
   *     A[4] = 1
   *     A[5] = 4
   *     A[6] = 4
   * 각 연속 작업 후 카운터 값은 다음과 같습니다.
   *
   *     (0, 0, 1, 0, 0)
   *     (0, 0, 1, 1, 0)
   *     (0, 0, 1, 2, 0)
   *     (2, 2, 2, 2, 2)
   *     (3, 2, 2, 2, 2)
   *     (3, 2, 2, 3, 2)
   *     (3, 2, 2, 4, 2)
   * 목표는 모든 작업 후에 모든 카운터의 값을 계산하는 것입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int[] 솔루션(int N, int[] A); }
   *
   * 정수 N과 M 정수로 구성된 비어 있지 않은 배열 A가 주어지면 카운터 값을 나타내는 정수 시퀀스를 반환합니다.
   *
   * 결과 배열은 정수 배열로 반환되어야 합니다.
   *
   * 예를 들면 다음과 같습니다.
   *
   *     A[0] = 3
   *     A[1] = 4
   *     A[2] = 4
   *     A[3] = 6
   *     A[4] = 1
   *     A[5] = 4
   *     A[6] = 4
   * 함수는 위에서 설명한 대로 [3, 2, 2, 4, 2]를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N 및 M은 [1..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [1..N + 1] 범위 내의 정수입니다.
   */
}
