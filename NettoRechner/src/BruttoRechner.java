import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BruttoRechner extends Application {
	private TextField tfNetto;
	private TextField tfBrutto;
	private ComboBox<String> cbUmsatzsteuer;
	private String[] items = { "19 %", "16 %", "7 %" };
	private int[] values = { 19, 16, 7 };
	public static void main(String[] args) {
	launch(args);
	}
	@Override
	public void start(Stage stage) {
	AnchorPane anchorPane = new AnchorPane();
	GridPane gridPane = new GridPane();
	tfNetto = new TextField();
	tfNetto.setOnMousePressed(event -> tfBrutto.setText(""));
	cbUmsatzsteuer = new ComboBox<>();
	cbUmsatzsteuer.getItems().addAll(items);
	cbUmsatzsteuer.getSelectionModel().select(0);
	cbUmsatzsteuer.setOnMousePressed(event -> tfBrutto.setText(""));
	tfBrutto = new TextField();
	tfBrutto.setEditable(false);
	tfBrutto.setId("brutto");
	Button button = new Button();
	button.setText("Berechnen");
	button.setOnAction(event -> compute());
	gridPane.setHgap(20);
	gridPane.setVgap(20);
	gridPane.add(new Label("Netto"), 0, 0);
	gridPane.add(new Label("Umsatzsteuer"), 0, 1);
	gridPane.add(new Label("Brutto"), 0, 2);
	gridPane.add(tfNetto, 1, 0);
	gridPane.add(cbUmsatzsteuer, 1, 1);
	gridPane.add(tfBrutto, 1, 2);
	gridPane.add(button, 1, 3);
	anchorPane.getChildren().add(gridPane);
	anchorPane.setPrefWidth(400);
	anchorPane.setPrefHeight(250);
	AnchorPane.setLeftAnchor(gridPane, 30.);
	AnchorPane.setTopAnchor(gridPane, 30.);
	Scene scene = new Scene(anchorPane);
	scene.getStylesheets().add(getClass()
	.getResource("BruttoRechner.css").toExternalForm());11.2 Fallbeispiel Brutto-Rechner 395
	stage.setScene(scene);
	stage.setTitle("Brutto-Rechner");
	stage.show();
	}
	private void compute() {
	String input = tfNetto.getText().toString().trim();
	input = input.replace(",", ".");
	double netto;
	try {
	netto = Double.parseDouble(input);
	} catch (NumberFormatException e) {
	tfNetto.setText("");
	tfNetto.requestFocus();
	return;
	}
	int idx = cbUmsatzsteuer.getSelectionModel().getSelectedIndex();
	int value = values[idx];
	double brutto = netto * (1 + value / 100.);
	tfBrutto.setText(String.format("%.2f", brutto));
	}
}
