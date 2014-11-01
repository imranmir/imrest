package com.im.demo

import grails.rest.Resource

//@Resource(uri= "/phones", formats= ["json","xml"])
class Phone {
 
 String name
 String code
 BigDecimal price
 
 static belongsTo = [manufecturer: Manufecturer]
 static hasMany = [variations: Variation]
 
    
}
