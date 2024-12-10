package com.sabertech.ananke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import com.sabertech.ananke.model.Documento;
import com.sabertech.ananke.service.DocumentoService;

@RequestMapping("/documentos")
@CrossOrigin("origins = *")
@Controller
public class DocumentoController {

    @Autowired
    private DocumentoService DocumentoService;

    @GetMapping()
    public ModelAndView listasDocumento() {
        ModelAndView mv = new ModelAndView("upload");
        Iterable<Documento> documento = DocumentoService.listDeDocumentos();
        mv.addObject("documentos", documento);
        System.out.println(documento);
        return mv;
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Documento listDocumento(@PathVariable("id") Long id) {
        Documento documento = DocumentoService.buscarPorId(id);
        return documento;
    }

    @PostMapping("/salvar")
    // @ResponseStatus(HttpStatus.TEMPORARY_REDIRECT)
    public String salvarDocumento(Documento documento) {
        DocumentoService.salvar(documento);
        return "redirect:/documentos";
    }

    // @GetMapping(value = "/{id}/Documento")
    // public ResponseEntity<byte[]> getDocumento(@PathVariable Long id) {
    // Documento Documento = DocumentoService.buscarPorId(id);
    // return ResponseEntity.ok()
    // .contentType(MediaType.parseMediaType(Documento.getDados().))
    // .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" +
    // Documento.getNome() + "\"")
    // .body(Documento.getConteudo());
    // }

}
