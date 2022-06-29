package Bai_23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ModelPaint extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	Graphics g;
	int OX, OY;
	boolean flag;

	public ModelPaint() {
		
		this.setBackground(Color.yellow);
		this.addMouseListener(this);
	}

	public void clear() {
		Graphics g1 = getGraphics();
		g1.setColor(Color.yellow);
		g1.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

	MouseMotionListener motionListener = new MouseMotionListener() {
		@Override
		public void mouseDragged(MouseEvent e) {

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (flag == true) {
				int x = e.getX();
				int y = e.getY();
				int size = (int) Math.sqrt((x - OX) * (x - OX) + (y - OY) * (y - OY));
				System.out.println(size);
				System.out.println(x + " " + y);
				g = getGraphics();
				if (ControllerPaint.red_String.equalsIgnoreCase("Red")) {
					g.setColor(Color.RED);
					System.out.println("Red");

					if (ControllerPaint.rectangle_String.equals("Rectangle")) {
						System.out.println("Rectangle");
						g.fillRect(OX, OY, size, size);

					}
					if (ControllerPaint.circle_String.equals("Circle")) {
						System.out.println("Circle");
						g.fillOval(OX - size / 2, OY - size / 2, size, size);

					}
					if (ControllerPaint.line_String.equals("Line")) {
						System.out.println("Line");
						g.drawLine(OX, OY, x, y);

					}
				}
				if (ControllerPaint.black_String.equals("Black")) {
					g.setColor(Color.BLACK);
					System.out.println("Black");

					if (ControllerPaint.rectangle_String.equals("Rectangle")) {
						g.fillRect(OX, OY, size, size);

					}
					if (ControllerPaint.circle_String.equals("Circle")) {
						g.fillOval(OX - size / 2, OY - size / 2, size, size);

					}
					if (ControllerPaint.line_String.equals("Line")) {
						g.drawLine(OX, OY, x, y);

					}
				}
				if (ControllerPaint.white_String.equals("White")) {
					g.setColor(Color.white);
					System.out.println("White");

					if (ControllerPaint.rectangle_String.equals("Rectangle")) {
						g.fillRect(OX, OY, size, size);

					}
					if (ControllerPaint.circle_String.equals("Circle")) {
						g.fillOval(OX - size / 2, OY - size / 2, size, size);

					}
					if (ControllerPaint.line_String.equals("Line")) {
						g.drawLine(OX, OY, x, y);

					}
				}
			}

		}
	};

	@Override
	public void mouseClicked(MouseEvent e) {
		int count = e.getClickCount();
		System.out.println(count);
		OX = e.getX();
		OY = e.getY();
		if (count == 1) {
			flag = true;
			this.addMouseMotionListener(motionListener);
		} else if (count == 2) {
			flag = false;
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}