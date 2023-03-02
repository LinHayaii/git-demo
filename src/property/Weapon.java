package property;
import  java.util.Arrays;
public class Weapon extends Item{
    int damage;
    public static void main(String[] args){
        Solution ans = new Solution();
        int[] nums = new int[]{9,4,6,2,1,5,3,7,8};
        ans.twoSum(nums,14);
    }
}
class Solution{
    public int[]twoSum(int[] nums, int target){
        //归并排序
        int [] a = nums;
        int[] b = new int[a.length];
        for(int seg = 1; seg <a.length; seg <<= 1){//每一次的小段长度
            for(int s = 0; s < a.length; s += seg*2){//针对该长度对数组进行归并
                int low = s;//第一段头
                int mid = Math.min(s+seg,a.length);//第一段末
                int high = Math.min(s+seg*2,a.length);//第二段末
                int k = low;
                int s1 = low, e1 = mid, s2 = mid, e2 = high;
                while(s1<e1 && s2<e2){//将小的排到前
                    b[k++] = a[s1] < a[s2] ? a[s1++] : a[s2++];
                }
                while(s1 < e1)//若有剩余，全部照搬
                    b[k++] = a[s1++];
                while(s2 < e2)
                    b[k++] = a[s2++];
            }
            int[] tmp = a;//交换一次后，b有序，a无序，下次排序要在有序基础上继续排
            a = b;
            b = tmp;
        }
        if(a != nums)//若最终有序的不是b，把a搬至b里
            for(int i = 0; i<a.length; i++){
                b[i] = a[i];
            }
        b = a;
        System.out.println(Arrays.toString(b));
        return b;
    }
}
