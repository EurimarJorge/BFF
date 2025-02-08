/*
package br.com.bradesco.acfi.controller;

import br.com.bradesco.acfi.entidades.ParametroFundoInvestimento;
import br.com.bradesco.acfi.service.ParametroFundoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parametros-fundo")
public class ParametroFundoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParametroFundoController.class);

    private final ParametroFundoService parametroFundoService;

    @Autowired
    public ParametroFundoController(ParametroFundoService parametroFundoService) {
        this.parametroFundoService = parametroFundoService;
    }

    @GetMapping("/listar-todos")
    public List<ParametroFundoInvestimento> consultarParametroFundo() {
        return parametroFundoService.consultarParametroFundo();
    }

    @GetMapping("/consultar")
    public List<ParametroFundoInvestimento> consultarParametroFundoPorCodigo(@RequestParam("cFundoInves") String cFundoInves) {

        List<ParametroFundoInvestimento> resultado = null;
        resultado = parametroFundoService.consultarDadosFundoAberturaId(cFundoInves);

        return resultado;

    }

    @PostMapping("/incluir")
    public ResponseEntity<ParametroFundoInvestimento> inserirParametroFundo(@RequestBody ParametroFundoInvestimento parametroFundo) {
        ResponseEntity<ParametroFundoInvestimento> novoParametro = parametroFundoService.inserirParametroFundo(parametroFundo);
        return novoParametro;
    }

    @PutMapping("/alterar/{cFundoInves}")
    public ResponseEntity<ParametroFundoInvestimento> atualizarParametroFundo(@PathVariable String cFundoInves, @RequestBody ParametroFundoInvestimento parametroFundo) {

        ResponseEntity<ParametroFundoInvestimento> parametroAtualizado = parametroFundoService.atualizarParametroFundo(cFundoInves, parametroFundo);
        return parametroAtualizado;
    }



}
*/
