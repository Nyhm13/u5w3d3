package singleton;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        CartaIdentita cartaIdentita1 = new CartaIdentita("Mario Rossi",LocalDate.of(2000,9,9),"Roma");
//        CartaIdentita cartaIdentita2 = new CartaIdentita("Mario Rossi",LocalDate.of(2000,9,9),"Roma");



        CartaIdentita cartaIdentita1= CartaIdentita.getCartaIdentita();
        CartaIdentita cartaIdentita2= CartaIdentita.getCartaIdentita();

        System.out.println(cartaIdentita1.hashCode());
        System.out.println(cartaIdentita2.hashCode());
    }
}
