package com.im.demo

class Phone {
 
 String name
 String code
 BigDeciaml price
 
 static belongsTo = [manufecturer: Manufecturer]
 static hasMany = [variations: Variation]
 
    
}
