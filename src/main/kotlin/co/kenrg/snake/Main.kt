package co.kenrg.snake

import kotlinx.html.dom.append
import kotlinx.html.js.h1
import kotlin.browser.document

fun main(args: Array<String>) {
    document.body?.append {
        h1 { +"🐍 Snake" }
    }
}