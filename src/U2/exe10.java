import static java.lang.IO.println;

void main() {
    int a = Integer.parseInt(IO.readln("Introduïx nivell: "));
    if (a<30) {
        println("Accés denegat, puja de nivell.");
    }
    else if(a<0) {
        println("Nivell negatiu no se pot");
    }
    else {
        boolean b = IO.readln("¿Email verificat? (true/false): ").equalsIgnoreCase("true");
        if (b) {
            boolean c = IO.readln("¿Sancions actives? (true/false): ").equalsIgnoreCase("true");
            if (c) {
                println("Acces denegat: compte sancionat ");
            } else {
                IO.print("Acces concedit ");
            }
        }
        else {
            IO.print("Acces denegat: verifica el teu email ");
        }
    }
}