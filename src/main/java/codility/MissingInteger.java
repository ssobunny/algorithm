package codility;

import java.util.HashSet;

public class MissingInteger {

  public int solution(int[] A) {
    // write your code in Java SE 8
    HashSet<Integer> nums = new HashSet<Integer>();
    for(int i = 1; i<=A.length+1; i++) {
      nums.add(i);
    }

    for(int a : A) {
      nums.remove(new Integer(a));
    }

    return nums.iterator().next();
  }

  public static void main(String[] args) {
    MissingInteger mi = new MissingInteger();
    System.out.println(mi.solution(new int[] { -1, -2 }));
  }

  /**
   * 이것은 데모 작업입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N 정수의 배열 A가 주어지면 A에서 발생하지 않는 가장 작은 양의 정수(0보다 큼)를 반환합니다.
   *
   * 예를 들어, A = [1, 3, 6, 4, 1, 2]가 주어지면 함수는 5를 반환해야 합니다.
   *
   * A = [1, 2, 3]이 주어지면 함수는 4를 반환해야 합니다.
   *
   * A = [−1, −3]이 주어지면 함수는 1을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−1,000,000..1,000,000] 범위의 정수입니다.
   */
}
