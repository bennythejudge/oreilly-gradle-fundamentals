def cities = [ 'Enna', 'Perugia', 'Luxembourg city', 'Ponte San Giovanni' ]

println cities.collect { it.toLowerCase() }

println cities.collect { it.toLowerCase().reverse() }

