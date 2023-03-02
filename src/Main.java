import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] a = {77, 33, 99, 55, 11, 66};

        for(int i = 0; i< 6;i++) {
            for (int j = i, min = a[j]; j < 6; j++) {
                if (a[j] < min) {
                    min = a[j];
                    a[j] = a[i];
                    a[i] = min;
                }
            }
            for(int tmp:a)
                System.out.print(tmp+" ");
            System.out.println();
        }

        //冒泡排序是的外循环只是趟数循环，主要靠内循环：将最小的移到末端。
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6-i-1; j++){
                if(a[j] < a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for(int tmp:a)
            System.out.print(tmp+" ");
        System.out.println();
        int max=-1;
        for(int tmp:a){
            if(max < tmp) max = tmp;
        }
        System.out.println(max);
    }
}