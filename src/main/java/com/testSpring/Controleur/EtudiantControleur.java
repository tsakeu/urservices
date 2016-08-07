/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testSpring.Controleur;

import com.testSpring.aop.IEtudeRepository;
import com.testSpring.entity.Etudiant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tsakeu
 */
@RestController
public class EtudiantControleur
{

    @Autowired
    private IEtudeRepository controller;

    @RequestMapping(value = "/sauve")
    public Etudiant enregistrement(Etudiant e)
    {
        return controller.save(e);
    }

    @RequestMapping(value = "/liste")
    public List Tous(Etudiant e)
    {
        return controller.findAll();
    }

    @RequestMapping(value = "/Suprim")
    public boolean supression(Long id)
    {
        controller.delete(id);
        return true;
    }

}
