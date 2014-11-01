package com.im.demo

import grails.rest.Resource


@Resource
class City {

    String name
    Integer population
    Integer area

    static belongsTo = [country: Country]

}
