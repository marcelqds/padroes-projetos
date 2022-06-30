package mqds.padroes.estrutural.facade;

import mqds.padroes.estrutural.facade.subsistema.CrmService;
import mqds.padroes.estrutural.facade.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuprarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
