package codility;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

  public int solution(int[] A) {
    // write your code in Java SE 8
    Map<Integer, Integer> counters = new HashMap<>();
    for(int i=0; i<A.length; i++) {
      int a = A[i];
      if(!counters.containsKey(a)) {
        counters.put(a, 1);
      } else {
        counters.put(a, counters.get(a) + 1);
      }
      if(counters.get(a) > A.length/2) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println();
  }
  /**
   *N개의 정수로 구성된 배열 A가 주어집니다. 배열 A의 도미네이터는 A의 요소 중 절반 이상에서 발생하는 값입니다.
   *
   * 예를 들어, 다음과 같은 배열 A를 고려하십시오.
   *
   *  A[0] = 3 A[1] = 4 A[2] = 3
   *  A[3] = 2 A[4] = 3 A[5] = -1
   *  A[6] = 3 A[7] = 3
   * A의 도미네이터는 A의 8개 요소 중 5개(즉, 인덱스 0, 2, 4, 6 및 7이 있는 요소)에서 발생하고 5가 8의 절반 이상이기 때문에 3입니다.
   *
   * 함수 작성
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 배열 A가 주어지면 A의 지배자가 발생하는 배열 A의 모든 요소의 인덱스를 반환합니다. 배열 A에 도미네이터가 없으면 함수는 -1을 반환해야 합니다.
   *
   * 예를 들어, 다음과 같은 배열 A가 주어졌을 때
   *
   *  A[0] = 3 A[1] = 4 A[2] = 3
   *  A[3] = 2 A[4] = 3 A[5] = -1
   *  A[6] = 3 A[7] = 3
   * 함수는 위에서 설명한 대로 0, 2, 4, 6 또는 7을 반환할 수 있습니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−2,147,483,648..2,147,483,647] 범위의 정수입니다.
   */
}
