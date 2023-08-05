package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Document;
import com.ecmconsulting.creche.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentRepository RepDoc;

    @Override
    public Document AjouterDocument(Document D) {
        RepDoc.save(D);
        return D;
    }

    @Override
    public void DeleteDocument(Document D) {
        RepDoc.delete(D);
    }

    @Override
    public void DeleteDocument(Long idDoc) {
        RepDoc.deleteById(idDoc);
    }

    @Override
    public List<Document> getAllDocument() {
        return RepDoc.findAll();
    }

    @Override
    public Document UpdateDocument(Document D) {
        RepDoc.save(D);
        return D;
    }

}
