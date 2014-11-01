package com.im.demo.v2

import com.im.demo.Phone
import grails.rest.RestfulController

class PhoneController extends RestfulController<Phone>{

    static namespace = "v2"

    static responseFormats = ['json', 'xml']

    public PhoneController(){
        super(Phone)
    }


}
