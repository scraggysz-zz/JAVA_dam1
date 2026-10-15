import static java.lang.IO.*;
void main() {
    int[][] taulell = {
            {8,  3,  7,  1},
            {4,  9,  2,  6},
            {5,  0,  8,  3},
            {7,  2,  4,  9}
    };
    int premiat = 8;
    int fila = Integer.parseInt(readln("Fila: "));
    int column = Integer.parseInt(readln("Columna: "));
    if (taulell[fila][column]==premiat) {
        print("Enhorabona. Has trobat el número premiat.");
    }
            else {
                println("No has encertat.");
                println("En aquesta posició havia un "+taulell[fila][column]);
            }
}