/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.geom

import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.layer.OptionsCapsule

interface SegmentAesthetics : OptionsCapsule {
    val x: Any?
    val y: Any?
    val xend: Any?
    val yend: Any?
    val alpha: Any?
    val color: Any?
    val linetype: Any?
    val size: Any?
    val speed: Any?
    val flow: Any?

    override fun seal() = Options.of(
        "x" to x,
        "y" to y,
        "xend" to xend,
        "yend" to yend,
        "alpha" to alpha,
        "color" to color,
        "linetype" to linetype,
        "size" to size,
        "speed" to speed,
        "flow" to flow
    )
}