class Person {
    String first
    String last
    void setLast (String last) {
        this.last = last
    }   
}


Person qb = new Person()
qb.setFirst('tom')
qb.last = 'brady'
println "${qb.getFirst()} ${qb.last}"
