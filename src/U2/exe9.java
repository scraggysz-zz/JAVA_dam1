import static java.lang.IO.println;

void main() {
    int a = Integer.parseInt(IO.readln("Introduïx edat: "));
    boolean b = IO.readln("¿Compte verificat? (true/false): ").equalsIgnoreCase("true");
    if (a<18) {
        println("Accés denegat.");
    }
    else if(a<0) {
        println("Edad incorrecta");
    }
    else {
        println(b ? "Acces concedit" : "Acces denegat");
    };
}