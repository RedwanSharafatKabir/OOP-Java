package Tutorial_Book_Study;
import java.util.*;
public class Two_array_add {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt(), i;
        int ar1[] = new int [n], j;
        int ar2[] = new int [n], m;
        
        for(i=1;i<=n;i++){
            if(i%2!=0){
                j=i-1;
                ar1[j] = i;
                j++;
            }
        }
        for(i=1;i<=n;i++){
            if(i%2==0){
                j=i-1;
                ar2[j] = i;
                j++;
            }
        }
        
        int aLen = ar1.length;
        int bLen = ar2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(ar1, 0, result, 0, aLen);
        System.arraycopy(ar2, 0, result, aLen, bLen);
        
        for(i=0;i<result.length;i++){
            if(result[i]==0){
                for(m=i; m<result.length-1; m++){
                    result[m] = result[m+1];
                }
            }
        }
        for(i=0;i<n;i++){
            if(result[i]==0){
                for(m=i; m<result.length-1; m++){
                    result[m] = result[m+1];
                }
            }
        }
        for(i=0;i<n;i++){
            if(k==(i+1)){
                System.out.println(result[i]);
            }
        }
    }
}
