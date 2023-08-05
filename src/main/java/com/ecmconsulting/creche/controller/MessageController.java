package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Message;
import com.ecmconsulting.creche.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService MesService;

    @GetMapping("/messages")
    @ResponseBody
    public List<Message> GetAllMessage() {
        List<Message> List=MesService.getAllMessage();
        return List;
    }
    @PostMapping()
    @ResponseBody
    public Message AjouterMessage (@RequestBody Message M){

        return MesService.AjouterMessage(M);
    }
    @DeleteMapping ("/{id}")
    @ResponseBody
    public void deleteMessage(@PathVariable("id")Long idMesg){

        MesService.DeleteMessage(idMesg);
    }
    @PutMapping("/{id}")
    @ResponseBody
    public Message UpdateMessage(@RequestBody Message M){
        return MesService.UpdateMessage(M);
    }

    @PostMapping("/envoyerMessage")
    @ResponseBody
    public void envoieMessage(@RequestBody Message M) {
        MesService.envoieMessage(M);
    }
}

