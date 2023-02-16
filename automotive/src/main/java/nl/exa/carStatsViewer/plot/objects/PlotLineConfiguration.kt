package nl.exa.carStatsViewer.plot.objects

import nl.exa.carStatsViewer.plot.enums.*

class PlotLineConfiguration(
    internal val Range: PlotRange,
    var LabelFormat: PlotLineLabelFormat,
    var LabelPosition: PlotLabelPosition,
    var HighlightMethod: PlotHighlightMethod,
    var Unit: String,
    var Divider: Float = 1f
)
