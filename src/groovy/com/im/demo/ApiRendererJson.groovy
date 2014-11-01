package com.im.demo

import grails.converters.JSON
import grails.rest.render.AbstractRenderer
import grails.rest.render.RenderContext
import grails.util.GrailsWebUtil
import org.codehaus.groovy.grails.web.mime.MimeType

class ApiRendererJson<T> extends AbstractRenderer<T> {

    public ApiRendererJson(Class<T> targetClass) {
        super(targetClass, MimeType.JSON);
    }

    @Override
    void render(T object, RenderContext context) {
        context.contentType = MimeType.JSON.name
        JSON converter
//        def detail = context.arguments?.detail ?: null
//        if(detail){
//        JSON.use(detail) {
//            converter = object as JSON
//        }
//        }else{
//            converter = object as JSON
//        }

        converter = (['id': object.id, 'name': object.name] as JSON)

        converter.render(context.getWriter())
    }
}
