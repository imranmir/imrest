package com.im.demo

import grails.rest.RestfulController

class CountryController extends RestfulController<Country>{


    static responseFormats = ['json', 'xml']

    public CountryController(){
        super(Country)
    }

//    protected Country queryForResource(Serializable id) {
//        Country.findByCountryAndId(Country.load(params.countryId),id)
//    }
//
//    protected List listAllResources(Map params){
//        City.findAllByCountry(Country.load(params.countryId), params)
//    }
//
//    def test(){
//        render City.list()
//    }





}
