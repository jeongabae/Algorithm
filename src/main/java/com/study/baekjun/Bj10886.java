package com.study.baekjun;
import java.util.Scanner;

public class Bj10886 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cute=0,notCute=0;
        for (int i = 0; i < N; i++) {
            int vote = sc.nextInt();
            if(vote == 1){
                cute++;
            }else
                notCute++;
        }
        if (cute>notCute){
            System.out.println( "Junhee is cute!");
        }else
            System.out.println("Junhee is not cute!");
    }
}

/*1등 코드
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;

		for (int i = 0; i < n; ++i) {
			if (sc.nextInt() == 0) {
				++cnt;
			}
		}

		sc.close();

		System.out.print((cnt > n - cnt) ? "Junhee is not cute!" : "Junhee is cute!");
	}

}

 */