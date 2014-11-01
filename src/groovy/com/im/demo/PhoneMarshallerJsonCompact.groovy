package com.im.demo

import grails.converters.JSON
import org.codehaus.groovy.grails.web.converters.marshaller.ClosureObjectMarshaller

class PhoneMarshallerJsonCompact extends ClosureObjectMarshaller<JSON>{
    static final marshal = {Phone phone->
        def map = [:]
        map.name = phone.name
        map.id = phone.id
        map
    }
    public PhoneMarshallerJsonCompact(){
        super(Phone, marshal)
    }
}
