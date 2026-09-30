import static java.lang.IO.*;

void main() {
    int a=Integer.parseInt(readln("Posición inicial: "));
    int b=Integer.parseInt(readln("Pos objetivo: "));
    int c=Integer.parseInt(readln("Distancia por cada movimiento: "));
    if (a<b) {
        for (; a < b; a = a + c) {
            println(a);
        }
        for (;a>b;) {
            println(a);
            break;
        }
    }
    else if (a>b) {
        for (; a > b; a = a - c) {
            println(a);
        }
        for (;a<b;) {
            println(a);
            break;
        }
    }
}