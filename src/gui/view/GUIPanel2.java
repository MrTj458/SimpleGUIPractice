package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPanel2 extends JPanel
{
	private GUIController baseController;
	private SpringLayout baseLayout;
	private GUIPanel basePanel;
	private JButton backButton;
	
	public GUIPanel2(GUIController baseController, GUIPanel basePanel)
	{
		this.baseController = baseController;
		this.basePanel = basePanel;
		baseLayout = new SpringLayout();
		backButton = new JButton("Back to other panel");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(backButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, backButton, 121, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, backButton, -158, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		backButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.changePanel(basePanel);
			}
		});
	}
}
