import static java.lang.IO.*;
void main() {
    int fila = Integer.parseInt(readln("Fila: "));
    int column = Integer.parseInt(readln("Columna: "));
    int[][] a = new int[7][7];
    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
            if (b==column && i==fila) {
                print("X");
            }
            else {
                print(".");
            }
        }
        println();
    }
    println();
    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
            if (i==fila) {
                print("X");
            }
            else if (b==column) {
                print("X");
            }
            else {
                print(".");
            }
        }
        println();
    }
}