package br.com.praticas.Pratica1Aula55.test;

import br.com.praticas.Pratica1Aula55.classes.Email;



public class EmailApp {
    public static void main(String[] args){
        Email email = new Email("John", "Doe");
        email.showInfo();
        System.out.println(email.getPassword());

        Email email1 = new Email("James", "Alexander");
        email1.showInfo();
        System.out.println(email1.getPassword());



    }
}
