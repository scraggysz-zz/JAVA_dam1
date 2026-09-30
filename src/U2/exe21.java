import static java.lang.IO.*;

void main() {
        int a = Integer.parseInt(readln("Fica files: "));
        int b = Integer.parseInt(readln("Fica columnes: "));
        for (int f=0;f<a;f++) {
            println();
            for (int c=0;c<b && f<a;c++) {
            print("("+f+"),("+c+") ");
            }
        }
}