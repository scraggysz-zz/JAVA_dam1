import static java.lang.IO.*;
void main() {
    int[][] a = new int[4][4];
    a[0][0]=12;a[0][1]=45;a[0][2]=31;a[0][3]=18;
    a[1][0]=52;a[1][1]=17;a[1][2]=80;a[1][3]=44;
    a[2][0]=31;a[2][1]=1;a[2][2]=1;a[2][3]=0;
    a[3][0]=40;a[3][1]=10;a[3][2]=31;a[3][3]=21;
    println("Puntuacions inferiors a 20: ");
    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
            if (a[i][b]<20) {
                println("("+i+","+b+")"+" -> "+a[i][b]);
            }
        }
    }
}