import static java.lang.IO.*;
void main() {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    double[] notas = new double[l];
    int m =0;
    for (int i=0;i<notas.length;i++) {
        notas[i] = scanner.nextInt();
        if (notas[i]>0) {
            m++;
        }
    }
    double[] pos = new double[m];
    int a = 0;
    for (;;) {
        for (int i=0;i<notas.length;i++) {
            int j=0;
            if (notas[i]>0){
                pos[l] = notas[i];
                j++;
                println(pos[l]);
            }
            break;
        }
    }

 }