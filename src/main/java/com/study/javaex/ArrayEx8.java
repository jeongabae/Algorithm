/*로또번호 생성예제
 */
package com.study.javaex;

public class ArrayEx8 {
    public static void main(String[]args){
        int[] ball = new int[45];

        //배열의 각 요소에 1~45의 값을 저장한다.
        for(int i=0; i<ball.length;i++)
            ball[i] = i+1;

        int temp = 0;
        int j=0;

        for(int i=0;i<6; i++){
            j=(int)(Math.random()*45); //0~44벙위의 임의의값 얻음
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }
        //배열 ball의 앞에서부터 6개의 요소를 출력
        for(int i=0;i<6; i++)
            System.out.printf("ball[%d]=%d%n",i,ball[i]);
    }
}
