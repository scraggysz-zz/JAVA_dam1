void main() {
    String hand1 = IO.readln("Eligeix la teua mà (pedra, paper, tissora): ");
    String hand2 = IO.readln("Eligeix la mà del contrari (peedra, paper, tissora): ");

    String resultat;
    switch (hand1+hand2) {
        case "pedrapedra", "paperpaper", "tissoratissora":
            resultat="empatat";
            break;
        case "pedratissora", "paperpedra", "tissorapaper":
                resultat="Has guanyat";
            break;
        case "pedrapaper", "papertissora", "tissorapedra":
                resultat="Has perdut";
            break;
        default:
                resultat="Mà invalida: ¡escriu pedra, paper o tissora!";
                break;
    };

    IO.println("Feble amb: " + resultat);
}