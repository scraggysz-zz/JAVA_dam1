import static java.lang.IO.*;
void main() {
    int[] a = new int[10];
    a[0]=0;a[1]=0;a[2]=1;a[3]=0;a[4]=0;a[5]=1;a[6]=1;a[7]=0;a[8]=0;a[9]=1;
    println("Mapa:");
    for (int i=0;i<a.length;i++) {
        print(a[i]+" ");
    }
    println();
    println("Obstacles:");
    for (int i=0;i<a.length;i++) {
        if (a[i]==1) {
            println("Posició "+i);
        }
    }
}