String base = "https://maps.googleapis.com/maps/api/geocode/xml?"
String URL = "address=1600+Amphitheatre+Parkway,+Mountain+View,+CA"
def addresses = [ "Casa": "61 montee saint crepin, 1365, luxembourg, luxembourg",
                   "casafi": "via arnolfo 19b, 50121, firenze, italia"
                   ]

def encoded = [ "61 montee saint crepin, 1365, luxembourg, luxembourg"].collect {
      URLEncoder.encode(it,'UTF-8')   
}.join(',')
String qs = "address=$encoded"
//"$base$qs".toURL().text
def root = new XmlSlurper().parse("$base$qs")

println root.result[0].geometry.location.lng

def loc = root.result[0].geometry.location

//println loc
println "${loc.lat}, ${loc.lng}"

// "that would be a lot of work in Java"!
