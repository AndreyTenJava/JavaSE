package JavaStart.Modul1.Array;

    import java.util.Scanner;

    public class Task2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] k = new int[n];

            for (int i=0; i<n; i++) {
                k[i] = in.nextInt();
            }
            int indexZero = 0;
            for(int i=0; i<n; i++){
                if(k[i]==0){
                    indexZero = i;
                    break;
                }
            }

            int sum=0;
            for (int i=indexZero+1; i<n; i++){
                sum+=k[i];
                if (k[i]==0){
                    break;
                }
            }
            System.out.println(sum);
        }
    }
