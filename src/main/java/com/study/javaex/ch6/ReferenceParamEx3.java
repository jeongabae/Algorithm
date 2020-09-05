package com.study.javaex.ch6;

class ReferenceParamEx3 {
    public static void main(String[]args){
        int[] arr = new int[]{3,2,1,6,5,4};

        printArr(arr); //배열의 모든 요소를 출력
        sortArr(arr); //베열을 정렬
        printArr(arr); //정렬후 결과를 출력
        System.out.println("sum="+sumArr(arr)); //베열의 총합을 출력
    }

    static void printArr(int[] arr){
        System.out.print("[");

        for(int i : arr){
            System.out.print(i+",");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr){
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
