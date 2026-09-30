import static java.lang.IO.*;

void main() {
    int a=Integer.parseInt(readln("Introduix INI: "));
    int b=Integer.parseInt(readln("Introduix fan: "));
    int c=Integer.parseInt(readln("Introduix M: "));
    for (   int d=a  ;     d<= b;    d++  ) {
        if (d%c==0) {
            println(d);
        }
    }
}