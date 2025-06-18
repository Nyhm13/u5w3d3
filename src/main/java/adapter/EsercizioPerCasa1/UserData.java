package adapter.EsercizioPerCasa1;

public class UserData implements DataSource{
    private String nomeCompleto;
    private int eta;

    public UserData(String nomeCompleto, int eta) {
        this.nomeCompleto = nomeCompleto;
        this.eta = eta;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public int getEta() {
        return eta;
    }

//    public getData(DataSource dataSource){
//        nomeCompleto= dataSource.getNomeCompleto();
//        eta= dataSource.getEta();
//    }
}
