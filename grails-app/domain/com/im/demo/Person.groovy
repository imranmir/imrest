package com.im.demo

import grails.rest.Resource


@Resource
class Person {

   String firstName
   String lastName
   Integer age
   String email
   String password

    static constraints = {
        age nullable: true
    }


    
}
