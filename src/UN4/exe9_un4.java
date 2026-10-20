import static java.lang.IO.*;

void main() {
    println("--- MÀQUINA RECREATIVA ---");
    Random random = new Random();
    int a = random.nextInt(1,6);
    int b = random.nextInt(1,6);
    int c = random.nextInt(1,6);
    int suma = a+b+c;
    int[] numeros= {a,b,c};
    int max = numeros[0];
    int min = numeros[0];
    println("Resultat: ["+a+"] ["+b+"] ["+c+"]");
    println("Suma: "+suma);
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > max) {
            max = numeros[i];
        }
        else if (numeros[i]<min) {
            min = numeros[i];
        }
    }
    int diferencia = max-min;
    println("Valor màxim: "+max);
    println("Valor mínim: "+min);
    println("Diferència màxim-mínim: "+diferencia);
}