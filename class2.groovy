import groovy.transform.*
@ToString
@EqualsAndHashCode
class Person {
    String first
    String last
}

Person qb1 = new Person(first: 'marco', last: 'rossi')
Person qb2 = new Person(first: 'ben', last: 'log')
Person qb3 = new Person(first: 'marco', last: 'rossi')
println qb1 == qb2
println qb1 == qb3
