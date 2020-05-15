//Wie gehts wie stehts das ist ein erstes Scala Programm
val ersteValue = "Hello World!"
var ersteVariable = "Tschuess"

println(ersteValue)
println(ersteVariable)

val a = 2.5
val b = 2.75
val c = a + b
val ausgabeString = s"$a $b $c"




var str1 = "Schiffe "
var str2 = "versenken ist"

println(str1 + str2 + "krass!")

var string1 = "Neuer"
var string2 = "Versuch"
string1.concat(string2)
println(string1)

var s: Array[String] = new Array[String](5)
s(0) = "Kreuzer"
s(1) = "Schlachtschiff"
s(2) = "Torpedoboot"
s(3) = "U-Boot"
s(4) = "Flugzeugträger"

for (x <- s) {
  println(x)
}


/* TODO: Jetzt hier noch ein bisschen vielleicht mit Strings arbeiten
  ein paar erstellen und dann irgendwie zusammensetzen vielleicht, dann ein Array erstellen, befüllen
  und wenns zeitlich geht noch mit einer Schleife auslesen oder sowas
  Muss nicht alles sein aber einfach damit man die Idee bekommt, dass wir die Basics
  verstanden haben.
 */