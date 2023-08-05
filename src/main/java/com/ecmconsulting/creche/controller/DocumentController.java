package com.ecmconsulting.creche.controller;
import com.ecmconsulting.creche.entity.Document;
import com.ecmconsulting.creche.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    DocumentService DocServ;
    @GetMapping("/documents")
    public List<Document> getAllDocuments(){
        List<Document> list=DocServ.getAllDocument();
        return list;
    }

    @PostMapping
    @ResponseBody
    public Document AjouterDocument(@RequestBody Document D){
        return DocServ.AjouterDocument(D);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteDocument(@PathVariable("id")Long idDoc){
        DocServ.DeleteDocument(idDoc);
    }
    @PutMapping("/{id}")
    @ResponseBody
    public Document UpdateDocument(@RequestBody Document D) {
        return DocServ.UpdateDocument(D);
    }
}
