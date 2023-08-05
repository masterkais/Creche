package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Document;
import com.ecmconsulting.creche.entity.Utilisateur;

import java.util.List;

public interface DocumentService {
    Document AjouterDocument(Document D);
    void DeleteDocument(Document D);
    void DeleteDocument(Long idDoc);

    List<Document> getAllDocument();
    Document UpdateDocument(Document D);
}
