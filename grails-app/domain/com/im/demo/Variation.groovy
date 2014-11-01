package com.im.demo

import grails.rest.Resource

@Resource(uri = '/variations', formats = ['json', 'xml'])
class Variation {

    String variation
    String type
    static belongsTo = [phone: Phone]
}
