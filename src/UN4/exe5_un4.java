void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Nom de l'article: ");
    String nom = scanner.nextLine();
    IO.print("Preu unitari: ");
    double preu = scanner.nextDouble();
    IO.print("Quantitat: ");
    int quantitat = scanner.nextInt();
    double subtotal = preu*quantitat;
    IO.println("\n" +
            "=========== TIQUET DE COMPRA ===========\n" +
            "Article:         %-15s\n".formatted(nom) +
            "Unitats:                            %3d\n".formatted(quantitat) +
            "Preu unitari:                 %.2f €\n".formatted(preu) +
            "----------------------------------------\n" +
            "Subtotal:                     %2.f €\n" +
            "IVA (21%):                    18.89 €\n" +
            "TOTAL A PAGAR:               108.86 €\n" +
            "========================================");
}