/*
package br.com.bradesco.acfi.service;

import br.com.bradesco.acfi.entidades.Fundo;
import br.com.bradesco.acfi.feign.LiberacaoCotasFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class DadosService {

    private LiberacaoCotasFeign liberacaoCotasFeign;

    private static Logger LOGGER = LoggerFactory.getLogger(DadosService.class);


    public List<Fundo> consultar() {

       List<Fundo> listaFundos = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();
        Fundo[] fundos = restTemplate.getForObject("http://localhost:8080/dados", Fundo[].class);


        if (fundos != null) {
            for (Fundo fundo : fundos) {
                listaFundos.add(fundo);

            }
        }

        return listaFundos;
    }


    public List<Fundo> consultarDados(String tipo, boolean reprocessamento, String dtPosD1Formatada, String dtPosD0Formatada, String cdCarteira) {



        List<Fundo> listaFundos = liberacaoCotasFeign.consultarDados2(tipo, reprocessamento, dtPosD1Formatada, dtPosD0Formatada, cdCarteira).getBody();

        return listaFundos;
    }


    public Fundo inserirDados(Fundo fundo) {

        ResponseEntity<Fundo> ret = liberacaoCotasFeign.inserirDados(fundo);
        return ret.getBody();
    }

    public Fundo atualizarDados(Long id, Fundo fundo) {
        ResponseEntity<Fundo> dadoAtualizado = liberacaoCotasFeign.atualizarDados(id, fundo);



        return dadoAtualizado.getBody();

    }


}
*/
