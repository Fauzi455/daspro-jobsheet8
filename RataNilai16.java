import java.util.Scanner;
    public class RataNilai16 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            

int i, j;
float nilai, totalNilai, rataNilai;

i=1;
totalNilai=0;
for(j=1; j<=5; j++){
    System.out.print("Nilai ke-" + j + " = ");
    nilai=sc.nextInt();
    totalNilai+=nilai;
}
i=1;
while (i<=5) {
    totalNilai=0;
    for(j=1; j<=5; j++){
        System.out.print("Nilai ke-" + j + " = ");
        nilai=sc.nextInt();
        totalNilai+=nilai;
    }
    rataNilai=totalNilai/5;
    System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
    i++;
}
        }
}
