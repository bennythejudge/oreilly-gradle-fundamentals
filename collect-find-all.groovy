// collections
// just do it
def nums = [3,1,4,1,5,9]
// collect is a transform method
println "here cometh the collect method"
println nums
println nums.collect { it * 2 }
// .findAll is a closure too
// return all divisible by 3
            .findAll { it % 3 == 0}
// and sum?
            .sum()
