import static java.lang.IO.*;
void main() {
    int[] a = new int[5];
    a[0] = 120; a[1]=450; a[2]=230; a[3]=800; a[4]=320;
    println("Primera partida: "+a[0]);
    println("Úiltima partida: "+a[a.length-1]);
    println("Puntuacions:");
    for (int i=0;i<a.length;i++) {
        println(a[i]);
    }
}