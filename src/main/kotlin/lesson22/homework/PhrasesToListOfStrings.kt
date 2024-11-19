package org.example.lesson22.homework

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(item: String): List<String> = item.split(" ")
}