void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Nom de l'article: ");
    String nom = scanner.nextLine();
    IO.print("Preu unitari: ");
    double preu = scanner.nextDouble();
    IO.print("Quantitat: ");
    int quantitat = scanner.nextInt();
    double iva = preu*quantitat*0.21;
    IO.println("\n" +
            "=========== TIQUET DE COMPRA ===========\n" +
            "Article:         %-15s\n".formatted(nom) +
            "Unitats:                            %3d\n".formatted(quantitat) +
            "Preu unitari:                 %8.2f €\n".formatted(preu) +
            "----------------------------------------\n" +
            "Subtotal:                     %8.2f €\n".formatted(preu*quantitat) +
            "IVA:                     %8.2f €\n".formatted(iva) +
            "TOTAL A PAGAR:               %8.2f €\n".formatted((iva)+preu*quantitat) +
            "========================================");
}