package nl.exa.carStatsViewer.objects

import nl.exa.carStatsViewer.plot.objects.PlotLineItem
import nl.exa.carStatsViewer.plot.enums.PlotLineMarkerType
import nl.exa.carStatsViewer.plot.objects.PlotMarker
import java.util.*

data class TripData(
    var appVersion: String,
    var tripStartDate: Date,
    var traveledDistance: Float,
    var usedEnergy: Float,
    var averageConsumption: Float,
    var travelTimeMillis: Long,
    var lastPlotDistance: Float,
    var lastPlotEnergy: Float,
    var lastPlotTime: Long,
    var lastPlotGear: Int,
    var lastPlotMarker: PlotLineMarkerType?,
    var lastChargePower:Float,
    var consumptionPlotLine: List<PlotLineItem>,
    var chargeCurves: List<ChargeCurve>,
    var markers: List<PlotMarker>
) {

}
