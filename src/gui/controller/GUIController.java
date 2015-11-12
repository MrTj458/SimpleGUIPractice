package gui.controller;

import javax.swing.JPanel;
import gui.view.GUIFrame;
import gui.view.GUIPanel;
import gui.view.GUIPanel2;

public class GUIController
{
	private GUIFrame baseFrame;
	
	public GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{}
	
	public void changePanel(JPanel panel)
	{
		baseFrame.setContentPane(panel);
		baseFrame.validate();
	}
}
