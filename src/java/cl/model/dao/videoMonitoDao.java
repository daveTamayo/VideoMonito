/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.pojos.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Familia Pinilla
 */
public class videoMonitoDao{


        public void GuardarUsuario(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(cliente);
        transaction.commit();
        session.close();
    }

}
