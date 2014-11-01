class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/v1/phones"(resources: 'phone', namespace: 'v1'){
//            "/variations"(controller: 'variation', namespace: 'v1')
//        }
//        "/v2/phones"(resources: 'phone', namespace: 'v2'){
//            "/variations"(resources: 'variation')
//        }
//        "/manufecturers"(resources: 'manufecturer')


        "/v1/variations"(version: '1.0', resources: 'variation', namespace: 'v1')
        "/v2/variations"(version: '2.0', resources: 'variation', namespace: 'v2')








//        "/v1/phones"(resources: 'phone', namespace: 'v1')
//
//
//        "/people"(resources: 'person')
//        "/cities"(resources: 'city')
//
//
//        "/countries"(resources: 'country'){
//            "/cities"(resources: 'city')
//        }


        "/"(view:"/index")
        "500"(view:'/error')
	}
}
