package com.study.backjun.basic;
//상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.
//
//어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다.
// 하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
//
//학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
import java.util.Scanner;
public class backjun10039 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int score[] = new int[5];
        int average = 0;

        int score_won = scanner.nextInt();
        int score_se = scanner.nextInt();
        int score_sang = scanner.nextInt();
        int score_sung = scanner.nextInt();
        int score_gang = scanner.nextInt();

        score[0] = score_won;
        score[1] = score_se;
        score[2] = score_sang;
        score[3] = score_sung;
        score[4] = score_gang;

        for(int i=0; i<5; i++){
            if(score[i] < 40){
                score[i]=40;
            }
            average += score[i]/5;
        }
        System.out.println(average);
    }
}


