package school.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round_Robin {
    // WT (Wait Time) : 기다린 시간 // TT (Total Time ) : 총 걸린 시간
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Time Quantum 시분할시간을 정하세요(숫자입력): ");
        int q = Integer.parseInt(br.readLine());
        System.out.println("작업할 프로세스의 수를 정하세요 (숫자입력): ");
        int n = Integer.parseInt(br.readLine());
        int proc[][] = new int[n + 1][4];
        //proc[][0] AT array, [][1] - RT , [][2] - WT , [][3] - TT
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " 번쨰 프로세스의 작업시간은? (Burst Time) (숫자입력): ");
            proc[i][1] = Integer.parseInt(br.readLine());
        }
        System.out.println();
        //total_time 계산 및 time_chart 배열 초기화
        int total_time = 0;
        for (int i = 1; i <= n; i++) {
            total_time += proc[i][1];
        }
        int time_chart[] = new int[total_time];
        int sel_proc = 1;
        int current_q = 0;
        for (int i = 0; i < total_time; i++) {
            //선택한 프로세스를 time_chart의 현재 시간에 할당
            time_chart[i] = sel_proc;
            //1 단위 시간당 CPU가 할당되었으므로 선택한 프로세스의 남은 시간을 1 씩 감소시킵니다.
            proc[sel_proc][1]--; //WT 와 TT 산출 for문
            for (int j = 1; j <= n; j++) {
                if (proc[j][1] != 0) {
                    proc[j][3]++;
                    //만약 프로세스 실행이 완료되지 않은 경우 TT는 1씩 증가함
                    if (j != sel_proc)//프로세스가 현재 CPU에 할당되지 않은 경우 WT는 1씩 증가함
                        proc[j][2]++;
                } else if (j == sel_proc)
                    //이는 프로세스에 CPU가 할당되어 실행이 완료된 특수한 경우
                    proc[j][3]++;
            } //Time_Chart 출력
            if (i != 0) {
                if (sel_proc != time_chart[i - 1])
                //CPU가 다른 프로세스에 할당된 경우 현재 시간 값과 새 프로세스의 이름을 프린트
                {
                    System.out.print("--" + i + "--P" + sel_proc);
                }
            } else
                //현재 시간이 0인 경우, 즉 인쇄가 막 시작되면 첫 번째 선택된 프로세스의 이름을 프린트
                System.out.print(i + "--P" + sel_proc);
            if (i == total_time - 1)
                //모든 프로세스 이름이 인쇄되었으므로 실행이 끝나는 시간을 프린트
                System.out.print("--" + (i + 1));
            //다음 번 반복을 위해 sel_proc 값 업데이트
            current_q++;
            if (current_q == q || proc[sel_proc][1] == 0)
            //시간이 만료되었거나 현재 프로세스가 실행이 완료된경우
            {
                current_q = 0; //sel_proc에 대해 다음 유효한 값을 선택
                for (int j = 1; j <= n; j++) {
                    sel_proc++;
                    if (sel_proc == (n + 1)) sel_proc = 1;
                    if (proc[sel_proc][1] != 0) break;
                }
            }
        }
        System.out.println();
        System.out.println();
        //각 프로세스의 WT 및 TT 인쇄
        System.out.println("P\t WT \t TT ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d\t%3dms\t%3dms", i, proc[i][2], proc[i][3]);
            System.out.println();
        }
        System.out.println(); //WT & TT 평균시간 인
        float WT = 0, TT = 0;
        for (int i = 1; i <= n; i++) {
            WT += proc[i][2];
            TT += proc[i][3];
        }
        WT /= n;
        TT /= n;
    }
}