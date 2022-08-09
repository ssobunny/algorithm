package codility;

public class CommonPrimeDivisors {

  public int solution(int[] A, int[] B) {
    // write your code in Java SE 8
    int count = 0;

    for (int i=0; i<A.length; i++) {
      if (hasAllPrimeFactors(A[i], B[i]) && hasAllPrimeFactors(B[i], A[i])) {
        count++;
      }
    }
    return count;
  }

  /**
   * if all the prime factors of Y are factors of X,
   * then Y/gcd(X,Y) will be 1 or also contain only factors of X.
   * @param x
   * @param y
   * @return
   */
  private boolean hasAllPrimeFactors(int x, int y) {
    if (y == 1) {
      return true;
    }
    int gcd = gcd(x, y);
    if (gcd == 1) {
      return false;
    }
    return hasAllPrimeFactors(x, y/gcd);
  }

  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }

  public static void main(String[] args) {
    CommonPrimeDivisors cpd = new CommonPrimeDivisors();
    System.out.println(cpd.solution(new int[] { 15, 10, 9 }, new int[] { 75, 30, 5 }));
  }

  /**
   * 소수는 1과 X라는 두 개의 서로 다른 제수가 있는 양의 정수 X입니다. 처음 몇 개의 소수 정수는 2, 3, 5, 7, 11 및 13입니다.
   *
   * 소수 D는 D * K = P와 같은 양의 정수 K가 존재하는 경우 양의 정수 P의 소수라고 합니다. 예를 들어, 2와 5는 20의 소수입니다.
   *
   * 두 개의 양의 정수 N과 M이 주어집니다. 목표는 정수 N과 M의 소수 제수 집합이 정확히 같은지 확인하는 것입니다.
   *
   * 예를 들면 다음과 같습니다.
   *
   * N = 15 및 M = 75, 소수는 동일합니다. {3, 5};
   * N = 10 및 M = 30, 소수는 동일하지 않습니다. {2, 5}는 ​​{2, 3, 5}와 같지 않습니다.
   * N = 9 및 M = 5, 소수는 동일하지 않습니다. {3}은 {5}와 같지 않습니다.
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A, int[] B); }
   *
   * Z 정수의 비어 있지 않은 두 배열 A와 B가 주어지면 A[K]와 B[K]의 소수가 정확히 같은 위치 K의 수를 반환합니다.
   *
   * 예를 들면 다음과 같습니다.
   *
   *     A[0] = 15 B[0] = 75
   *     A[1] = 10 B[1] = 30
   *     A[2] = 3 B[2] = 5
   * 한 쌍(15, 75)만 동일한 소수 제수 집합을 가지므로 함수는 1을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * Z는 [1..6,000] 범위 내의 정수입니다.
   * 배열 A와 B의 각 요소는 [1..2,147,483,647] 범위의 정수입니다.
   */
}
