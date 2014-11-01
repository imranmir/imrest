package com.im.demo.v2

import com.im.demo.Phone
import com.im.demo.Variation
import grails.rest.RestfulController

class VariationController extends RestfulController<Variation>{

    static namespace = "v2"
    static responseFormats = ['json', 'xml']

    public VariationController() {
        super(Variation)
    }


}
