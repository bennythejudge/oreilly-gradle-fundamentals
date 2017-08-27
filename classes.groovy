// no need for import - a lot of the basic java.lang packages
// are imported automatically
import groovy.transform.*
@ToString // Abstract Syntax Tree transformation

// pogos in groovy

// neither private nor public...
class Person {
    String first
    String last
    
    // but i can also add my own getter setter method
//    void setLast(String last)
//        println "I am inside my own setLast"
//        this.last = last
//    }
    
    // I no longer need this since adding the import and the
    // @ToString at the top
    //String toString() { "$first $last" }
    
}


Person qb = new Person()
// i did not need to create a getter/setter method
qb.setFirst('Ben')
qb.last = 'Log'
// mixing getter setter method and instance variables
// that are neither private nor public
println "${qb.getFirst()} ${qb.last}"

print qb.toString()

// constructors will automaticall accept values for the 
// instance varibales and  set/get variables

Person two = new Person(first: 'marco', last: 'rossi')
println "${two.getFirst()} ${two.last}"
