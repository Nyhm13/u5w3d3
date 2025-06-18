package chainOfResponsability;

// la rendiamo abstract perche non vogliamo instanziare oggetti di questa classe
public  class Erogatore {

    private int valoreBanconota;
    private Erogatore erogatoreSuccessivo;


    public Erogatore(int valoreBanconota) {
        this.valoreBanconota = valoreBanconota;
    }

    public int getValoreBanconota() {
        return valoreBanconota;
    }

    public void setValoreBanconota(int valoreBanconota) {
        this.valoreBanconota = valoreBanconota;
    }

    public Erogatore getErogatoreSuccessivo() {
        return erogatoreSuccessivo;
    }

    public void setErogatoreSuccessivo(Erogatore erogatoreSuccessivo) {
        this.erogatoreSuccessivo = erogatoreSuccessivo;
    }
    //metodo che si occupa di eroggare il prelieve per il taglio che gli compete
    /*
     * Metodo che esegue l’erogazione del prelievo per il taglio gestito da questo erogatore.
     * Se il taglio non è adatto (es. prelievo di 30 ma questo gestisce solo 50),
     * la richiesta viene passata all’erogatore successivo.
     */
    public void eroga(ContoBancario contoBancario){
        int saldo= contoBancario.getSaldo();
        int prelievoRimanente=contoBancario.getPrelievoRestante();

        // Verifica che il saldo sia sufficiente a coprire il prelievo
        if(saldo>=prelievoRimanente){
            // Se il prelievo rimanente è almeno del valore della banconota gestita, si può procedere
            if (prelievoRimanente>=valoreBanconota){
                int numBanconote = prelievoRimanente/valoreBanconota;
                // prelievoRimanente%valoreBanconota fornira il prelievo che rimane dopo questa erogazione
                contoBancario.setPrelievoRestante(prelievoRimanente%valoreBanconota);
                contoBancario.setSaldo(saldo-numBanconote*valoreBanconota);

                System.out.println("erogato " + numBanconote + " banconote da " + valoreBanconota + "euro ");
            } else {
                System.out.println("erogato 0  banconote da " + valoreBanconota + " euro");
            }

            if (erogatoreSuccessivo!=null){
                erogatoreSuccessivo.eroga(contoBancario);
            }
        }

        else {
            System.out.println("Saldo insufficiente per il prelievo di " + contoBancario.getPrelievoRestante() + " euro");
        }

    }
}
