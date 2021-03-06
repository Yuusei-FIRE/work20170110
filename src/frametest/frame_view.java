package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class frame_view extends Frame implements ActionListener,WindowListener
{
	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private Button button1 = new Button("足し算");
	private TextField text3 = new TextField("", 10);
	private TextField text4 = new TextField("", 10);
	private TextField text5 = new TextField("", 10);
	private TextField text6 = new TextField("", 10);
	



	public frame_view(){
		addWindowListener(this);
		setTitle("Frametest");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
        add(button1);
        add(new Label("足し算"));
        add(text3);
        add(new Label("引き算"));
        add(text4);
        add(new Label("かけ算"));
        add(text5);
        add(new Label("割り算"));
        add(text6);
        
        button1.addActionListener(this);
        

	}
	
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//ボタンを押したときに呼び出されるのでここに入れておく
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1, val2);
		text3.setText(String.valueOf(clib.getPlus()));
		text4.setText(String.valueOf(clib.getMinus()));
		text5.setText(String.valueOf(clib.getProduct()));
		text6.setText(String.valueOf(clib.getDivide()));
	    
	}

}
