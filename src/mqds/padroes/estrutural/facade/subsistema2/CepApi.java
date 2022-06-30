package mqds.padroes.estrutural.facade.subsistema2;

public class CepApi {
    private static CepApi instance = new CepApi();
    private CepApi(){}

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Muritiba";
    }

    public String recuprarEstado(String cep){
        return "BA";
    }
}
