package co.kenrg.snake

import kotlinx.html.dom.append
import kotlinx.html.js.div
import kotlinx.html.js.h1
import kotlinx.html.style
import org.w3c.dom.Node
import kotlin.browser.document

fun main(args: Array<String>) {
    var gridContainer: Node? = null

    document.body?.append {
        h1 { +"🐍 Snake" }
        gridContainer = div { style = "position: relative" }
    }

    val game = Game(gridContainer)
    game.start()
}