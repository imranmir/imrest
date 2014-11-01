package com.im.demo

import grails.rest.RestfulController

class CityController extends RestfulController<City>{


    static responseFormats = ['json', 'xml']

    public CityController(){
        super(City)
    }

    protected City queryForResource(Serializable id) {
        City.findByCountryAndId(Country.load(params.countryId),id)
    }
//
    protected List listAllResources(Map params){
        City.findAllByCountry(Country.load(params.countryId), params)
    }




}
