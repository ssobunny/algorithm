package codility;

import java.util.Stack;

public class Fish {

  public int solution(int[] A, int[] B) {
    // write your code in Java SE 8
    int survivals = 0;
    Stack<Integer> stack = new Stack<>();

    for (int i=0; i<A.length; i++) {
      int fish = A[i];
      int direction = B[i];
      if (direction == 0) {
        boolean survives = true;
        while (!stack.isEmpty()) {
          int oppFish = stack.pop();
          if (oppFish > fish) {
            stack.push(oppFish);
            survives = false;
            break;
          }
        }
        if (survives) {
          survivals++;
        }
      } else {
        stack.push(fish);
      }
    }
    survivals += stack.size();
    return survivals;
  }

  public static void main(String[] args) {
    Fish f = new Fish();
    System.out.println(f.solution(new int[] { 4,3,2,1,5 }, new int[] { 0,1,0,0,0 }));
  }

  /**
   * N개의 정수로 구성된 두 개의 비어 있지 않은 배열 A와 B가 제공됩니다. 배열 A와 B는 강의 흐름을 따라 하류로 정렬된 N개의 탐욕스러운 물고기를 나타냅니다.
   *
   * 물고기는 0에서 N − 1까지 번호가 매겨집니다. P와 Q가 두 마리의 물고기이고 P < Q이면 물고기 P는 처음에 물고기 Q의 상류에 있습니다. 처음에는 각 물고기가 고유한 위치를 갖습니다.
   *
   * 물고기 번호 P는 A[P]와 B[P]로 표시됩니다. 배열 A는 물고기의 크기를 포함합니다. 모든 요소는 고유합니다. 배열 B는 물고기의 방향을 포함합니다. 여기에는 0 및/또는 1만 포함됩니다. 여기서:
   *
   * 0은 상류로 흐르는 물고기를 나타내고,
   * 1은 하류로 흐르는 물고기를 나타낸다.
   * 두 물고기가 반대 방향으로 움직이고 그 사이에 다른 (살아 있는) 물고기가 없으면 결국 서로 만날 것입니다. 그러면 한 마리의 물고기만 살아남을 수 있습니다. 큰 물고기가 작은 물고기를 잡아먹습니다. 좀 더 정확히 말하면 두 물고기 P와 Q는 P < Q, B[P] = 1, B[Q] = 0일 때 서로 만나고, 그들 사이에 살아있는 물고기가 없다고 합니다. 그들이 만난 후:
   *
   * A[P] > A[Q]이면 P는 Q를 먹고 P는 여전히 하류로 흐르고,
   * A[Q] > A[P]이면 Q가 P를 먹고 Q는 여전히 상류로 흐를 것입니다.
   * 우리는 모든 물고기가 같은 속도로 흐르고 있다고 가정합니다. 즉, 같은 방향으로 움직이는 물고기는 결코 만나지 않습니다. 목표는 살아남을 물고기의 수를 계산하는 것입니다.
   *
   * 예를 들어, 다음과 같은 배열 A와 B를 고려하십시오.
   *
   *   A[0] = 4 B[0] = 0
   *   A[1] = 3 B[1] = 1
   *   A[2] = 2 B[2] = 0
   *   A[3] = 1 B[3] = 0
   *   A[4] = 5 B[4] = 0
   * 처음에는 모든 물고기가 살아 있고 1번 물고기를 제외한 모든 물고기가 상류로 이동하고 있습니다. 1번 물고기가 2번 물고기를 만나서 먹고, 3번 물고기를 만나 자기도 먹습니다. 마지막으로 물고기 4번을 만나 잡아 먹습니다. 나머지 두 물고기(0번과 4번)는 만나지 않고 따라서 살아남습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A, int[] B); }
   *
   * N개의 정수로 구성된 두 개의 비어 있지 않은 배열 A와 B가 주어지면 살아남을 물고기의 수를 반환합니다.
   *
   * 예를 들어, 위에 표시된 배열이 주어지면 위에서 설명한 대로 함수는 2를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [0..1,000,000,000] 범위 내의 정수입니다.
   * 배열 B의 각 요소는 다음 값 중 하나를 가질 수 있는 정수입니다. 0, 1;
   * A의 요소는 모두 별개입니다.
   */

}
