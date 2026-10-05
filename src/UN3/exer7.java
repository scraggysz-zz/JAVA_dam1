import static java.lang.IO.*;
void main() {
    int[] a = new int[7];
    a[0]=10;a[1]=20;a[2]=30;a[3]=40;a[4]=50;a[5]=60;a[6]=70;
    println("Normal:");
    for (int i=0;i<a.length;i++) {
        print(a[i]+" ");
    }
    println("Invers:");
    for (int i=a.length-1;i>-1;i--) {
        print(a[i]+" ");
    }
}