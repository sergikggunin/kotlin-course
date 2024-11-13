package org.example.lesson21

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(element: String): List<String> {
        return element.split(" ")
    }
}