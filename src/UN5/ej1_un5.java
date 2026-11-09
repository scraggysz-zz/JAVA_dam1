import static java.lang.IO.*;
void main() {
    Scanner scanner = new Scanner(System.in);
    int[] notas = new int[10];
    for (int i=0;i<notas.length;i++) {
        notas[i] = scanner.nextInt();
    }
    int excel = 0;
    int notable = 0;
    int aprov = 0;
    int susp = 0;
    for (int i=0;i<notas.length;i++) {
        if (notas[i]>=9) {
            excel++;
        }
        else if (notas[i]>=7 && notas[i] < 9) {
            notable++;
        }
        else if (notas[i]>=5 && notas[i] < 7) {
            aprov++;
        }
        else if (notas[i]<5) {
            susp++;
        }
    }
    println("Excel·lents: "+excel);
    println("Notables: "+notable);
    println("Suficients: "+aprov);
    println("Suspesos: "+susp);

 }