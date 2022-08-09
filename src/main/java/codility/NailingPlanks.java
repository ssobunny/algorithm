package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NailingPlanks {

  class Nail implements Comparable<Nail>{

    int index;
    int value;

    public Nail(int index, int value) {
      super();
      this.index = index;
      this.value = value;
    }
    @Override
    public String toString() {
      return "Nail [index=" + index + ", value=" + value + "]";
    }
    @Override
    public int compareTo(Nail o) {
      return value - o.value;
    }

  }

  class Plank implements Comparable<Plank>{
    int start;
    int end;

    public Plank(int start, int end) {
      super();
      this.start = start;
      this.end = end;
    }
    @Override
    public String toString() {
      return "Plank [start=" + start + ", end=" + end + "]";
    }

    @Override
    public int compareTo(Plank o) {
      return start - o.start;
    }

  }

  public int solution(int[] A, int[] B, int[] C) {
    // write your code in Java SE 8
    Set<Integer> nailsSeen = new HashSet<>();
    List<Nail> nails = new ArrayList<>();
    for (int i=0; i<C.length; i++) {
      if (!nailsSeen.contains(C[i])) {
        nails.add(new Nail(i+1, C[i]));
        nailsSeen.add(C[i]);
      }
    }
    Collections.sort(nails);

    List<Plank> planks = new ArrayList<>();
    for (int i=0; i<A.length; i++) {
      planks.add(new Plank(A[i], B[i]));
    }
    Collections.sort(planks);
    for (int i=0; i<planks.size()-2; i++) {
      while (i>0 && planks.get(i).end > planks.get(i+1).end) {
        planks.remove(i--);
      }
    }

    int maxMin = 0;
    for (Plank plank : planks) {
      int minIndex = getMinNailIndex(nails, plank);
      if (minIndex == -1) {
        return -1;
      }
      maxMin = Math.max(maxMin, minIndex);
    }
    return maxMin;

  }

  public int getMinNailIndex(List<Nail> nails, Plank plank) {
    int start = 0;
    int end = nails.size() - 1;
    int result = -1;
    while (start <= end) {
      int center = (start + end) / 2;
      if (nails.get(center).value < plank.start) {
        start = center + 1;
      } else if (nails.get(center).value > plank.end) {
        end = center - 1;
      } else {
        result = center;
        end = center - 1;
      }
    }
    if (result == -1) {
      return -1;
    }
    int minIndex = nails.get(result).index;
    for (int i=result+1; i<nails.size(); i++) {
      if (nails.get(i).value <= plank.end) {
        minIndex = Math.min(minIndex, nails.get(i).index);
      } else {
        return minIndex;
      }
    }
    return minIndex;
  }

  public static void main(String[] args) {
    NailingPlanks np = new NailingPlanks();
    System.out.println(np.solution(
        new int[] { 1,4,5,8  },
        new int[] { 4,5,9,10 },
        new int[] { 4,6,7,10,2 }));
  }

  /**
   * N개의 정수로 구성된 두 개의 비어 있지 않은 배열 A와 B가 제공됩니다. 이 배열은 N개의 널빤지를 나타냅니다. 보다 정확하게는 A[K]가 K번째 판자의 시작이고 B[K]가 끝입니다.
   *
   * 다음으로 M개의 정수로 구성된 비어 있지 않은 배열 C가 제공됩니다. 이 배열은 M개의 못을 나타냅니다. 더 정확히 말하면 C[I]는 I번째 못을 망치질할 수 있는 위치입니다.
   *
   * 판자(A[K], B[K])는 A[K] ≤ C[I] ≤ B[K]와 같은 못 C[I]가 있으면 못을 박았다고 합니다.
   *
   * 목표는 모든 판자가 못을 박을 때까지 사용해야 하는 못의 최소 수를 찾는 것입니다. 즉, 첫 번째 J 못을 사용한 후에 모든 판자가 못을 박을 수 있는 값 J를 찾아야 합니다. 보다 정확하게는 0 ≤ K < N인 모든 판자(A[K], B[K])에 대해 I < J 및 A[K] ≤ C[I] ≤인 못 C[I]가 있어야 합니다. ㄴ[케이].
   *
   * 예를 들어, 주어진 배열 A, B는 다음과 같습니다.
   *
   *     A[0] = 1 B[0] = 4
   *     A[1] = 4 B[1] = 5
   *     A[2] = 5 B[2] = 9
   *     A[3] = 8 B[3] = 10
   * 네 개의 널빤지가 표시됩니다: [1, 4], [4, 5], [5, 9] 및 [8, 10].
   *
   * 주어진 배열 C는 다음과 같습니다.
   *
   *     C[0] = 4
   *     C[1] = 6
   *     C[2] = 7
   *     C[3] = 10
   *     C[4] = 2
   * 다음 손톱을 사용하는 경우:
   *
   * 0이면 판자 [1, 4]와 [4, 5]가 모두 못을 박을 것입니다.
   * 0, 1, 다음 판자 [1, 4], [4, 5] 및 [5, 9] 못을 박을 것입니다.
   * 0, 1, 2, 그런 다음 판자 [1, 4], [4, 5] 및 [5, 9]가 못을 박을 것입니다.
   * 0, 1, 2, 3, 그러면 모든 판자가 못을 박을 것입니다.
   * 따라서 4는 모든 판자를 못 박을 수 있도록 순차적으로 사용되는 최소 못의 수입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A, int[] B, int[] C); }
   *
   * N개의 정수로 구성된 비어 있지 않은 두 배열 A와 B와 M개의 정수로 구성된 비어 있지 않은 배열 C가 주어지면 모든 널빤지를 못 박을 수 있도록 순차적으로 사용되는 못의 최소 수를 반환합니다.
   *
   * 모든 널빤지를 못 박을 수 없는 경우 함수는 -1을 반환해야 합니다.
   *
   * 예를 들어 주어진 배열 A, B, C는 다음과 같습니다.
   *
   *     A[0] = 1 B[0] = 4
   *     A[1] = 4 B[1] = 5
   *     A[2] = 5 B[2] = 9
   *     A[3] = 8 B[3] = 10
   *
   *     C[0] = 4
   *     C[1] = 6
   *     C[2] = 7
   *     C[3] = 10
   *     C[4] = 2
   * 함수는 위에서 설명한 대로 4를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N 및 M은 [1..30,000] 범위 내의 정수입니다.
   * 배열 A, B 및 C의 각 요소는 [1..2*M] 범위 내의 정수입니다.
   * A[K] ≤ B[K].
   */
}
