package com.im.demo

import grails.converters.JSON
import org.codehaus.groovy.grails.web.converters.marshaller.ClosureObjectMarshaller

class PhoneMarshallerJson extends ClosureObjectMarshaller<JSON>{
    static final marshal = {Phone phone->
        def map = [:]
        map.name = phone.name
        map.manufecturer = [:]
        map.manufecturer.name = phone.manufecturer.name
        map.manufecturer.id = phone.manufecturer.id
        map.variations = []
        phone.variations.each{Variation variation->
            def v = [:]
            v.name = variation.variation
            v.type = variation.type
            map.variations << v

        }
        map
    }
    public PhoneMarshallerJson(){
        super(Phone, marshal)
    }
}
