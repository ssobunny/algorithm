package codility;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

  private int dominator;
  private int dominatorCount;

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
        dominator = a;
        dominatorCount = counters.get(a);
      }
    }

    int equiLeaders = 0;

    int leadersInRightSide = dominatorCount;
    int countRightSide = A.length;
    int countLeftSide = 0;
    int leadersInLeftSide = 0;
    for(int i=0; i<A.length; i++) {
      if(A[i] == dominator) {
        leadersInRightSide--;
        leadersInLeftSide++;
      }
      countLeftSide++;
      countRightSide--;

      if(leadersInLeftSide > countLeftSide / 2) {
        if(leadersInRightSide > countRightSide / 2) {
          equiLeaders++;
        }
      }
    }
    return equiLeaders;
  }

  public static void main(String[] args) {
    EquiLeader el = new EquiLeader();
    System.out.println(el.solution(new int[] { 4,3,4,4,4,2 }));
  }
  /**
   *N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다.
   *
   * 이 배열의 리더는 A 요소의 절반 이상에서 발생하는 값입니다.
   *
   * 등위 리더는 0 ≤ S < N − 1 및 두 개의 시퀀스 A[0], A[1], ..., A[S] 및 A[S + 1], A[S + 2가 되는 인덱스 S입니다. ], ..., A[N − 1]은 같은 값의 지시선을 가집니다.
   *
   * 예를 들어, 주어진 배열 A는 다음과 같습니다.
   *
   *     A[0] = 4
   *     A[1] = 3
   *     A[2] = 4
   *     A[3] = 4
   *     A[4] = 4
   *     A[5] = 2
   * 우리는 두 개의 동등한 지도자를 찾을 수 있습니다.
   *
   * 시퀀스: (4)와 (3, 4, 4, 4, 2)는 값이 4인 동일한 리더를 갖기 때문에 0입니다.
   * 2, 시퀀스: (4, 3, 4) 및 (4, 4, 2)의 값이 4인 동일한 리더가 있기 때문입니다.
   * 목표는 동등한 지도자의 수를 계산하는 것입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 비어 있지 않은 배열 A가 주어지면 등가 리더의 수를 반환합니다.
   *
   * 예를 들면 다음과 같습니다.
   *
   *     A[0] = 4
   *     A[1] = 3
   *     A[2] = 4
   *     A[3] = 4
   *     A[4] = 4
   *     A[5] = 2
   * 함수는 위에서 설명한 대로 2를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−1,000,000,000..1,000,000,000] 범위의 정수입니다.
   */
}
