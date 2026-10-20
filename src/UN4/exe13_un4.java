import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {
    Scanner scanner = new Scanner(System.in);
    print("Pes paquet (kg): ");
    double pes= scanner.nextDouble();
    print("Distància (km): ");
    double d = scanner.nextDouble();
    print("Servei urgent? (true/false): ");
    boolean urgent = scanner.nextBoolean();
    double preu = 3.50; double costkg = 1.20; double cost10km = 0.50; double urgencia = 5;
    if (urgent==false) {
        urgencia=0;
    }
    double dsumada=0;
    if (d>=10) {
        for (int i=0; i<d/10;i++) {
            dsumada=dsumada+cost10km;
        }
    }
    else {
        dsumada=cost10km;
    }
    println("""
            ========== FACTURA D'ENVIAMENT ==========
            Preu base:                         %.2f €
            Pes del paquet: %.2f kg            %.2f €
            Distància: %.0f km                 %.2f €
            Servei urgent:                     %.2f €
            ----------------------------------------
            TOTAL:                             %.2f €
            =========================================
            """.formatted(preu, pes, pes*costkg, d, dsumada, urgencia, preu+pes*costkg+dsumada+urgencia));

}

