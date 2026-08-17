import java.util.Scanner;

public class ABicycleChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int maxRatio = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr2[j]%arr1[i]==0){
                    int ratio = arr2[j]/arr1[i];
                    if(ratio>maxRatio){
                        maxRatio = ratio;
                        count = 1;
                    }else if(ratio==maxRatio){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}