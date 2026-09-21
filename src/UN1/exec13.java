void main() {
    int estaci = Integer.parseInt(IO.readln("Escriu mes: "));
    int dia = 0;
    switch (estaci) {
        case  1,3,5,7,8,10,12:
             dia = 31;
            break;
        case 2:
            dia = 28;
            break;
        case 4,6,9,11:
            dia = 30;
            break;
        default:
        IO.println("Mes invàlid.");
            break;
    }
    if (estaci>0 && estaci<13) {
    IO.println("Aquest mes té "+dia+" dies.");
    }
}