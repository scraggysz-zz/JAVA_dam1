void main() {
    String estaci = IO.readln("Escriu codi de icona: ");
    String emo = "";
    switch (estaci) {
        case  ":lol:", ":risa:":
             emo = "\uDD23";
            break;
        case ":cat:":
            emo = "\uD83D\uDE3A";
            break;
        case ":joy:":
            emo = "\uD83D\uDE02";
            break;
        case ":fire:":
            emo = "\uD83D\uDD25";
            break;
        default:
        IO.println("Emoji no registrat.");
            break;
    }
    IO.println("El codi "+estaci+" equival a: "+emo);
}