import static java.lang.IO.*;
void main() {
    int[][] a = {
        {12,45,31,18},
        {52,17,80,44},
        {31,1,1,0},
        {40,10,31,21} };
    println("Puntuacions inferiors a 20: ");
    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
            if (a[i][b]<20) {
                println("("+i+","+b+")"+" -> "+a[i][b]);
            }
        }
    }
}