package br.com.bradesco.acfi.controller;

import br.com.bradesco.acfi.entidades.Fundo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dados")
public class DadosController {

    private static Logger LOGGER = LoggerFactory.getLogger(DadosController.class);

    private static String URL = "http://localhost:8080/dados";
  //  private final DadosService dadosService;

 /*   @Autowired
    public DadosController(DadosService dadosService) {
        this.dadosService = dadosService;
    }*/


    @GetMapping
    public List<Fundo> consultarDados() {

        List<Fundo> listaFundos = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();
        Fundo[] fundos = restTemplate.getForObject(URL, Fundo[].class);

        if (fundos != null) {
            for (Fundo fundo : fundos) {
                listaFundos.add(fundo);
            }
        }

        return listaFundos;
       // return dadosService.consultar();
    }

   /* @GetMapping("/consultar")
    public ResponseEntity<List<Fundo>> consultarDados2(
            @RequestParam("tipo") String tipo,
            @RequestParam("reprocessamento") boolean reprocessamento,
            @RequestParam("dtPosD1Formatada") String dtPosD1Formatada,
            @RequestParam("dtPosD0Formatada") String dtPosD0Formatada,
            @RequestParam("cdCarteira") String cdCarteira) {

        List<Fundo> listaFundos = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();
        Fundo[] fundos = restTemplate.getForObject("http://localhost:8080/dados/consultar", Fundo[].class, tipo, reprocessamento, dtPosD0Formatada, dtPosD1Formatada, cdCarteira);

        if (fundos != null) {
            for (Fundo fundo : fundos) {
                listaFundos.add(fundo);
            }
        }

*//*
        List<Fundo> listaFundos = dadosService.consultarDados(tipo,reprocessamento, dtPosD1Formatada, dtPosD0Formatada, cdCarteira);
*//*

        if (listaFundos != null && !listaFundos.isEmpty()) {
            return new ResponseEntity<>(listaFundos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/


  /*  @PostMapping
    public ResponseEntity<Fundo> inserirDados(@RequestBody Fundo fundo) {
        Fundo novoDado = dadosService.inserirDados(fundo);
        return new ResponseEntity<>(novoDado, HttpStatus.CREATED);
    }
    */

    @PutMapping("/{id}")
    public ResponseEntity<Fundo> atualizarDados(@PathVariable Long id, @RequestBody Fundo fundo) {

        String url = URL +"/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Map<String, String> param = new HashMap<String, String>();
        param.put("id", String.valueOf(id));

        HttpEntity<Fundo> httpEntity = new HttpEntity<Fundo>(fundo, headers);

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Fundo> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, httpEntity, Fundo.class, param);

       return responseEntity;
    }


}
