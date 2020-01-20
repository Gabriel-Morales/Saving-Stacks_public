/**
 * The WelcomeController interacts with the Welcome View (Welcome.fxml)
 * of the application to display information about what the user can 
 * expect from the application
 * 
 * @author Waewarin Chindarassami (fik450)
 */

package application.controller;


import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import application.Main;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.SVGPath;
import javafx.util.Duration;

public class WelcomeController implements EventHandler<ActionEvent>, Initializable{
	
	@FXML
	private Button startButton;
	
	@FXML
	private Pane homeIcon, goalsIcon, cashIcon, settingsIcon;
	
	@FXML
	private Label welcome, name;
	
	@FXML
	private Label homeLabel, homeLine1, homeLine2;
	
	@FXML
	private Label goalsLabel, goalsLine1, goalsLine2;
	
	@FXML
	private Label cashLabel, uploadLabel, cashLine1, cashLine2, cashLine3;
	
	@FXML
	private Label settingsLabel, settingsLine1, settingsLine2;
	
	@FXML
	private ImageView logo;
	
	/**
	 * handle()
	 * 
	 * Redirects the user the the Home Page once the 
	 * "Get Started" is clicked
	 */
	@Override
	public void handle(ActionEvent arg0) 
	{	
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Home.fxml"));
			Main.settings.setValueWithBooleanProperty("welcome_shown_once", true);
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * initialize()
	 * 
	 * Initializes and displays the icons
	 * the corresponds to the bottom bar in the application
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
		//Display home icon
		SVGPath homePath = new SVGPath();
		homePath.setContent("M12 5.69l5 4.5V18h-2v-6H9v6H7v-7.81l5-4.5M12 3L2 12h3v8h6v-6h2v6h6v-8h3L12 3z");
		homeIcon.getChildren().add(homePath);
		
		//Display goals icon
		SVGPath goalPath = new SVGPath();
		goalPath.setContent("M11.57 13.16c-1.36.28-2.17 1.16-2.17 2.41 0 1.34 1.11 2.42 2.49 2.42 2.05 0 3.71-1.66 3.71-3.71 0-1.07-.15-2.12-.46-3.12-.79 1.07-2.2 1.72-3.57 2zM13.5.67s.74 2.65.74 4.8c0 2.06-1.35 3.73-3.41 3.73-2.07 0-3.63-1.67-3.63-3.73l.03-.36C5.21 7.51 4 10.62 4 14c0 4.42 3.58 8 8 8s8-3.58 8-8C20 8.61 17.41 3.8 13.5.67zM12 20c-3.31 0-6-2.69-6-6 0-1.53.3-3.04.86-4.43 1.01 1.01 2.41 1.63 3.97 1.63 2.66 0 4.75-1.83 5.28-4.43C17.34 8.97 18 11.44 18 14c0 3.31-2.69 6-6 6z");
		goalsIcon.getChildren().add(goalPath);

		//Display cash icon
		SVGPath cashPath = new SVGPath();
		cashPath.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm.31-8.86c-1.77-.45-2.34-.94-2.34-1.67 0-.84.79-1.43 2.1-1.43 1.38 0 1.9.66 1.94 1.64h1.71c-.05-1.34-.87-2.57-2.49-2.97V5H10.9v1.69c-1.51.32-2.72 1.3-2.72 2.81 0 1.79 1.49 2.69 3.66 3.21 1.95.46 2.34 1.15 2.34 1.87 0 .53-.39 1.39-2.1 1.39-1.6 0-2.23-.72-2.32-1.64H8.04c.1 1.7 1.36 2.66 2.86 2.97V19h2.34v-1.67c1.52-.29 2.72-1.16 2.73-2.77-.01-2.2-1.9-2.96-3.66-3.42z");
		cashIcon.getChildren().add(cashPath);
		
		//Display settings icon
		SVGPath settingPath = new SVGPath();
		settingPath.setContent("M19.43 12.98c.04-.32.07-.64.07-.98 0-.34-.03-.66-.07-.98l2.11-1.65c.19-.15.24-.42.12-.64l-2-3.46c-.09-.16-.26-.25-.44-.25-.06 0-.12.01-.17.03l-2.49 1c-.52-.4-1.08-.73-1.69-.98l-.38-2.65C14.46 2.18 14.25 2 14 2h-4c-.25 0-.46.18-.49.42l-.38 2.65c-.61.25-1.17.59-1.69.98l-2.49-1c-.06-.02-.12-.03-.18-.03-.17 0-.34.09-.43.25l-2 3.46c-.13.22-.07.49.12.64l2.11 1.65c-.04.32-.07.65-.07.98 0 .33.03.66.07.98l-2.11 1.65c-.19.15-.24.42-.12.64l2 3.46c.09.16.26.25.44.25.06 0 .12-.01.17-.03l2.49-1c.52.4 1.08.73 1.69.98l.38 2.65c.03.24.24.42.49.42h4c.25 0 .46-.18.49-.42l.38-2.65c.61-.25 1.17-.59 1.69-.98l2.49 1c.06.02.12.03.18.03.17 0 .34-.09.43-.25l2-3.46c.12-.22.07-.49-.12-.64l-2.11-1.65zm-1.98-1.71c.04.31.05.52.05.73 0 .21-.02.43-.05.73l-.14 1.13.89.7 1.08.84-.7 1.21-1.27-.51-1.04-.42-.9.68c-.43.32-.84.56-1.25.73l-1.06.43-.16 1.13-.2 1.35h-1.4l-.19-1.35-.16-1.13-1.06-.43c-.43-.18-.83-.41-1.23-.71l-.91-.7-1.06.43-1.27.51-.7-1.21 1.08-.84.89-.7-.14-1.13c-.03-.31-.05-.54-.05-.74s.02-.43.05-.73l.14-1.13-.89-.7-1.08-.84.7-1.21 1.27.51 1.04.42.9-.68c.43-.32.84-.56 1.25-.73l1.06-.43.16-1.13.2-1.35h1.39l.19 1.35.16 1.13 1.06.43c.43.18.83.41 1.23.71l.91.7 1.06-.43 1.27-.51.7 1.21-1.07.85-.89.7.14 1.13zM12 8c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z");
		settingsIcon.getChildren().add(settingPath);
		
		//Change the scale of the icons
		ObservableList<SVGPath> paths = FXCollections.observableList(Arrays.asList(homePath, cashPath, goalPath, settingPath));
		
		for(SVGPath path: paths)
		{
			path.setScaleX(2.3);
			path.setScaleY(2.3);
		}
		
		//Add parallel fade transition
		FadeTransition welcomeFT = new FadeTransition(Duration.millis(2000), welcome);
		welcomeFT.setFromValue(0.0);
		welcomeFT.setToValue(1.0);
		
		FadeTransition nameFT = new FadeTransition(Duration.millis(2000), name);
		nameFT.setFromValue(0.0);
		nameFT.setToValue(1.0);
		
		FadeTransition logoFT = new FadeTransition(Duration.millis(2000), logo);
		logoFT.setFromValue(0.0);
		logoFT.setToValue(1.0);
		
		FadeTransition homeIconFT = new FadeTransition(Duration.millis(2000), homeIcon);
		homeIconFT.setFromValue(0.0);
		homeIconFT.setToValue(1.0);
		
		FadeTransition homeLabelFT = new FadeTransition(Duration.millis(2000), homeLabel);
		homeLabelFT.setFromValue(0.0);
		homeLabelFT.setToValue(1.0);
		
		FadeTransition homeLine1FT = new FadeTransition(Duration.millis(2000), homeLine1);
		homeLine1FT.setFromValue(0.0);
		homeLine1FT.setToValue(1.0);
		
		FadeTransition homeLine2FT = new FadeTransition(Duration.millis(2000), homeLine2);
		homeLine2FT.setFromValue(0.0);
		homeLine2FT.setToValue(1.0);
		
		FadeTransition goalsIconFT = new FadeTransition(Duration.millis(2000), goalsIcon);
		goalsIconFT.setFromValue(0.0);
		goalsIconFT.setToValue(1.0);
		
		FadeTransition goalsLabelFT = new FadeTransition(Duration.millis(2000), goalsLabel);
		goalsLabelFT.setFromValue(0.0);
		goalsLabelFT.setToValue(1.0);
		
		FadeTransition goalsLine1FT = new FadeTransition(Duration.millis(2000), goalsLine1);
		goalsLine1FT.setFromValue(0.0);
		goalsLine1FT.setToValue(1.0);
		
		FadeTransition goalsLine2FT = new FadeTransition(Duration.millis(2000), goalsLine2);
		goalsLine2FT.setFromValue(0.0);
		goalsLine2FT.setToValue(1.0);
		
		FadeTransition cashIconFT = new FadeTransition(Duration.millis(2000), cashIcon);
		cashIconFT.setFromValue(0.0);
		cashIconFT.setToValue(1.0);
		
		FadeTransition cashLabelFT = new FadeTransition(Duration.millis(2000), cashLabel);
		cashLabelFT.setFromValue(0.0);
		cashLabelFT.setToValue(1.0);
		
		FadeTransition uploadLabelFT = new FadeTransition(Duration.millis(2000), uploadLabel);
		uploadLabelFT.setFromValue(0.0);
		uploadLabelFT.setToValue(1.0);
		
		FadeTransition cashLine1FT = new FadeTransition(Duration.millis(2000), cashLine1);
		cashLine1FT.setFromValue(0.0);
		cashLine1FT.setToValue(1.0);
		
		FadeTransition cashLine2FT = new FadeTransition(Duration.millis(2000), cashLine2);
		cashLine2FT.setFromValue(0.0);
		cashLine2FT.setToValue(1.0);
		
		FadeTransition cashLine3FT = new FadeTransition(Duration.millis(2000), cashLine3);
		cashLine3FT.setFromValue(0.0);
		cashLine3FT.setToValue(1.0);
		
		FadeTransition settingsIconFT = new FadeTransition(Duration.millis(2000), settingsIcon);
		settingsIconFT.setFromValue(0.0);
		settingsIconFT.setToValue(1.0);
		
		FadeTransition settingsLabelFT = new FadeTransition(Duration.millis(2000), settingsLabel);
		settingsLabelFT.setFromValue(0.0);
		settingsLabelFT.setToValue(1.0);
		
		FadeTransition settingsLine1FT = new FadeTransition(Duration.millis(2000), settingsLine1);
		settingsLine1FT.setFromValue(0.0);
		settingsLine1FT.setToValue(1.0);
		
		FadeTransition settingsLine2FT = new FadeTransition(Duration.millis(2000), settingsLine2);
		settingsLine2FT.setFromValue(0.0);
		settingsLine2FT.setToValue(1.0);
		
		FadeTransition startButtonFT = new FadeTransition(Duration.millis(2000), startButton);
		startButtonFT.setFromValue(0.0);
		startButtonFT.setToValue(1.0);
		
		ParallelTransition pt1 = new ParallelTransition(welcomeFT, nameFT, logoFT, homeIconFT, homeLabelFT, homeLine1FT, homeLine2FT);
		ParallelTransition pt2 = new ParallelTransition(goalsIconFT, goalsLabelFT, goalsLine1FT, goalsLine2FT);
		ParallelTransition pt3 = new ParallelTransition(cashIconFT, cashLabelFT, uploadLabelFT, cashLine1FT, cashLine2FT, cashLine3FT);
		ParallelTransition pt4 = new ParallelTransition(settingsIconFT, settingsLabelFT, settingsLine1FT, settingsLine2FT, startButtonFT);
		ParallelTransition ptAll = new ParallelTransition(pt1, pt2, pt3, pt4);
		ptAll.play();
		
	}	
}
