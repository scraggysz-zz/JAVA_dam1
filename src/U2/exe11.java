import static java.lang.IO.*;

void main() {
    int a = Integer.parseInt(IO.readln("¿Velocitat?: "));
    if (a>=25) {
        boolean b = readln("¿Pla premium? (true/false): ").equalsIgnoreCase("true");
        if (b) {
            println("Qualitat: 4K");
        }
        else {
            println("Qualitat=1080p");
        }
    }
    else if (a>4 && a<25){
        boolean b = readln("Pla premium? (true/false): ").equalsIgnoreCase("true");
        if (b) {
            print("Qualitat: 1080p");
        }
        else {
            println("Qualitat: 720p ");
        }
    }
    else {
        println("Qualitat: 480p");
    }
}