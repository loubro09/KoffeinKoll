package KoffeinKoll.View;

import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.Tile.SkinType;
import javafx.scene.layout.StackPane;

public class CircleChart extends StackPane {
    private Tile donutChartTile;

    public CircleChart() {
        // Skapa en Donut Chart Tile
        donutChartTile = new Tile();
        donutChartTile.setSkinType(SkinType.DONUT_CHART);
        donutChartTile.setTitle("Donut Chart");
        // Lägg till data för donutdiagrammet
        // Exempel:
        // donutChartTile.setChartDate(new eu.hansolo.tilesfx.chart.ChartData("Label", 50, javafx.scene.paint.Color.RED));
        donutChartTile.setChartData(new eu.hansolo.tilesfx.chart.ChartData("Label", 50, javafx.scene.paint.Color.RED));

        // Lägg till Donut Chart Tile till StackPane
        getChildren().add(donutChartTile);
    }
}
