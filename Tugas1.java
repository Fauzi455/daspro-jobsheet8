import java.util.Scanner;
    public class Tugas1 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();
 
if (N < 3);{
    System.out.println();
}
for(int i=1; i<=N; i++){
    for(int a=1; a<=N; a++){
    if (i == 1 || i == N || a == 1 || a == N){
        System.out.print(N + "  " );
    } else {
        System.out.print("   ");
    }
 }
 System.out.println();
    }
}
    }
