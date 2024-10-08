package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Teacher;

public class TeacherFormController implements Initializable {

		private Teacher entity;
		
		@FXML
		private TextField txtId;
		
		@FXML
		private TextField txtName;
		
		@FXML
		private TextField txtAdmissionDate;
		
		@FXML
		private TextField txtCpf;
		
		@FXML
		private TextField txtPhone;
		 
		@FXML
		private TextField txtSalary;
		
		@FXML
		private Label labelErrorName;
		
		@FXML
		private Label labelErrorAdmissionDate;
		
		@FXML
		private Label labelErrorCpf;
		
		@FXML
		private Label labelErrorPhone;
		
		@FXML
		private Label labelErrorSalary;
		
		@FXML
		private Button btSave;
		
		@FXML
		private Button btCancel;
		
		public void serTeacher(Teacher entity) {
			this.entity = entity;
		}
		
		@FXML
		public void onBtSaveAcrion() {
			System.out.println("onBtSaveAction");
		}
		
		@FXML
		public void onBtCancelAcrion() {
			System.out.println("onBtCancelAction");
		}		
		
	@Override
	public void initialize(URL url, ResourceBundle rb) {		
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldDouble(txtSalary);
		Constraints.setTextFieldMaxLength(txtName, 30);		
	}	
	
	public void updateFormData() {
		if(entity == null) 
			throw new IllegalStateException("Entity was null!");		
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(String.valueOf(entity.getName()));
		txtAdmissionDate.setText(String.valueOf(entity.getAdmissionDate()));
		txtCpf.setText(String.valueOf(entity.getCpf()));
		txtPhone.setText(String.valueOf(entity.getPhone()));
		txtSalary.setText(String.valueOf(entity.getSalary()));
	}
}
