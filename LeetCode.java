import java.util.*;
public class LeetCode {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();//creating 2 different HashSets.
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){//adding all elements of nums1 in set1.
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){//iterating through nums2 
            if(set1.contains(nums2[i])){//checking if the element in nums2 is in set1(which is technically nums1)
            set2.add(nums2[i]);//if the element in nums2 is in set1 then add element in set2
            }
        }
        //therefore set2 is basically intersection of nums1 and nums2
        int s=set2.size();//taking size of set2
        int i=0;
        int nums3[]=new int[s];
        for(int key:set2){//adding elements of set2 in nums3 
            nums3[i++]=key;
            
        }
    return nums3;
    }
}
