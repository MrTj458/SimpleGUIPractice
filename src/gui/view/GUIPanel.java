package gui.view;

import javax.swing.*;

import gui.controller.GUIController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPanel extends JPanel
{
	private GUIController baseControlelr;
	private SpringLayout baseLayout;
	private JButton changeColorButton;
	private JTextField textField;
	private JButton seizureButton;

	public GUIPanel(GUIController baseController)
	{
		this.baseControlelr = baseController;
		baseLayout = new SpringLayout();
		changeColorButton = new JButton("Change Colors!");
		textField = new JTextField("Call me a name!");
		seizureButton = new JButton("Seizure Mode");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(changeColorButton);
		this.add(textField);
		this.add(seizureButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 83, SpringLayout.SOUTH, changeColorButton);
		baseLayout.putConstraint(SpringLayout.NORTH, changeColorButton, 34, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, changeColorButton, 155, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 129, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textField, 335, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, seizureButton, 161, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, seizureButton, -10, SpringLayout.SOUTH, this);
	}

	private void setupListeners()
	{
		changeColorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
		});

		textField.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent enter)
			{
				JOptionPane.showMessageDialog(textField, "No you're a " + textField.getText().toLowerCase() + "!");
				textField.setText("Call me another name!");
			}
		});

		seizureButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}

	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);

		this.setBackground(new Color(red, blue, green));
	}
}
