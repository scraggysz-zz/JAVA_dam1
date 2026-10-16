void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Nom de l'article: ");
    String nom = scanner.nextLine();
    IO.print("Preu unitari: ");
    double preu = scanner.nextDouble();
    IO.print("Quantitat: ");
    int quantitat = scanner.nextInt();
    double iva = preu*quantitat*0.21;
    IO.println("""                    
            =========== TIQUET DE COMPRA ===========
            Article:                           %-15s
            Unitats:                             %3d
            Preu unitari:                    %8.2f €
            ----------------------------------------
            Subtotal:                        %8.2f €
            IVA (21%%):                      %8.2f €
            TOTAL A PAGAR:                   %8.2f €
            ========================================
            """.formatted(nom, quantitat, preu, quantitat*preu, iva, (iva)+preu*quantitat));
}