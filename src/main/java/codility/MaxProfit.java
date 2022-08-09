package codility;

public class MaxProfit {

  public int solution(int[] A) {
    // write your code in Java SE 8
    int maxProfit = 0;
    int cumulativeProfit = 0;

    for (int i=1; i<A.length; i++) {
      int profitThisDay = A[i] - A[i-1];
      if (profitThisDay > maxProfit) {
        maxProfit = profitThisDay;
      }
      cumulativeProfit += profitThisDay;
      if (cumulativeProfit > 0) {
        if (cumulativeProfit > maxProfit) {
          maxProfit = cumulativeProfit;
        }
      } else {
        cumulativeProfit = 0;
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    MaxProfit mp = new MaxProfit();
    System.out.println(mp.solution(new int[] { 23171, 21011, 21123, 21366, 21013, 21367 }));
  }

  /**
   * N개의 정수로 구성된 배열 A가 주어집니다. 여기에는 연속 N일 동안의 주식의 일일 가격이 포함됩니다. 0 ≤ P ≤ Q < N일 때 단일 주식을 P일에 매수하고 Q일에 매도한 경우 해당 거래의 이익은 A[Q] − A[P]와 같습니다. 단, A[Q] ≥ 에이[피]. 그렇지 않으면 트랜잭션은 A[P] − A[Q]의 손실을 가져옵니다.
   *
   * 예를 들어, 다음과 같은 6개의 요소로 구성된 다음 배열 A를 고려하십시오.
   *
   *   A[0] = 23171
   *   A[1] = 21011
   *   A[2] = 21123
   *   A[3] = 21366
   *   A[4] = 21013
   *   A[5] = 21367
   * 주식을 0일에 사고 2일에 팔면 A[2] − A[0] = 21123 − 23171 = −2048이므로 2048의 손실이 발생합니다. 주식을 4일에 사고 5일에 팔면 A[5] − A[4] = 21367 − 21013 = 354이므로 354의 이익이 발생합니다. 가능한 최대 이익은 356입니다. 1일에 사서 5일에 팔았다.
   *
   * 함수를 작성하고,
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * 연속 N일 동안 주식의 일일 가격을 포함하는 N 정수로 구성된 배열 A가 주어지면 이 기간 동안 한 거래에서 가능한 최대 이익을 반환합니다. 이익을 얻을 수 없는 경우 함수는 0을 반환해야 합니다.
   *
   * 예를 들어 주어진 배열 A는 다음과 같은 6개의 요소로 구성됩니다.
   *
   *   A[0] = 23171
   *   A[1] = 21011
   *   A[2] = 21123
   *   A[3] = 21366
   *   A[4] = 21013
   *   A[5] = 21367
   * 함수는 위에서 설명한 대로 356을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..400,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [0..200,000] 범위 내의 정수입니다.
   */

}
