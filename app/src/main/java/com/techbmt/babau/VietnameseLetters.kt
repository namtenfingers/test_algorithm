package com.techbmt.babau

import java.util.regex.Pattern

fun main() {
    val inputString = "hfdawhwhcoomdddfdfffffdfmdfeoaawweewworoefldfmleooowwowowow"
    print(countVietnameseLetter(inputString))
    print(getVietnameseLetter(inputString))
}

fun countVietnameseLetter(input: String): Int {
    val pattern = Pattern.compile("aw|aa|dd|ee|oo|ow|uw|w")
    val matcher = pattern.matcher(input)
    var count = 0
    while (matcher.find()) {
        count++
    }
    return count
}

fun getVietnameseLetter(input: String): ArrayList<String> {
    val pattern = Pattern.compile("aw|aa|dd|ee|oo|ow|uw|w")
    val matcher = pattern.matcher(input)
    val list = arrayListOf<String>()
    while (matcher.find()) {
        list.add(matcher.group())
    }
    return list
}