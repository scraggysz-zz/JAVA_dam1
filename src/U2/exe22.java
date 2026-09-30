import static java.lang.IO.*;

void main() {
        int a = Integer.parseInt(readln("introduïx alçada: "));
        int b = Integer.parseInt(readln("introduïx ample: "));
        for (int f=0;f<a;f++) {
            println();
            for (int c=0;c<b && f<a;c++) {
            print("#");
            }
        }
//    int d = Integer.parseInt(readln("introduïx alçada: "));
//        for (int g=1;g<=d;g++) {
//        println();
//        for (int h=1;h<=g;h++) {
//            print("*");
//        }
//    }
    int d = Integer.parseInt(readln("introduïx alçada: "));
    for (int g=1;g<=d;g++) {
        println();
        for (int h=d;h>g;h--) {
            print("*");
        }
    }
}