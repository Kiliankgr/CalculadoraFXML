package dad.javafx.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.calculadora.model.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable{
	//model
	
	private Calculadora calc=new Calculadora();
	
	//view
	@FXML
    private GridPane view;

    @FXML
    private TextField resultadotext;

    @FXML
    private Button sieteButton;

    @FXML
    private Button ochoButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button borrarTodoButton;

    @FXML
    private Button borrarButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button multiplicarButton;

    @FXML
    private Button dividirButton;

    @FXML
    private Button igualButton;

    @FXML
    private Button unoButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button menosButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button comaButton;

    @FXML
    private Button sumaButton;
    
    public Controller() throws IOException {
    	
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXMLView.fxml"));
    		loader.setController(this);
    		loader.load();
    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	//valores
    	ceroButton.setOnAction(e-> onValorAction(e, ceroButton.getText().charAt(0)));
    	unoButton.setOnAction(e-> onValorAction(e, unoButton.getText().charAt(0)));
    	dosButton.setOnAction(e-> onValorAction(e, dosButton.getText().charAt(0)));
    	tresButton.setOnAction(e-> onValorAction(e, tresButton.getText().charAt(0)));
    	cuatroButton.setOnAction(e-> onValorAction(e, cuatroButton.getText().charAt(0)));
    	cincoButton.setOnAction(e-> onValorAction(e, cincoButton.getText().charAt(0)));
    	seisButton.setOnAction(e-> onValorAction(e, seisButton.getText().charAt(0)));
    	sieteButton.setOnAction(e-> onValorAction(e, sieteButton.getText().charAt(0)));
    	ochoButton.setOnAction(e-> onValorAction(e, ochoButton.getText().charAt(0)));
    	nueveButton.setOnAction(e-> onValorAction(e, nueveButton.getText().charAt(0)));
    	comaButton.setOnAction(e-> onValorAction(e, comaButton.getText().charAt(0)));
    	//operaciones
    	
    	sumaButton.setOnAction(e-> onOperacionAction(e, Calculadora.SUMAR));
    	menosButton.setOnAction(e-> onOperacionAction(e,  Calculadora.RESTAR));
    	multiplicarButton.setOnAction(e-> onOperacionAction(e,  Calculadora.MULTIPLICAR));
    	dividirButton.setOnAction(e-> onOperacionAction(e,  Calculadora.DIVIDIR));
    	igualButton.setOnAction(e-> onOperacionAction(e, Calculadora.IGUAL));
    	//borrados
    	borrarButton.setOnAction(e-> calc.borrar());
    	borrarTodoButton.setOnAction(e-> calc.borrarTodo());
    	//bindeos
    	resultadotext.textProperty().bind(calc.pantallaProperty());
    	
	}
	
    private void onValorAction(ActionEvent e,char valor) {
    	calc.insertar(valor);
	}
	private void onOperacionAction(ActionEvent e, char operando) {
		calc.operar(operando);
		
	}
	public GridPane getRoot() {
		return view;
	}
	
	
}