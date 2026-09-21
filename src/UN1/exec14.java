void main() {
    double a = Double.parseDouble((IO.readln("Introdueix el primer número: ")));
    double b = Double.parseDouble((IO.readln("Introdueix el segon número: ")));
    String op= IO.readln("Operació (+, -, *): ");
    switch (op) {
        case  "+":
             IO.println("Resultat: "+a+" + "+b+" = "+(a+b));
            break;
        case "*":
            IO.println("Resultat: "+a+" * "+b+" = "+(a*b));
            break;
        case "-":
            IO.println("Resultat: "+a+" - "+b+" = "+(a-b));
            break;
        default:
        IO.println("Operació no vàlida.");
            break;
    }
}