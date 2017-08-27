String base = "https://maps.googleapis.com/maps/api/geocode/xml?"
String URL = "address=1600+Amphitheatre+Parkway,+Mountain+View,+CA"
def encoded = ['2 avenue de lafayette',
                'Boston',
                'MA'].collect {
      URLEncoder.encode(it,'UTF-8')   
}.join(',')
String qs = "address=$encoded"
//"$base$qs".toURL().text
def root = new XmlSlurper().parse("$base$qs")
def loc = root.result[0].geometry.location
println "${loc.lat}, ${loc.lng}"