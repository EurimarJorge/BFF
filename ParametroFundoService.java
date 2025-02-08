/*
package br.com.bradesco.acfi.service;

import br.com.bradesco.acfi.entidades.ParametroFundoInvestimento;
import br.com.bradesco.acfi.feign.LiberacaoCotasFeign;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParametroFundoService {

    private LiberacaoCotasFeign liberacaoCotasFeign;

    public List<ParametroFundoInvestimento> consultarParametroFundo() {

        List<ParametroFundoInvestimento> listaParamentros = new ArrayList<>();
       // listaParamentros = liberacaoCotasFeign.consultarParametroFundo();
       RestTemplate restTemplate = new RestTemplate();
        ParametroFundoInvestimento[] paramentros = restTemplate.getForObject("http://localhost:8080/parametros-fundo/listar-todos", ParametroFundoInvestimento[].class);
        if (paramentros != null) {
            for (ParametroFundoInvestimento parametro : paramentros) {
                listaParamentros.add(parametro);

            }
        }

        return listaParamentros;
    }

    public List<ParametroFundoInvestimento> consultarDadosFundoAberturaId(String cFundoInves) {
        List<ParametroFundoInvestimento> parametroFundoInvestimentos = liberacaoCotasFeign.consultarParametroFundoPorCodigo(cFundoInves);
        return parametroFundoInvestimentos;

    }


    public ResponseEntity<ParametroFundoInvestimento> inserirParametroFundo(ParametroFundoInvestimento parametroFundo) {
        ResponseEntity<ParametroFundoInvestimento> parametroEntitiy = liberacaoCotasFeign.inserirParametroFundo(parametroFundo);
        return parametroEntitiy;
    }

    public ResponseEntity<ParametroFundoInvestimento> atualizarParametroFundo(String cFundoInves, ParametroFundoInvestimento parametroFundo) {
        ResponseEntity<ParametroFundoInvestimento> parametroEntity = liberacaoCotasFeign.atualizarParametroFundo(cFundoInves, parametroFundo);

        if (parametroEntity != null) {
              return new ResponseEntity<>(parametroFundo, HttpStatus.OK);
        } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
*/
