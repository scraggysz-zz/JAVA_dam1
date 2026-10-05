import static java.lang.IO.*;
void main() {
    int[] a = new int[8];

    for (int i=0;i<a.length;i++) {
        a[i]=Integer.parseInt(readln("Introdueix la puntuació "+i+":"));
        if (a[i] > 499) {
            print("Puntuacions que superen 500:");
            for (i = 0; i < a.length; i++) {
                println(a[i]);
            }
        }
    }



}