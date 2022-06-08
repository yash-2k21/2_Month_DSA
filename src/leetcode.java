import java.util.*;
public class leetcode
{

    static public int FindMax(int[] position)
    {
        int l = position.length;
        int maxelement = 0;
        int maxindex=0;
        for(int i=0 ; i<l ; i++)
        {
            int counter=0;
            for(int j=0 ; j<l ; j++){
                if(position[i] == position[j])
                    counter++;
            }
            if(maxelement < counter){
                maxelement = counter ;
                maxindex = position[i];
            }
        }
        return maxindex;
    }

    static public int minCostToMoveChips(int[] position) {

        int max = FindMax(position);
        int n = position.length;
        int dif, dif1;
        int cost=0 ;
        for(int i=0 ; i<n ; i++){
            if(position[i]!=max){
                dif = position[i] - max;
                //dif1 = Integer.parseInt(Integer.toUnsignedString(dif));
                if(dif % 2 != 0){
                    cost = cost + 1 ;
                }

                //cost = cost + res ;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int arr[] = {6,4,7,8,2,10,2,7,9,7};
        System.out.println(minCostToMoveChips(arr));
    }
}
