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
	private JLabel imageLabel;
	
	public GUIPanel2(GUIController baseController, GUIPanel basePanel)
	{
		this.baseController = baseController;
		this.basePanel = basePanel;
		baseLayout = new SpringLayout();
		backButton = new JButton("Back to other panel");
		imageLabel = new JLabel(new ImageIcon(getClass().getResource("images/doge_BlueRed.png")));

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(backButton);
		this.add(imageLabel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, backButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, backButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, imageLabel, 6, SpringLayout.SOUTH, backButton);
		baseLayout.putConstraint(SpringLayout.WEST, imageLabel, 66, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, imageLabel, 268, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, imageLabel, -74, SpringLayout.EAST, this);
		
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
