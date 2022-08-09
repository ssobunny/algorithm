package codility;

public class NumberSolitaire {

  public int solution(int[] A) {
    // write your code in Java SE 8
    // main idea:
    // using "dynamic programming" to build up the solution
    // (bottom up)

    int[] dp = new int[A.length];
    dp[0] = A[0];

    // build up from "dp[1], dp[2], ..., dp[A.length-1]"
    for(int i=1; i<A.length; i++){

      // keep the biggest one
      // be very careful: could be negtive (so use Integer.MIN_VALUE)
      int max = Integer.MIN_VALUE;

      // a die could be "1 to 6"
      for(int die=1; die<=6; die++){
        if( i-die >= 0){
          // very important: not "A[i-die]+A[i]"
          // instead, have to use "dp[i-die]+A[i]"
          max = Math.max( dp[i-die]+A[i], max );
          // dynamic programming:
          // take the best:
          // takeBest( dp[i-j] + value[j], curBest )
        }
      }
      dp[i] = max; // keep the best one as the dp value
    }

    return dp[A.length-1];
  }

  public static void main(String[] args) {
    NumberSolitaire ns = new NumberSolitaire();
    System.out.println(ns.solution(new int[] { 1, -2, 0, 9, -1, -2 }));
  }

  /**
   * 1인용 게임은 0에서 N - 1까지 번호가 매겨진 N개의 연속된 사각형으로 구성된 보드에서 진행됩니다. 각 사각형에는 숫자가 적혀 있습니다. N개의 정수로 구성된 비어 있지 않은 배열 A는 사각형에 쓰여진 숫자를 포함합니다. 또한 게임 중에 일부 사각형을 표시할 수 있습니다.
   *
   * 게임이 시작될 때 0번 칸에 자갈이 하나 있고 이것은 보드에서 유일하게 표시되어 있는 칸입니다. 게임의 목표는 자갈을 제곱수 N − 1로 옮기는 것입니다.
   *
   * 각 턴 동안 우리는 1에서 6까지의 숫자가 있는 6면체 주사위를 던지고 주사위가 정지한 후 윗면에 표시되는 숫자 K를 고려합니다. 그런 다음 정사각형 숫자 I + K가 존재하는 경우 정사각형 숫자 I에 서 있는 조약돌을 정사각형 숫자 I + K로 이동합니다. 제곱수 I + K가 존재하지 않으면 유효한 움직임을 얻을 때까지 주사위를 다시 던집니다. 마지막으로 제곱수 I + K를 표시합니다.
   *
   * 게임이 끝나면(자갈이 정사각형 숫자 N-1에 서 있을 때) 결과를 계산합니다. 게임의 결과는 표시된 모든 사각형에 쓰여진 숫자의 합입니다.
   *
   * 예를 들어 다음 배열이 제공됩니다.
   *
   *     A[0] = 1
   *     A[1] = -2
   *     A[2] = 0
   *     A[3] = 9
   *     A[4] = -1
   *     A[5] = -2
   * 한 가지 가능한 게임은 다음과 같을 수 있습니다.
   *
   * 자갈은 표시된 0번 정사각형에 있습니다.
   * 우리는 3을 던졌습니다. 자갈이 0번 사각형에서 3번 사각형으로 이동합니다. 우리는 정사각형 숫자 3을 표시합니다.
   * 우리는 5를 던졌습니다. 보드에 8이 없기 때문에 자갈은 움직이지 않습니다.
   * 우리는 2를 던진다. 자갈이 5번 칸으로 이동합니다. 이 사각형을 표시하면 게임이 종료됩니다.
   * 표시된 사각형은 0, 3, 5이므로 게임의 결과는 1 + 9 + (−2) = 8입니다. 이것이 이 보드에서 얻을 수 있는 최대한의 결과입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N 정수의 비어 있지 않은 배열 A가 주어지면 배열 A로 표시되는 보드에서 얻을 수 있는 최대 결과를 반환합니다.
   *
   * 예를 들어, 주어진 배열
   *
   *     A[0] = 1
   *     A[1] = -2
   *     A[2] = 0
   *     A[3] = 9
   *     A[4] = -1
   *     A[5] = -2
   * 함수는 위에서 설명한 대로 8을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [2..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [−10,000..10,000] 범위 내의 정수입니다.
   * 저작권 2009–2022 by Codility Limited. 판권 소유. 무단 전재, 출판, 공개를 금합니다.
   */
}
