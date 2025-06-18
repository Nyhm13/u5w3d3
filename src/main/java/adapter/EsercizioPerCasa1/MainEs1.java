package adapter.EsercizioPerCasa1;

import java.util.Date;

public class MainEs1 {
    public static void main(String[] args) {

        Info persona=new Info("Mario", "Rossi", new Date(95, 1, 12)); // Anno, Mese (0-based), Giorno


        DataSource adapter= new InfoAdapter(persona);

        System.out.println(adapter.getNomeCompleto());
        System.out.println(adapter.getEta());

        UserData u2= new UserData(adapter.getNomeCompleto(), adapter.getEta());
        System.out.println(u2.getNomeCompleto());
        System.out.println(u2.getEta());
    }
}
