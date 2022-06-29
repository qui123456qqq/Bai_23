package Bai_23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControllerPaint implements ActionListener, KeyListener {
	ViewPaint viewPaint;
	static String black_String = "", red_String = "", white_String = "", circle_String = "", rectangle_String = "",
			clear_String = "", line_String = "";
	public static int size = 20;

	public ControllerPaint(ViewPaint viewPaint) {
		this.viewPaint = viewPaint;
		viewPaint.black_Btn.addActionListener(this);
		viewPaint.red_Btn.addActionListener(this);
		viewPaint.white_Btn.addActionListener(this);
		viewPaint.circleItem.addActionListener(this);
		viewPaint.rectangleItem.addActionListener(this);
		viewPaint.lineItem.addActionListener(this);
		viewPaint.clear_Btn.addActionListener(this);
		viewPaint.exitItem.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == viewPaint.black_Btn && viewPaint.black_Btn.isSelected()) {
			black_String = "Black";
			red_String = "";
			white_String = "";
		}
		if (e.getSource() == viewPaint.red_Btn && viewPaint.red_Btn.isSelected()) {
			black_String = "";
			red_String = "Red";
			white_String = "";
		}
		if (e.getSource() == viewPaint.white_Btn && viewPaint.white_Btn.isSelected()) {
			black_String = "";
			red_String = "";
			white_String = "White";
		}
		if (e.getSource() == viewPaint.rectangleItem) {
			rectangle_String = "Rectangle";
			circle_String = "";
			line_String = "";
		}
		if (e.getSource() == viewPaint.circleItem) {
			rectangle_String = "";
			circle_String = "Circle";
			line_String = "";
		}
		if (e.getSource() == viewPaint.lineItem) {
			rectangle_String = "";
			circle_String = "";
			line_String = "Line";
		}
		if (e.getSource() == viewPaint.clear_Btn) {
			this.viewPaint.panel_Paint.clear();
		}
		if (e.getSource() == viewPaint.exitItem) {
			System.exit(1);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_C) {
			this.viewPaint.panel_Paint.clear();
		} else if (e.isControlDown()) {
			this.viewPaint.circleItem.setSelected(true);
			circle_String = "Circle";
			line_String = "";
			rectangle_String = "";
		} else if (e.isAltDown()) {
			this.viewPaint.rectangleItem.setSelected(true);
			rectangle_String = "Rectangle";
			circle_String = "";
			line_String = "";

		} else if (e.isShiftDown()) {
			line_String = "Line";
			circle_String = "";
			rectangle_String = "";
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
