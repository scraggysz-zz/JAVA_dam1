import static java.lang.IO.*;

void main() {
    int a = Integer.parseInt(readln("Introduix un número: "));
    for (   int b=0  ;    b<=a ;    b++  ) {
        if (b%2==0) {
            println("Me quiere");
        }
        else {
            println("No me quiere");
        }
    }
}