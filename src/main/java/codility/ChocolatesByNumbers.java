package codility;

public class ChocolatesByNumbers {

  //유클리드 호제법: 최대공약수
  //N을 최대공약수로 나눠주면 됨

  public int solution(int N, int M) {
    // write your code in Java SE 8
    return N/gcd(N, M);
  }

  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }

  public static void main(String[] args) {
    ChocolatesByNumbers cbn = new ChocolatesByNumbers();
    System.out.println(cbn.solution(10,4));
  }

  /**
   * 두 개의 양의 정수 N과 M이 주어집니다. 정수 N은 0에서 N - 1까지 번호가 매겨진 원 안에 배열된 초콜릿의 수를 나타냅니다.
   *
   * 초콜릿을 먹기 시작합니다. 초콜릿을 먹고 나면 포장만 남습니다.
   *
   * 초콜릿 번호 0부터 먹기 시작합니다. 그런 다음 원에 있는 다음 M − 1 초콜릿이나 포장지를 생략하고 다음 것을 먹습니다.
   *
   * 더 정확하게 말하면, 초콜릿 숫자 X를 먹었다면 다음에는 숫자 (X + M) 모듈로 N(나누기의 나머지)이 있는 초콜릿을 먹을 것입니다.
   *
   * 빈 포장지를 만나면 식사를 중단합니다.
   *
   * 예를 들어, 주어진 정수 N = 10 및 M = 4. 다음 초콜릿을 먹게 될 것입니다: 0, 4, 8, 2, 6.
   *
   * 목표는 위의 규칙에 따라 먹을 초콜릿의 수를 계산하는 것입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int N, int M); }
   *
   * 두 개의 양의 정수 N과 M이 주어지면 먹을 초콜릿의 수를 반환합니다.
   *
   * 예를 들어, 주어진 정수 N = 10 및 M = 4. 위에서 설명한 대로 함수는 5를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N 및 M은 [1..1,000,000,000] 범위 내의 정수입니다.
   */

  /**
   * 원형으로 만들어진 초콜릿 조각 N개를 M의 간격으로 먹을 때, 먹을 수 있는 초콜릿 조각의 개수는? 단, 먹었던 조각으로 오면 멈춘다.
   * 초콜릿 조각의 위치는 0≤x≤N−1이고, 현재 조각의 위치를 x라 하면, 다음 조각의 위치는 (x+M)%N이다
   * N=10,M=4일 때, 0, 4, 8, 2, 6의 조각을 먹을 수 있다.
   * N,M≤1000000000
   */

}
