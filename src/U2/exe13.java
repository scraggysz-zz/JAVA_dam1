import static java.lang.IO.*;

void main() {
    int a=Integer.parseInt(readln("Introduix numero: "));
    for (int ab=1 ; ab<11; ab++) {
        println(a+" x "+ab+" = "+a*ab);
    }
}