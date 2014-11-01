package com.im.demo.v1

import com.im.demo.Phone
import com.im.demo.Variation
import grails.rest.RestfulController

class VariationController extends RestfulController<Variation>{



    static namespace = "v1"
    static responseFormats = ['json', 'xml']

    public VariationController() {
        super(Variation)
    }

    def index() {
        def obj = ["message" : "v1 has been deprecated"]
        respond obj
    }
}
