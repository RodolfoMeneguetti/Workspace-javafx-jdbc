package GUI;

import java.net.URL;
import java.util.ResourceBundle;

import GUI.Util.Constraints;
import Model.Entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

	
	private Department entity;
	
	@FXML
	private TextField txtid;
	
	@FXML
	private TextField txtname; 
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBtSaveAction");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtCancelAction");
	}
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initilizeNodes();
	}
	
	private void initilizeNodes() {
		Constraints.setTextFieldInteger(txtid);
		Constraints.setTextFieldMaxLength(txtname, 30);
	}
	

	public void updateFormData() {
		if(entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		
		txtid.setText(String.valueOf(entity.getId()));
		txtname.setText(entity.getName());
	}
	
}
