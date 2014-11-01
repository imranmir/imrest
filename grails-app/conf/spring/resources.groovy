import com.im.demo.ApiCollectionRendererJson
import com.im.demo.ApiRendererJson
import com.im.demo.Person
import com.im.demo.Phone
import com.im.demo.PhoneMarshallerJson
import com.im.demo.Variation
import grails.converters.JSON
import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.json.JsonRenderer
import org.codehaus.groovy.grails.web.converters.configuration.ObjectMarshallerRegisterer

// Place your Spring DSL code here
beans = {

//    customPhoneJsonMarshaller(ObjectMarshallerRegisterer){
//        marshaller = new PhoneMarshallerJson()
//        converterClass = JSON
//        priority = 1
//    }
//    phoneRenderer(ApiRendererJson, Phone)
//    phoneCollectionRenderer(ApiCollectionRendererJson, Phone)

//    userRenderer(JsonRenderer, Person) {
//        includes = ['email', 'firstName', 'lastName']
//    }
}
