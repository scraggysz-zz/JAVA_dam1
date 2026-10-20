import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {
    println("--- MÀQUINA RECREATIVA ---");
    Random random = new Random();
    int[] xifra = new int[6];
    print("Clau generada: ");
    for (int i = 0; i < xifra.length; i++) {
        int a = random.nextInt(0, 10);
        xifra[i] = a;
        print(xifra[i]);
    }
    ;
    print("\nPrimera xifra: " + xifra[0]);
    print("\nÚltima xifra: " + xifra[xifra.length - 1]);
    print("\nClau oculta: ");
    for (int i = 0; i < xifra.length; i++) {
        if (i >= xifra.length-1) {
            print(xifra[i]);
        } else if (i == 0) {
            print(xifra[i]);
        } else {
            print("*");
        }
    }
    print("\nLongitud: " + xifra.length + " caràcters.");
}

