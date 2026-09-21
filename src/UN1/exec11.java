void main() {
    int mes = Integer.parseInt(IO.readln("Introduce el numero de mes (1-12): "));
    String estaci = "";
    switch (mes) {
        case 1, 2, 12:
            estaci = "Invierno";
            break;
        case 3, 4, 5:
            estaci = "Primavera";
            break;
        case 6, 7, 8, 9:
            estaci = "Verano";
            break;
        case 10, 11:
            estaci = "Otoño";
            break;
        default:
            IO.println("Error, número no válido.");
            break;
    }
    if (mes>0 && mes<13) {
        IO.println("El mes " + mes + " corresponde a la estación " + estaci);
    }
}