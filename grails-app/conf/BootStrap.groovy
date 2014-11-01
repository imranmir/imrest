import com.im.demo.City
import com.im.demo.Country
import com.im.demo.Manufecturer
import com.im.demo.Person
import com.im.demo.Phone
import com.im.demo.PhoneMarshallerJsonCompact
import com.im.demo.Variation
import grails.converters.JSON

import javax.lang.model.element.VariableElement

class BootStrap {

    def init = { servletContext ->
        initData()

        println "Manufecture count "+Manufecturer.count
        println "Phone count "+Phone.count
        println "Variation count "+Variation.count

        JSON.createNamedConfig("compact"){
           it.registerObjectMarshaller(Phone, PhoneMarshallerJsonCompact.marshal)
        }
    }


    void initData() {
        Person johnson = new Person(firstName: 'Johnson', lastName: 'Mitchel', age: 28, email: 'johnson@gmail.com', password: 'password').save()
        Person david = new Person(firstName: 'David', lastName: 'Warner', age: 35, email: 'david@gmail.com', password: 'password').save()
        Person person = new Person(firstName: 'Rizwan', lastName: 'Mir', age: 30, email: 'rizwan@gmail.com', password: 'password').save()

        Country c1 = new Country(name: 'country1').save()
        Country c2 = new Country(name: 'country2').save()

        new City(country: c1, name: 'c1city1', population: 1000, area: 10000).save(flush: true)
        new City(country: c1, name: 'c1city2', population: 1000, area: 10000).save(flush: true)
        new City(country: c2, name: 'c2city2', population: 1000, area: 10000).save(flush: true)
        new City(country: c2, name: 'c2city2', population: 1000, area: 10000).save(flush: true)

        println ">>>>>>>>>>>>>>>>>>>>>>>>>> Cities created = "+City.count


        Manufecturer apple = new Manufecturer(name: 'Apple').save(flush: true)
        Phone i3 = new Phone(name: 'iphone3', code: 'i3', price: 10000, manufecturer: apple).save(flush: true)
        Phone i4 = new Phone(name: 'iphone4', code: 'i4', price: 30000, manufecturer: apple).save(flush: true)
        Phone i5 = new Phone(name: 'iphone5', code: 'i5', price: 35000, manufecturer: apple).save(flush: true)

        Variation i3mini = new Variation(phone: i3, variation: "i3mini",type: 'model').save(flush: true)
        Variation i4mini = new Variation(phone: i4, variation: "i4mini",type: 'model').save(flush: true)
        Variation i5mini = new Variation(phone: i5, variation: "i5mini",type: 'model').save(flush: true)

        Manufecturer samsung = new Manufecturer(name: 'Samsung').save(flush: true)
        Phone s1 = new Phone(name: 's1', code: 'S12X', price: 10000, manufecturer: samsung).save(flush: true)
        Phone s2 = new Phone(name: 's2', code: 'S22X', price: 20000, manufecturer: samsung).save(flush: true)
        Phone note1 = new Phone(name: 'note1', code: 'M12X', price: 25000, manufecturer: samsung).save(flush: true)

        Variation mini = new Variation(phone: s1, variation: "samsung s1 mini",type: 'model').save(flush: true)
        Variation large = new Variation(phone: s1, variation: "samsung s1 large",type: 'model').save(flush: true)

        Variation mini1 = new Variation(phone: s2, variation: "samsung s2 mini",type: 'model').save(flush: true)
        Variation large1 = new Variation(phone: s2, variation: "samsung s2 large",type: 'model').save(flush: true)

        Variation mini2 = new Variation(phone: note1, variation: "samsung note1 mini",type: 'model').save(flush: true)
        Variation large2 = new Variation(phone: note1, variation: "samsung note1 large",type: 'model').save(flush: true)

    }

}
