import java.util.*;

class BTNode{
    BTNode left;  //指向该二叉树的左子树
    BTNode right;  //指向该二叉树的右子树
    int val;

    public BTNode(int val){
        this.val = val;
    }
}

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        return IsTreeBST(sequence,0,sequence.length-1);
    }

    public boolean IsTreeBST(int[] sequence,int start,int end){
        if(end <= start){
            return true;
        }
        int temp = start;
        for(int i = temp;i < end;i++){
            if(sequence[i] > sequence[end]){
                break;
            }
        }
        for(int i = temp;i < end;i++){
            if(sequence[i] < sequence[end]){
                return false;
            }
        }
        return IsTreeBST(sequence,start,temp-1) && IsTreeBST(sequence,temp,end-1);
    }
}
