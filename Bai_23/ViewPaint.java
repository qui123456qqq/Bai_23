package Bai_23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ViewPaint extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton red_Btn, black_Btn, white_Btn, clear_Btn;
	JPanel panel_Function, panel_Clear;
	ButtonGroup colorGroup,shapeGruop;
	JToolBar toolbar;
	ModelPaint panel_Paint;
	JMenuBar menuBar;
	JMenu menuFile, menuShape;
	JMenuItem lineItem, circleItem, rectangleItem, exitItem;

	public ViewPaint() {
		this.setTitle("Using Mouse Paint");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		init();
		this.setVisible(true);
	}

	private void init() {
		this.setLayout(new BorderLayout());

		/*
		 * Menu Bar
		 */
		menuBar = new JMenuBar();
		menuFile = new JMenu("File");
		menuShape = new JMenu("Shape");
		lineItem = new JMenuItem("Line");
		circleItem = new JMenuItem("Circle");
		rectangleItem = new JMenuItem("Rectangle");
		exitItem = new JMenuItem("Exit");

		menuFile.add(exitItem);
		menuShape.add(lineItem);
		menuSha7rdd 
		
		
		
		/*
		 * create shape buttons
		 */

		colorGroup = new ButtonGroup();
		red_Btn = new JButton("Red");
		black_Btn = new JButton("Black");
		white_Btn = new JButton("White");
		colorGroup.add(black_Btn);
		colorGroup.add(red_Btn);
		colorGroup.add(white_Btn);
		/*
		 * Panel function
		 */

		panel_Function = new JPanel();
		panel_Function.setLayout(new FlowLayout());
		panel_Function.setBackground(Color.PINK);
		panel_Function.add(black_Btn);
		panel_Function.add(red_Btn);
		panel_Function.add(white_Btn);
		this.add(panel_Function, BorderLayout.NORTH);
		/*
		 * panel clear
		 */
		clear_Btn = new JButton("Clear all");
		panel_Clear = new JPanel();
		panel_Clear.setBackground(Color.pink);
		panel_Clear.add(clear_Btn);
		this.add(panel_Clear, BorderLayout.WEST);
		/*
		 * Panel paint
		 */
		panel_Paint = new ModelPaint();
		panel_Paint.setBackground(Color.YELLOW);
		this.add(panel_Paint, BorderLayout.CENTER);
		black_Btn.setFocusable(false);
		red_Btn.setFocusable(false);
		white_Btn.setFocusable(false);
		clear_Btn.setFocusable(false);

	}

}
