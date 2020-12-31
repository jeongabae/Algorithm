package com.study.baekjun.queue;
/**
 * 문제
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 여섯 가지이다.
 *
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 입력
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * 출력
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Bj10845 {
    static Queue q = new LinkedList();
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String back = "-1";
        while (N-->0){
            String[] str = br.readLine().split(" ");
            switch(str[0]) {
                case "push":
                    back = str[1];
                    q.add(back);
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.poll());
                    }
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front":
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.peek());
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        System.out.println(-1);

                    }else {
                        System.out.println(back);
                    }
            }
        }
    }
}
/*1등
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        int back = 0;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push" :
                    back = Integer.parseInt(st.nextToken());
                    queue.offer(back);
                    break;
                case "front" :
                    builder.append(queue.isEmpty()?-1:queue.peek()).append("\n");
                    break;
                case "back" :
                    builder.append(queue.isEmpty()?-1:back).append("\n");
                    break;
                case "size" :
                    builder.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    builder.append(queue.isEmpty()?1:0).append("\n");
                    break;
                case "pop" :
                    builder.append(queue.isEmpty()?-1:queue.poll()).append("\n");
                    break;
            }
        }

        System.out.println(builder.toString());

    }
}


 */
