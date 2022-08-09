package codility;

public class OddoccurrencesInArray {
  public int solution(int[] A) {
    if(A.length <= 0) {
      return -1;
    }
    int unpaired = 0;

    for(int i = 0; i < A.length; i++) {
      unpaired ^= A[i]; // ^연산자: 2진수로 표현된 두 비트가 하나는 1이고 다른 하나가 0일 경우 연산 결과가 1로 표현됨
    }
    return unpaired;
  }

  public static void main(String[] args) {
    OddoccurrencesInArray oi = new OddoccurrencesInArray();
    System.out.println(oi.solution(new int[] { 9,3,9,3,9,7,9 }));
  }

  /**
   * N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다. 배열에는 홀수개의 요소가 포함되어 있으며, 배열의 각 요소는 짝을 이루지 않은 한 요소를 제외하고 동일한 값을 가진 다른 요소와 짝을 이룰 수 있습니다.
   *
   * 예를 들어 다음과 같은 배열 A에서:
   *
   *   A[0] = 9 A[1] = 3 A[2] = 9
   *   A[3] = 3 A[4] = 9 A[5] = 7
   *   A[6] = 9
   * 인덱스 0과 2에 있는 요소의 값은 9이고,
   * 인덱스 1과 3에 있는 요소의 값은 3이고,
   * 인덱스 4와 6에 있는 요소의 값은 9이고,
   * 인덱스 5의 요소는 값이 7이고 쌍을 이루지 않습니다.
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * 위의 조건을 충족하는 N개의 정수로 구성된 배열 A가 주어지면 짝을 이루지 않은 요소의 값을 반환합니다.
   *
   * 예를 들어, 주어진 배열 A는 다음과 같습니다.
   *
   *   A[0] = 9 A[1] = 3 A[2] = 9
   *   A[3] = 3 A[4] = 9 A[5] = 7
   *   A[6] = 9
   * 함수는 위의 예에서 설명한 대로 7을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..1,000,000] 범위 내의 홀수 정수입니다.
   * 배열 A의 각 요소는 [1..1,000,000,000] 범위 내의 정수입니다.
   * A 의 값 중 하나를 제외한 모든 값이 짝수번 발생합니다.
   */

}
