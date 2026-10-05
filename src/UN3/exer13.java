import static java.lang.IO.*;
void main() {
    int fila = Integer.parseInt(readln("Introduïx files: "));
    int column = Integer.parseInt(readln("Introduïx columnes: "));
    int[][] a = new int[fila][column];
    for (int i=0;i<fila;i++) {
        for (int b=0;b<column;b++) {
            print(i+" ");
        }
        println();
    }
    println();
    for (int i=0;i<fila;i++) {
        for (int b=0;b<column;b++) {
            print(b+" ");
        }
        println();
    }
}