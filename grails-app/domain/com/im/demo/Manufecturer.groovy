package com.im.demo

import javax.annotation.Resource

@Resource
class Manufecturer {

   String name
   
   static hasMany = [phones: Phone]
    
}
