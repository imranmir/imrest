package com.im.demo.v1

import com.im.demo.Phone
import com.im.demo.Variation
import grails.converters.JSON
import grails.rest.RestfulController

class PhoneController extends RestfulController<Phone>{

    static namespace = "v1"

    static responseFormats = ['json', 'xml']

    public PhoneController(){
        super(Phone)
    }

    def index(){
        respond(Phone.list(), [detail: 'compact'])
    }

//    def index() {
//        params.max = Math.min(params.max ?: 10, 100)
//        def detail = params?.detail?.toLowerCase() ?: "compact"
//        withFormat {
//            json {
//                respond Phone.list(params), [detail:detail]
//            }
//            xml {
//                XML.use(detail) {
//                    respond phone
//                }
//            }
//        }
//    }

//    def show(Phone phone){
//        withFormat {
//            json{
//                JSON.use('compact') {
//                    respond phone
//                }
//
//            }
//            xml{
//                respond phone
//            }
//        }
//    }

//    def show(Phone phone){
//        respond phone, [detail: params.detail]
//        withFormat {
//            json{
//                respond phone, [detail: 'compact']
//                }
//
//            xml{
//                respond phone, params.detail?:'compact'
//            }
//        }
//    }


    def show(Phone phone){
        respond phone

    }

    def variations(Phone phone){
        respond (phone.variations)
    }
}
