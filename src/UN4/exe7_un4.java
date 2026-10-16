import static java.lang.IO.*;

void main() {
    Scanner scanner = new Scanner(System.in);
    print("Introdueix nom del producte: ");
    String producte = scanner.nextLine();
    print("Número de prestatgeria: ");
    int presta = scanner.nextInt();
    println("Producte: %s".formatted(producte));
    int llarg = producte.trim().length();
    println("Codi d'inventari: %s".formatted(producte.substring(0,2).toUpperCase())+"-%03d".formatted(presta)+"-%02d".formatted(llarg));
    println("Longitud del nom: %s".formatted(llarg));

}