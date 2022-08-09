package codility;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FiboFrog {
  final static Map<Integer, Integer> fiboMap = new HashMap<>();

  public int solution(int[] A) {
    // write your code in Java SE 8
    int N = A.length;
    for (int i=0; fibo(i)<=N+1; i++);

    ArrayList<Integer> fiboList = new ArrayList<>(fiboMap.values());
    Collections.reverse(fiboList);

    Queue<Point> queue = new LinkedList<>();
    boolean[] check = new boolean[N+1];

    queue.add(new Point(-1, 0)); //시작점

    while (!queue.isEmpty()) {
      Point currentPoint = queue.poll();

      for (int fibo : fiboList) {
        int next = currentPoint.x + fibo;
        if (next == N) {
          return currentPoint.y + 1;
        } else if (next < N && next >= 0) {
          if (A[next] == 1 && !check[next]) {
            check[next] = true;
            Point point = new Point(next, currentPoint.y + 1);
            queue.add(point);
          }
        }
      }
    }
    return -1;
  }

  public int fibo(int num) {
    if (num == 0) return 0;
    if (num == 1) return 1;
    if (fiboMap.containsKey(num)) return fiboMap.get(num);
    fiboMap.put(num, fibo(num - 1) + fibo(num - 2));
    return fiboMap.get(num);
  }

  public static void main(String[] args) {
    FiboFrog ff = new FiboFrog();
    System.out.println(ff.solution(new int[] { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 }));
  }

  /**
   * 피보나치 수열은 다음 재귀 공식을 사용하여 정의됩니다.
   *
   *     F(0) = 0
   *     F(1) = 1
   *     F(M) = F(M - 1) + F(M - 2) M >= 2인 경우
   * 작은 개구리는 강 건너편으로 가고 싶어합니다. 개구리는 처음에 강의 한쪽 강둑(위치 -1)에 위치하고 다른 강둑(위치 N)으로 이동하려고 합니다. 개구리는 F(K)가 K번째 피보나치 수인 F(K) 거리를 뛰어 넘을 수 있습니다. 운 좋게도 강에는 많은 잎사귀가 있고 개구리는 잎사귀 사이로 점프할 수 있지만 위치 N의 둑 방향으로만 가능합니다.
   *
   * 강의 잎은 N개의 정수로 구성된 배열 A로 표현됩니다. 배열 A의 연속 요소는 강의 0에서 N − 1까지의 연속 위치를 나타냅니다. 배열 A에는 0 및/또는 1만 포함됩니다.
   *
   * 0은 리프가 없는 위치를 나타냅니다.
   * 1은 리프를 포함하는 위치를 나타냅니다.
   * 목표는 개구리가 강의 반대편(위치 -1에서 위치 N까지)에 도달할 수 있는 최소 점프 횟수를 계산하는 것입니다. 개구리는 위치 -1과 N(강둑)과 잎사귀가 있는 모든 위치 사이를 이동할 수 있습니다.
   *
   * 예를 들어, 다음과 같은 배열 A를 고려하십시오.
   *
   *     A[0] = 0
   *     A[1] = 0
   *     A[2] = 0
   *     A[3] = 1
   *     A[4] = 1
   *     A[5] = 0
   *     A[6] = 1
   *     A[7] = 0
   *     A[8] = 0
   *     A[9] = 0
   *     A[10] = 0
   * 개구리는 F(5) = 5, F(3) = 2, F(5) = 5의 길이로 세 번 점프할 수 있습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 배열 A가 주어지면 개구리가 강의 반대편에 도달할 수 있는 최소 점프 수를 반환합니다. 개구리가 강의 반대편에 도달할 수 없으면 함수는 -1을 반환해야 합니다.
   *
   * 예를 들면 다음과 같습니다.
   *
   *     A[0] = 0
   *     A[1] = 0
   *     A[2] = 0
   *     A[3] = 1
   *     A[4] = 1
   *     A[5] = 0
   *     A[6] = 1
   *     A[7] = 0
   *     A[8] = 0
   *     A[9] = 0
   *     A[10] = 0
   * 함수는 위에서 설명한 대로 3을 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..100,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 0, 1 값 중 하나를 가질 수 있는 정수입니다.
   */
}
