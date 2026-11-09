import static java.lang.IO.*;
void main() {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    double[] notas = new double[l];
    for (int i=0;i<notas.length;i++) {
        notas[i] = scanner.nextInt();
    }
    int a = 0;
    for (int i=0;i<notas.length;i++) {
        if (notas[i]>=0) {
            a++;
        }
    }
    if (a>0) {
        println("Hi ha hagut al menys una glaçada");
    }
    else {
        println("Totes les temps positives.");
    }
 }