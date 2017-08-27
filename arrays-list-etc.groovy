// collections
// just do it
def nums = [1,2,3,4]
println nums
println nums.class.name


def llist = [3,5,6,1,9] as LinkedList
println llist
println llist.class.name

def set = [3,5,6,1,9] as Set
println set
println set.class.name

// iterations - classic for
for (int i = 0; i < nums.size(); i++) { println nums[i] }

// iterarions - foreach introduced by java 5
for (Integer n: nums) { println n }

// iterations - for in loop - groovy
for (n in nums) { println n }

// closure
println "closures!!"
// implicit name of the values in the closure
nums.each { println it }
// I don't want to use the default 'it'
// arrow notation
nums.each { n -> println n }

// another version
nums.eachWithIndex { n, idx ->
    println "nums[$idx] == $n"
}
// the "result" at the bottom of the display is because the closure
// methods return the list

// lambdas?

// using the loops
def doubles = []

// << is "append"
nums.each { doubles << it * 2}
// this is however a violation of functional style because i am 
// changing an external variable inside the block



print nums
println doubles


// the collect method - functional style
// collect is a transform method
print "here cometh the collect method"
println nums.collect { it * 2}

