package client.common.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import client.MainClientGUI;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import message_info.Message;
import message_info.MessageType;

public class MarketingAgentVehicleAddController extends AbstractController{
	
	public static MarketingAgentVehicleAddController instance;
	
    @FXML
    private Button menu_btn;

    @FXML
    private Button notification_btn;

    @FXML
    private Button customers_btn;

    @FXML
    private Button sales_btn;

    @FXML
    private Button logout_btn;

    @FXML
    private Button logout_btn1;

    @FXML
    private Label customer_name_label;

    @FXML
    private Button update_btn;

    @FXML
    private Button back_btn;

    @FXML
    private Button main_btn;

    @FXML
    private Button customers_info_btn;

    @FXML
    private Button vehicle_info_btn;

    @FXML
    private Button update_purchase_pattern_btn;

    @FXML
    private Button add_membership_btn;

    @FXML
    void add_membership_btn_clicked(MouseEvent event) {

    }

    @FXML
    void back_btn_clicked(MouseEvent event) {
    	switchScenes("/client/boundry/MarketingAgentVehicleMainForm.fxml", "/client/boundry/MarketingAgentMainCustomer.css");
    }

    @FXML
    void customers_btn_clicked(MouseEvent event) {

    }

    @FXML
    void customers_info_btn_clicked(MouseEvent event) {

    }

    @FXML
    void logout_btn_clicked(MouseEvent event) {
		String quary = "UPDATE users SET connection_status = 0 WHERE userID = " + MainClientGUI.getUserID();
		Message message = new Message(MessageType.LOGOUT, "MarketingAgentVehicleAddController_logout_clicked", quary);
		MainClientGUI.client.handleMessageFromClientUI(message);
    }

    @FXML
    void main_btn_clicked(MouseEvent event) {
    	switchScenes("/client/boundry/MarketingAgentMainCustomerForm.fxml", "/client/boundry/MarketingAgentMainCustomer.css");
    }

    @FXML
    void menu_btn_clicked(MouseEvent event) {
    	
    }

    @FXML
    void notification_btn_clicked(MouseEvent event) {

    }

    @FXML
    void sales_btn_clicked(MouseEvent event) {

    }

    @FXML
    void update_btn_clicked(MouseEvent event) {

    }

    @FXML
    void update_purchase_pattern_btn_clicked(MouseEvent event) {

    }

    @FXML
    void vehicle_info_btn_clicked(MouseEvent event) {
    	switchScenes("/client/boundry/MarketingAgentVehicleMainForm.fxml", "/client/boundry/MarketingAgentMainCustomer.css");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		instance = this;
		
	}
	public void return_logout_success() {
		MainClientGUI.loggedIn = false;
		switchScenes("/client/boundry/LoginForm.fxml", "/client/boundry/MainCss.css");
	}
}
