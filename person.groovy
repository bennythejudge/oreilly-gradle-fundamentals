class Person {
    String first
    String last
    
    void setLast(String last) {
        println 'inside setLast'
        this.last = last
    }
    
    // note that I don't need an explicit getter 
}

Person qb = new Person(first: 'tom', last: 'brady')
println "${qb.getFirst()} ${qb.last} ${qb.getLast()}"
