package co.kenrg.snake

import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.Node
import kotlin.browser.document

class Grid(val width: Int, val height: Int, val gridContainer: Node?) {
    data class Cell(val node: HTMLDivElement, var filled: Boolean)

    val grid: List<List<Cell>>

    init {
        this.grid = this.buildGrid()
    }

    private fun buildGrid(): List<List<Cell>> {
        val cellSize = 25

        return (0..width - 1).map { x ->
            (0..height - 1).map { y ->
                val cell = document.create.div()
                cell.style.apply {
                    position = "absolute"
                    width = "${cellSize}px"
                    height = "${cellSize}px"
                    left = "${x * cellSize}px"
                    top = "${y * cellSize}px"
                    border = "1px solid #777"
                }
                gridContainer?.appendChild(cell)
                Cell(cell, false)
            }
        }
    }
}