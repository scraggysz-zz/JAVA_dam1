import static java.lang.IO.*;
void main() {
    int[][] a = {
    {0, 0, 0, 1, 1, 0},
    {0, 1, 0, 0, 0, 0},
    {0, 1, 1, 1, 0, 0},
    {0, 0, 0, 0, 0, 0} };


    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
            print(a[i][b]+" ");
        }
        println();
    }
}