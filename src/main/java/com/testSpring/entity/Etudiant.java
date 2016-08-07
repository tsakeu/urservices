/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testSpring.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author tsakeu
 */
@Entity
public class Etudiant implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String matricul;

    public Etudiant()
    {
    }

    public Etudiant(Long id, String nom, String prenom, String matricul)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matricul = matricul;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getMatricul()
    {
        return matricul;
    }

    public void setMatricul(String matricul)
    {
        this.matricul = matricul;
    }

}
