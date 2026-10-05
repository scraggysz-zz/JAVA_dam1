import static java.lang.IO.*;
void main() {
    int[] a = new int[5];
    a[0] = 10; a[1]=20; a[2]=30; a[3]=40; a[4]=50;
    int b=Integer.parseInt(readln("Posició que vols modificar: "));
    int c=Integer.parseInt(readln("Nou valor: "));
    println("Array modificat:");
    a[b]=c;
    for (int i=0;i<a.length;i++) {
        print(a[i]+" ");
    }
}