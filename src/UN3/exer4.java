import static java.lang.IO.*;
void main() {
    int[] a = new int[8];
    a[0] = 15; a[1]=23; a[2]=8; a[3]=42; a[4]=17; a[5]=31; a[6]=5; a[7]=28;
    println("Objectes perillosos detectats: ");
    for (int i=0;i<a.length;i++) {
        if (a[i]<10) {
            println(a[i]+" ");
        }

    }
}