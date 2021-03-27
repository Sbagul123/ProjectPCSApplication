package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.util.List;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.EmployeeController;
import model.Employee;

public class AllEmpFrame extends JFrame{

	JButton bLogin;
	Container container;
	EmployeeController empController=null;
	Connection conn=null;
	
	public AllEmpFrame()
	{
		DefaultTableModel model=new DefaultTableModel();
		container=getContentPane();
		JTable jtb1=new JTable(model);
		container.setLayout(new FlowLayout(FlowLayout.LEFT));
	
		model.addColumn("Employee Id");
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("Email");
		model.addColumn("User Id");
		model.addColumn("Password");
		model.addColumn("Gender");
		model.addColumn("Role");
		model.addColumn("Active");

		List<Employee> empList=new EmployeeController().getAllEmployees();
		for(Employee emp:empList)
		{
			model.addRow(new Object[] {emp.getEmployeeId(),emp.getFirstName(),emp.getLastName(),emp.getEmail(),emp.getUserId(),emp.getPassword(),emp.getGender(),emp.getRole(),emp.getActive()});
		}
		JScrollPane pg=new JScrollPane(jtb1);
		container.add(pg);
		
		bLogin=new JButton("BACK");
		bLogin.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				callDispose();
				new HraHomeFrame();
				
			}	
		});
		
		//setLayoutManager();
		//setLocationAndSize();
		addComponentsToContainer();
		
		this.pack();
		this.setTitle("ALL EMPLOYEE");
		this.setVisible(true);
		this.setBounds(10, 10, 500, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // fixed size frame
	}
	/*public void setLayoutManager() {
		container.setLayout(null);
	}*/
	
	/*public void setLocationAndSize() {
		bLogin.setBounds(100, 450, 100, 30);
	}*/

	public void addComponentsToContainer() {
		container.add(bLogin);
	}
	
	public void callDispose() {
		this.dispose();
	}
	
}
