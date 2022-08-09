package codility;

public class Ladder {

  public int[] solution(int[] A, int[] B) {
    // write your code in Java SE 8
    int[] result = new int[A.length];
    int[] fibonacci = getFibonacci(A.length);
    for (int i=0; i<A.length; i++) {
      result[i] = fibonacci[A[i]] % (1 << B[i]);
    }
    return result;
  }

  private int[] getFibonacci(int length) {
    int[] fibonacci = new int[length + 2];
    fibonacci[1] = 1;
    fibonacci[2] = 2;
    for (int i=3; i<=length; i++) {
      fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1]) % (1 << 30);
    }
    return fibonacci;
  }

  public static void main(String[] args) {
    Ladder l = new Ladder();
    System.out.println(l.solution(new int[] { 4, 4, 5, 5, 1 }, new int[] { 3, 2, 4, 3, 1 }));
  }

  /**
   * 사다리를 타고 올라가야 합니다. 사다리에는 1에서 N까지 번호가 매겨진 정확히 N개의 가로대가 있습니다. 각 단계에서 한 단계 또는 두 단계씩 올라갈 수 있습니다. 더 정확하게:
   *
   * 첫 번째 단계로 1단 또는 2단에 설 수 있습니다.
   * 단계 K에 있는 경우 단계 K + 1 또는 K + 2로 이동할 수 있습니다.
   * 결국 N단계에 서야 합니다.
   * 당신의 임무는 사다리의 꼭대기에 오르는 다양한 방법의 수를 세는 것입니다.
   *
   * 예를 들어, N = 4일 때 다음과 같이 5가지 다른 등반 방법이 있습니다.
   *
   * 1, 1, 1 및 1 렁,
   * 1, 1 및 2 횡선,
   * 1, 2 및 1 횡선,
   * 2, 1 및 1 횡선 및
   * 2단과 2단.
   * N = 5가 주어지면 다음과 같은 8가지 다른 등반 방법이 있습니다.
   *
   * 1, 1, 1, 1 및 1 렁,
   * 1, 1, 1 및 2 횡선,
   * 1, 1, 2 및 1 렁,
   * 1, 2, 1 및 1 렁,
   * 1, 2 및 2 횡선,
   * 2, 1, 1 및 1 횡선,
   * 2, 1 및 2 횡선 및
   * 2, 2 및 1 렁.
   * 다른 방법의 수는 매우 클 수 있으므로 주어진 정수 P에 대해 모듈로 2P 결과를 반환하는 것으로 충분합니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int[] 솔루션(int[] A, int[] B); }
   *
   * L 정수로 구성된 비어 있지 않은 두 배열 A와 B가 주어지면 연속적인 답변을 지정하는 L 정수로 구성된 배열을 반환합니다. 위치 I에는 2B[I] 모듈로 A[I] 가로대가 있는 사다리를 오르는 다양한 방법의 수가 포함되어야 합니다.
   *
   * 예를 들어, 주어진 L = 5 및:
   *
   *     A[0] = 4 B[0] = 3
   *     A[1] = 4 B[1] = 2
   *     A[2] = 5 B[2] = 4
   *     A[3] = 5 B[3] = 3
   *     A[4] = 1 B[4] = 1
   * 함수는 위에서 설명한 대로 [5, 1, 8, 0, 1] 시퀀스를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * L은 [1..50,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [1..L] 범위 내의 정수입니다.
   * 배열 B의 각 요소는 [1..30] 범위 내의 정수입니다.
   */
}
