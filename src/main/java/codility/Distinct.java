package codility;

import java.util.HashSet;

public class Distinct {

  public int solution(int[] A) {
    // write your code in Java SE 8
    HashSet<Integer> h = new HashSet<>();
    for (int a : A) {
      h.add(a);
    }
    return h.size();
  }

  public static void main(String[] args) {
    Distinct d = new Distinct();
    System.out.println(d.solution(new int[] { 1,2,3,1,2,3 }));
  }

  /**
   * 함수 작성
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 배열 A가 주어지면 배열 A의 고유 값 수를 반환합니다.
   *
   * 예를 들어 주어진 배열 A는 다음과 같은 6개의 요소로 구성됩니다.
   *
   *   A[0] = 2 A[1] = 1 A[2] = 1
   *   A[3] = 2 A[4] = 3 A[5] = 1
   * 배열 A에 1, 2, 3이라는 3개의 고유한 값이 나타나기 때문에 함수는 3을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−1,000,000..1,000,000] 범위의 정수입니다.
   */

}
