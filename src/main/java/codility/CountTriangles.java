package codility;

import java.util.Arrays;

public class CountTriangles {

  public int solution(int[] A) {
    // write your code in Java SE 8
    int  numTriangle = 0;

    // important: sort the edges
    // so that we just need to check if
    // "1st edge + 2nd edge > 3rd edge"
    Arrays.sort(A);

    // Using "Caterpillar method"
    // so we can have O(n^2), not O(n^3)
    for(int i=0; i < A.length-2; i++){

      // the leftEnd and rightEnd of the "Caterpillar"
      int leftEnd = i+1;
      int rightEnd = i+2;

      while(leftEnd < A.length-1){

        // key point of "Caterpillar method"
        if(rightEnd < A.length && A[i] + A[leftEnd] > A[rightEnd]){
          rightEnd++; // increase the Caterpillar
        }
        else{
          // note: need to minus "1"
          // because the rightEnd is not included
          numTriangle = numTriangle + (rightEnd - leftEnd - 1);
          leftEnd++; // decrease the Caterpillar
        }
      }
    }

    return numTriangle;
  }

  public static void main(String[] args) {
    CountTriangles ct = new CountTriangles();
    System.out.println(ct.solution(new int[] { 10, 2, 5, 1, 8, 12 }));
  }

  /**
   * N개의 정수로 구성된 배열 A가 주어집니다. 삼중항(P, Q, R)은 A[P], A[Q] 및 A[R] 길이의 삼각형을 만들 수 있는 경우 삼각형입니다. 즉, 0 ≤ P < Q < R < N이고 다음과 같은 경우 삼중항(P, Q, R)은 삼각형입니다.
   *
   * A[P] + A[Q] > A[R],
   * A[Q] + A[R] > A[P],
   * A[R] + A[P] > A[Q].
   * 예를 들어, 다음과 같은 배열 A를 고려하십시오.
   *
   *   A[0] = 10 A[1] = 2 A[2] = 5
   *   A[3] = 1 A[4] = 8 A[5] = 12
   * 이 배열의 요소로 구성할 수 있는 4개의 삼각형 삼중항, 즉 (0, 2, 4), (0, 2, 5), (0, 4, 5) 및 (2, 4, 5)가 있습니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int[] A); }
   *
   * N개의 정수로 구성된 배열 A가 주어지면 이 배열의 삼각형 삼중항 수를 반환합니다.
   *
   * 예를 들어, 주어진 배열 A는 다음과 같습니다.
   *
   *   A[0] = 10 A[1] = 2 A[2] = 5
   *   A[3] = 1 A[4] = 8 A[5] = 12
   * 함수는 위에서 설명한 대로 4를 반환해야 합니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [0..1,000] 범위 내의 정수입니다.
   * 배열 A의 각 요소는 [1..1,000,000,000] 범위 내의 정수입니다.
   */
}
