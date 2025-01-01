import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 11657 벨만-포드
public class Main {
    static Edge[] edges;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 노드 수
        int M = Integer.parseInt(st.nextToken()); // 엣지 수

        edges = new Edge[M]; // 엣지 배열 크기 수정
        long[] distance = new long[N + 1]; // 거리 배열

        // 엣지 리스트 초기화
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            edges[i] = new Edge(start, end, time);
        }

        // 거리 배열 초기화
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[1] = 0; // 시작 노드

        // 벨만-포드 실행
        for (int i = 0; i < N - 1; i++) { // N-1번 반복
            for (int j = 0; j < M; j++) { // 모든 엣지 확인
                Edge edge = edges[j];
                if (distance[edge.start] != Long.MAX_VALUE
                        && distance[edge.end] > distance[edge.start] + edge.time) {
                    distance[edge.end] = distance[edge.start] + edge.time;
                }
            }
        }

        boolean hasNegativeCycle = false;

        // 음수 사이클 체크
        for (int i = 0; i < M; i++) {
            Edge edge = edges[i];
            if (distance[edge.start] != Long.MAX_VALUE
                    && distance[edge.end] > distance[edge.start] + edge.time) {
                hasNegativeCycle = true;
                break;
            }
        }

        if (!hasNegativeCycle) {
            for (int i = 2; i <= N; i++) {
                System.out.println(distance[i] == Long.MAX_VALUE ? "-1" : distance[i]);
            }
        } else {
            System.out.println("-1");
        }
    }
}

// 엣지 리스트를 편하게 다루기 위한 클래스
class Edge {
    int start, end, time;

    public Edge(int start, int end, int time) {
        this.start = start;
        this.end = end;
        this.time = time;
    }
}
