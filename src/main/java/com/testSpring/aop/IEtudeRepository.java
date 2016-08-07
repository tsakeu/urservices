/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testSpring.aop;

import com.testSpring.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tsakeu
 */
public interface IEtudeRepository extends JpaRepository<Etudiant, Long>
{

}
