void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Nom del passatger: ");
    String nom = scanner.nextLine();
    IO.print("Codi del vol: ");
    String codi = scanner.nextLine();
    IO.print("Seient: ");
    String seient = scanner.nextLine();
    String numseparat = seient.replaceAll("[^0-9]", "");
    String lletres = seient.replaceAll("[^a-zA-z]", "");
    IO.println("""     
            ========================================               
                     TARGETA D'EMBARCAMENT 
            ========================================
            PASSATGER:                        %-15s
            VOL:                              %-15s
            SEIENT:                           %s%-15s
            ----------------------------------------
            %s, el seu vol %s està confirmat.
            ========================================
            """.formatted(nom.toUpperCase(), codi.toUpperCase(), numseparat.toUpperCase(), lletres.toUpperCase(),nom, codi.toUpperCase()));
}