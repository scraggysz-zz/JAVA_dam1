import static java.lang.IO.*;
void main() {
    int[][] a = new int[8][8];
    int c=0;
    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
            if (i==0 || i==(a.length-1)) {
                print("#");
                c++;
            }
            else if (b==0 || b==(a.length-1)) {
                print("#");
                c++;
            }
            else if ((i==3 && (b==2 || b==3)) || (b==4 && (i>1 || (i<(a.length-2))))) {
                print("#");
                c++;
            }
            else if (i==4 && b==(a.length-3)) {
                print("T");
            }
            else if (i==5 && b==(a.length-5)) {
                print("E");
            }
        }
        println();
    }
    println();
    for (int i=0;i<a.length;i++) {
        for (int b=0;b<a.length;b++) {
             if (i==5 && b==(a.length-5)) {
                println("Entrada: "+"("+i+","+b+")");
            }
            else if (i==4 && b==(a.length-3)) {
                println("Tresor: "+"("+i+","+b+")");
            }
        }
    }
    println("Total parets: "+c);
}