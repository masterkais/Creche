package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Message;

import java.util.List;

public interface MessageService {
    Message AjouterMessage(Message M);
    void DeleteMessage(Message M);
    void DeleteMessage(Long idMesg);
    List<Message> getAllMessage();
    void envoieMessage(Message M);
    Message UpdateMessage(Message M);
}
