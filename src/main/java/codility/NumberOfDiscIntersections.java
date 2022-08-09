package codility;

public class NumberOfDiscIntersections {

  public int solution(int[] A) {
    // write your code in Java SE 8
    int[] starts = new int[A.length];
    for (int i=0; i<A.length; i++) {
      int radius = A[i];
      int startPos = i-radius;
      if (startPos < 0) {
        startPos = 0;
      }
      starts[startPos]++;
    }

    int total = 0;
    for (int i=0; i<starts.length; i++) {
      total += starts[i];
      starts[i] = total;
    }

    int totalIntersections = 0;
    for (long i=0; i<A.length; i++) {
      long radius = A[(int)i];
      long endPos = i+radius;
      if (endPos > A.length - 1) {
        endPos = A.length - 1;
      }
      int intersections = (int)Math.max(starts[(int)i], starts[(int)endPos]) - ((int)i+1);
      totalIntersections += intersections;
      if (totalIntersections > 10000000) {
        return -1;
      }
    }
    return totalIntersections;
  }

  public static void main(String[] args) {
    NumberOfDiscIntersections nodi = new NumberOfDiscIntersections();
    System.out.println(nodi.solution(new int[] { 1,5,2,1,4,0 }));
  }

  /**
   * 평면에 N 개의 디스크를 그립니다. 디스크의 번호는 0에서 N - 1입니다. 디스크의 반지름을 지정하는 N개의 음이 아닌 정수의 배열 A가 제공됩니다. J 번째 디스크는 중심이 (J, 0)이고 반지름이 A[J]인 상태로 그려집니다.
   *
   * J ≠ K와 J 번째 및 K 번째 디스크에 최소한 하나의 공통점이 있으면 J 번째 디스크와 K 번째 디스크가 교차한다고 말합니다(디스크에 경계가 포함되어 있다고 가정).
   *
   * 아래 그림은 다음과 같이 N = 6 및 A에 대해 그려진 디스크를 보여줍니다.
   *
   *   A[0] = 1
   *   A[1] = 5
   *   A[2] = 2
   *   A[3] = 1
   *   A[4] = 4
   *   A[5] = 0
   *
   *
   * 다음과 같이 교차하는 11개의(순서 없는) 디스크 쌍이 있습니다.
   *
   * 디스크 1과 4는 교차하고 둘 다 다른 모든 디스크와 교차합니다.
   * 디스크 2는 디스크 0 및 3과도 교차합니다.
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * 위에서 설명한 N개의 디스크를 설명하는 배열 A가 주어지면 교차하는 디스크의 (순서 없는) 쌍의 수를 반환합니다. 함수는 교차 쌍의 수가 10,000,000을 초과하면 -1을 반환해야 합니다.
   *
   * 위에 표시된 배열 A가 주어지면 함수는 위에서 설명한 대로 11을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [0..2,147,483,647] 범위의 정수입니다.
   */
}
