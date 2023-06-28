//Scrivi un ciclo che stampa numeri da 1 a 100, aumentando di 2 (quindi 1, 3, 5...). Utilizzare due
// diverse funzioni di  stampa per valori inferiori a 50 e valori superiori a 50.

fun main(){
    for(i in 1..100 step 2){
        if(i<50) {
            smallNum(i)
        }else {
            bigNum(i)
        }
    }
}

fun smallNum(num : Int) {
    print("$num ")
}

fun bigNum (num : Int) {
    print("$num ")
}

