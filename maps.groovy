def map = [ a:1, b:2, c:3]
println map
println map.keySet()
println map.values()
println map.entrySet()

// assign a new key
map.d = 1
map['e'] = 2
map.put('f',3)

println map

map.each { e -> println "map[${e.key}] == ${e.value}" }
println "second type"
map.each { k,v -> println "map[$k] == $v" }

println "collect"

map.collect { k,v -> k * v } 