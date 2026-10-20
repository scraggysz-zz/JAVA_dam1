import static java.lang.IO.*;

void main() {
    Scanner scanner = new Scanner(System.in);
    print("Potència del aparell: ");
    double pot = scanner.nextInt();
    print("Hores de funcionament al dia: ");
    int hores = scanner.nextInt();
    print("Preu del kWh: ");
    double preu = scanner.nextDouble();
    double kw = pot/1000;
    println("Consum diari: %.2f".formatted(kw*hores)+" kWh.");
    println("Consum mensual: %.2f".formatted(kw*(hores*30))+" kWh.");
    double cost = kw*preu*hores*30;
    println("Cost mensual: %.2f".formatted(cost)+" €");
    double cent = Math.round(cost*100);
    println("Cost mensual en cèntims: %.0f".formatted(cent));
}