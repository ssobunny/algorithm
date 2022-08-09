package codility;

import java.util.ArrayList;
import java.util.List;

public class CountSemiprimes {

  public int[] solution(int N, int[] P, int[] Q) {
    // write your code in Java SE 8
    /**
     * Find Primes (2,3,5,7,11 and 13)
     */
    boolean[] notPrimes = new boolean[N+1];
    for (int a=2; a<=N/2; a++) {
      for (int b=a*2; b<=N; b+=a) {
        notPrimes[b] = true;
      }
    }

    List<Integer> primes = new ArrayList<>();
    for (int a=2; a<=N; a++) {
      if (!notPrimes[a]) {
        primes.add(a);
      }
    }

    /**
     * Find semi-primes (4,6,9,10,14,15,21,22,25,26)
     */
    int[] semiPrimes = new int[N+1];
    for (int a=0; a<primes.size()-1; a++) {
      for (int b=a; b<primes.size()-1; b++) {
        int primea = primes.get(a);
        int primeb = primes.get(b);
        if ((long)primea*primeb >= semiPrimes.length) {
          break;
        }
        semiPrimes[primea*primeb] = 1;
      }
    }

    int c = 0;
    for (int i=0; i<semiPrimes.length; i++) {
      c += semiPrimes[i];
      semiPrimes[i] = c;
    }

    /**
     * Get result
     */
    int[] result = new int[P.length];

    for (int i=0; i<P.length; i++) {
      result[i] = semiPrimes[Q[i]] - semiPrimes[P[i] - 1];
    }
    return result;
  }

  public static void main(String[] args) {
    CountSemiprimes cs = new CountSemiprimes();
    System.out.println(cs.solution(26, new int[] { 1, 4, 16 }, new int[] { 26, 10, 20 }));
  }

  /**
   * 소수는 1과 X라는 두 개의 서로 다른 제수가 있는 양의 정수 X입니다. 처음 몇 개의 소수 정수는 2, 3, 5, 7, 11 및 13입니다.
   *
   * 준소수는 두 개의 소수(반드시 별개일 필요는 없음)의 곱인 자연수입니다. 처음 몇 개의 반소수는 4, 6, 9, 10, 14, 15, 21, 22, 25, 26입니다.
   *
   * 각각 M개의 정수로 구성된 비어 있지 않은 두 개의 배열 P와 Q가 제공됩니다. 이러한 배열은 지정된 범위 내의 반소수에 대한 쿼리를 나타냅니다.
   *
   * 쿼리 K를 사용하려면 1 ≤ P[K] ≤ Q[K] ≤ N인 범위(P[K], Q[K]) 내에서 반소수의 수를 찾아야 합니다.
   *
   * 예를 들어, 다음과 같은 정수 N = 26과 배열 P, Q를 고려하십시오.
   *
   *     P[0] = 1 Q[0] = 26
   *     P[1] = 4 Q[1] = 10
   *     P[2] = 16 Q[2] = 20
   * 각 범위 내에서 반소수의 수는 다음과 같습니다.
   *
   * (1, 26)은 10이고,
   * (4, 10)은 4이고,
   * (16, 20)은 0입니다.
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int[] 솔루션(int N, int[] P, int[] Q); }
   *
   * 정수 N과 M 정수로 구성된 두 개의 비어 있지 않은 배열 P 및 Q가 주어지면 모든 쿼리에 대한 연속적인 답변을 지정하는 M 요소로 구성된 배열을 반환합니다.
   *
   * 예를 들어, 정수 N = 26과 배열 P, Q가 다음과 같은 경우:
   *
   *     P[0] = 1 Q[0] = 26
   *     P[1] = 4 Q[1] = 10
   *     P[2] = 16 Q[2] = 20
   * 함수는 위에서 설명한 대로 값 [10, 4, 0]을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..50,000] 범위 내의 정수입니다.
   * M은 [1..30,000] 범위 내의 정수입니다.
   * 배열 P 및 Q의 각 요소는 [1..N] 범위 내의 정수입니다.
   * 파이[i] ≤ Q[i].
   */
}
