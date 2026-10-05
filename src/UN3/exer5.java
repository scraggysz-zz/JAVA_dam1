import static java.lang.IO.*;
void main() {
    int[] a = new int[6];
    a[0] = 100; a[1]=85; a[2]=72; a[3]=60; a[4]=42; a[5]=15;
    println("Objectes perillosos detectats: ");
    for (int i=0;i<a.length;i++) {
        print("Nivell "+i+": "+a[i]);
        if (a[i]<20) {
            print(" PERILL");
        }
        println();

    }
}