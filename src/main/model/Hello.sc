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

var s:Array[String]= new Array[String](5)
s(0)="Kreuzer"
s(1)="Schlachtschiff"
s(2)="Torpedoboot"
s(3)="U-Boot"
s(4)="Flugzeugtraeger"

for ( x <- s ) {
  println(x)
}
