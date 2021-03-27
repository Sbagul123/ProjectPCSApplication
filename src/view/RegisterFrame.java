package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.*;

import controller.EmployeeController;

public class RegisterFrame extends JFrame{

	JLabel lfirstName, llastName, lEmail, lUserId, lPassword, lRole,  lGender;
	JTextField tFirstName, tLastName, tEmail, tUserId, tRole;
	JPasswordField tPassword;
	JRadioButton rMale, rFemale;
	JButton bRegister;
	Container container;
	EmployeeController empController=null;
	Connection conn=null;
	
	public RegisterFrame()
	{
		container=getContentPane();
		
		lfirstName=new JLabel("First Name : ");
		llastName=new JLabel("Last Name : ");
		lEmail=new JLabel("Email : ");
		lUserId=new JLabel("User Id : ");
		lPassword=new JLabel("Password : ");
		lRole=new JLabel("Role : ");
		
		lGender=new JLabel("Gender : ");
		rMale=new JRadioButton("Male");
		rFemale=new JRadioButton("Female");
		
		
		tFirstName=new JTextField();
		tLastName=new JTextField();
		tEmail=new JTextField();
		tUserId=new JTextField();
		tRole=new JTextField();
		tPassword=new JPasswordField();
		
		bRegister=new JButton("REGISTER");
		bRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				callDispose();
				new LoginFrame();
			}
			
		});
		
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("REGISTRATION FORM");
		this.setVisible(true);
		this.setBounds(10, 10, 500, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // fixed size frame
	}
	
	public void setLayoutManager()
	{
		container.setLayout(null);
	}
	
	public void setLocationAndSize()
	{
		lfirstName.setBounds(50, 80, 150, 50);
		tFirstName.setBounds(200, 95, 150, 30);
		
		llastName.setBounds(50, 140, 150, 50);
		tLastName.setBounds(200, 140, 150, 30);
		
		lEmail.setBounds(50, 200, 150, 50);
		tEmail.setBounds(200, 200, 150, 30);
		
		lUserId.setBounds(50, 260, 150, 50);
		tUserId.setBounds(200, 260, 150, 30);
		
		lPassword.setBounds(50, 320, 150, 50);
		tPassword.setBounds(200, 320, 150, 30);
		
		lRole.setBounds(50, 360, 150, 50);
		tRole.setBounds(200, 360, 150, 30);
		
		lGender.setBounds(50, 420, 150, 50);
		rMale.setBounds(200, 430, 60, 30);
		rFemale.setBounds(260, 430, 300, 30);
		
		bRegister.setBounds(170, 560, 100, 30);
	}
	
	public void addComponentsToContainer()
	{
		container.add(lfirstName);
		container.add(tFirstName);
		container.add(llastName);
		container.add(tLastName);
		container.add(lEmail);
		container.add(tEmail);
		container.add(lUserId);
		container.add(tUserId);
		container.add(lPassword);
		container.add(tPassword);
		container.add(lRole);
		container.add(tRole);
		container.add(lGender);
		container.add(rMale);
		container.add(rFemale);
		container.add(bRegister);
	}
	
	public void callDispose()
	{
		this.dispose();
	}
}
