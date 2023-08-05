package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Message;
import com.ecmconsulting.creche.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
@Autowired
    MessageRepository RepMessage;
    @Override
    public Message AjouterMessage(Message M) {
        RepMessage.save(M);
        return M;
    }

    @Override
    public void DeleteMessage(Message M) {
        RepMessage.delete(M);
    }

    @Override
    public void DeleteMessage(Long idMesg) {
        RepMessage.deleteById(idMesg);
    }

    @Override
    public List<Message> getAllMessage() {
        RepMessage.findAll();
        return  RepMessage.findAll();
    }

    @Override
    public Message UpdateMessage(Message M) {
        RepMessage.save(M);
        return M;
    }

    @Override
    public void envoieMessage(Message M) {
        RepMessage.save(M);
    }

}
