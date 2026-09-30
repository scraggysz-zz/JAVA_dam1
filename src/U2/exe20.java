import static java.lang.IO.*;

void main() {
    while (true) {
        int a = Integer.parseInt(readln("Fica número: "));
        String b = readln("Desitja continuar? (Si/No): ").toLowerCase();
        if (b.equals("no")) {
            break;
        }
    }
}