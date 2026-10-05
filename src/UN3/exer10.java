import static java.lang.IO.*;
void main() {
    int[][] a = new int[5][5];
    a[0][0]=0;a[0][1]=0;a[0][2]=0;a[0][3]=0;a[0][4]=0;
    a[1][0]=0;a[1][1]=0;a[1][2]=0;a[1][3]=0;a[1][4]=0;
    a[2][0]=0;a[2][1]=0;a[2][2]=0;a[2][3]=9;a[2][4]=0;
    a[3][0]=0;a[3][1]=0;a[3][2]=0;a[3][3]=0;a[3][4]=0;
    a[4][0]=0;a[4][1]=0;a[4][2]=0;a[4][3]=0;a[4][4]=0;

    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
            if (a[i][b]==9) {
                println("Tresor trobat!");
                println("Fila: "+i);
                println("Columna: "+b);
            }
        }
    }
}