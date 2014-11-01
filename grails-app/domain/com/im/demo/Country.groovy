package com.im.demo

import grails.rest.Resource


@Resource
class Country {

    String name
    static hasMany = [states: City]


}
