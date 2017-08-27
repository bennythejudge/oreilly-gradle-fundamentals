// POGOs not POJOs

import groovy.transform.*
//@ToString
//@EqualsAndHashCode
//@TupleConstructor
// all of the above in one entry:
@Canonical

class Person {
    String first
    String last
}

Person qb1 = new Person(first: 'marco', last: 'rossi')
Person qb2 = new Person(first: 'ben', last: 'log')

// with @TupleConstructor I don't need labels
Person qb3 = new Person('marco', 'rossi')


println qb1 == qb2
println qb1 == qb3
Set qbs1 = [qb1, qb3]
Set qbs2 = [qb1, qb2]
// here only 1 if the two operands are the same
println qbs1.size()
println qbs2.size()