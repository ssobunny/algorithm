package codility;


import java.util.HashSet;

public class AbsDistinct {

  public int solution(int[] A) {
    // write your code in Java SE 8
    HashSet<Long> distinctValues = new HashSet<>(); //HashSet: 순서X, nullO, 중복X
    int count = 0;
    for (int a : A) {
      if (distinctValues.contains(Math.abs((long)a))) { //Math.abs: 절대값을 반환하는 함수 (인자: int, float, long, double ...)

      } else {
        distinctValues.add(Math.abs((long)a));
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    AbsDistinct ad = new AbsDistinct();
    System.out.println(ad.solution(new int[] { -5, -3, -1, 0, 3, 6 }));
  }

  /**
   * N개의 숫자로 구성된 비어 있지 않은 배열 A가 제공됩니다. 배열은 내림차순으로 정렬됩니다. 이 배열의 절대 고유 개수는 배열 요소 간의 고유 절대 값 수입니다.
   *
   * 예를 들어, 다음과 같은 배열 A를 고려하십시오.
   *
   *   A[0] = -5
   *   A[1] = -3
   *   A[2] = -1
   *   A[3] = 0
   *   A[4] = 3
   *   A[5] = 6
   * 이 배열의 요소 사이에 5개의 고유한 절대값, 즉 0, 1, 3, 5 및 6이 있기 때문에 이 배열의 절대 고유 개수는 5입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 숫자로 구성된 비어 있지 않은 배열 A가 주어지면 배열 A의 절대 고유 개수를 반환합니다.
   *
   * 예를 들어, 주어진 배열 A는 다음과 같습니다.
   *
   *   A[0] = -5
   *   A[1] = -3
   *   A[2] = -1
   *   A[3] = 0
   *   A[4] = 3
   *   A[5] = 6
   * 함수는 위에서 설명한 대로 5를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−2,147,483,648..2,147,483,647] 범위의 정수입니다.
   * 배열 A는 내림차순으로 정렬됩니다.
   */
}
