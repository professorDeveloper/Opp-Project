package arrayToqson

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> arrayToqson
 * Class Name -> Main
 * Copyright © : 9/6/2022
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Massiv hajmini kiriting: ")
    var n = scanner.nextInt()
    var a = IntArray(n)
    var b = 0
    for (i in a.indices){
        print("Raqam: ")
        a[i] = scanner.nextInt()
    }
    for (i in a.indices){
        if (a[i]%2!=0){
            b=a[i]
        }
    }
    for (i in a.indices){
        if (a[i]%2!=0){
            a[i]+=b
        }
        println(a[i])
    }
}