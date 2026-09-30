import static java.lang.IO.*;

void main() {
    int a=Integer.parseInt(readln("Introduix INI: "));
    int b=Integer.parseInt(readln("Introduix fan: "));
    int c=Integer.parseInt(readln("Introduix pas: "));
    for (     ;     a < b;    a=a+c  ) {
        println(a);
    }
}