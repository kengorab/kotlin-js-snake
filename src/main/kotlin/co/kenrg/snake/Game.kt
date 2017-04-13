package co.kenrg.snake

import org.w3c.dom.Node
import kotlin.browser.window

class Game(gridNode: Node?) {
    private var intervalLoopId: Int? = null
    private val framesPerSecond = 15

    val grid = Grid(10, 10, gridNode)

    fun update() {
        // Perform some logic here
    }

    fun start() {
        intervalLoopId = window.setInterval({
            this.update()
        }, 1000 / framesPerSecond)
    }

    fun stop() {
        if (intervalLoopId != null)
            window.clearInterval(intervalLoopId!!)
        intervalLoopId = null
    }
}