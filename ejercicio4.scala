var total=0;
var apto=true;
for(i <- 1 to 10){
   println("Tiempo que tarda en el dia " + i + ":   ");
   val tiempo=readInt();
   println(tiempo);
   if(tiempo > 16){
       apto = false;
   }
   total=total + tiempo;
}
println("Total de los 10 dias es : " + total);
val promedio=total/10;
rintln("tu promedio es: " + promedio);

if(promedio<=15 && Apto==true){
   println("si eres apto")
}
else{

println("no eres apto")
}

else{
   println("elige otra especialidad");
}

