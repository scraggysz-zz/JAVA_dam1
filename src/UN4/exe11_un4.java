import static java.lang.IO.*;

void main() {
    Scanner scanner = new Scanner(System.in);
    print("Coordenada X del punt A: ");
    int x1= scanner.nextInt();
    print("Coordenada Y del punt A: ");
    int y1 = scanner.nextInt();
    print("Coordenada X del punt B: ");
    int x2 = scanner.nextInt();
    print("Coordenada Y del punt B: ");
    int y2 = scanner.nextInt();
    double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double v = 60;
    println("Distància entre A i B: %.2f unitats".formatted(d));
    println("Velocitat del vehicle: %.2f unitats/h".formatted(v));
    double temps = d/v*60;
    println("Temps estimat: %.2f minuts".formatted(temps));
    println("Temps arrodonit: %d minuts".formatted(Math.round(temps)));
}