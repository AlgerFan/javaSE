package cn.algerfan.student;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class AppStudent extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JTextField sexField;
	private JTextField ageField;
	private JTextField stunoField;
	private JTable table;
	private DefaultTableModel model;
	private String[] columns = { "姓名", "性别", "年龄", "学号" };
	private List<Student> studentList = new ArrayList<>();
	private Student tmp;

	// 姓名，性别，年龄，学号
	public AppStudent() {
		getContentPane().setLayout(null);
		//姓名
		JLabel lblName = new JLabel("姓名");
		lblName.setBounds(80, 10, 100, 30);
		lblName.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(lblName);
		nameField = new JTextField();
		nameField.setBounds(130, 10, 200, 30);
		getContentPane().add(nameField);
		nameField.setColumns(10);
		//性别
		JLabel lblSex = new JLabel("性别");
		lblSex.setBounds(470, 10, 100, 30);
		lblSex.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(lblSex);
		sexField = new JTextField();
		sexField.setBounds(520, 10, 200, 30);
		getContentPane().add(sexField);
		sexField.setColumns(10);
		//年龄
		JLabel lblAge = new JLabel("年龄");
		lblAge.setBounds(80, 50, 100, 30);
		lblAge.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(lblAge);
		ageField = new JTextField();
		ageField.setBounds(130, 50, 200, 30);
		getContentPane().add(ageField);
		ageField.setColumns(10);
		//学号
		JLabel lblStuno = new JLabel("学号");
		lblStuno.setBounds(470, 50, 100, 30);
		lblStuno.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(lblStuno);
		stunoField = new JTextField();
		stunoField.setColumns(10);
		stunoField.setBounds(520, 50, 200, 30);
		getContentPane().add(stunoField);
		
		JButton btnAdd = new JButton("添加");
		//监听添加按钮
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add();
			}
		});
		btnAdd.setBounds(50, 100, 100, 31);
		btnAdd.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(btnAdd);
		
		JButton btnDel = new JButton("删除");
		//监听删除按钮
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				del();
			}
		});
		btnDel.setBounds(194, 100, 100, 31);
		btnDel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(btnDel);
		
		JButton btnUpdate = new JButton("选中更新");
		//监听更新按钮
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		btnUpdate.setBounds(338, 100, 120, 31);
		btnUpdate.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(btnUpdate);
		
		JButton btnFind = new JButton("查找");
		//监听查找按钮
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				find();
			}
		});
		btnFind.setBounds(505, 100, 100, 31);
		btnFind.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(btnFind);
		
		JButton btnFindAll = new JButton("查找全部");
		//监听查找按钮
		btnFindAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findAll();
			}
		});
		btnFindAll.setBounds(650, 100, 100, 31);
		btnFindAll.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		getContentPane().add(btnFindAll);
		
		//学生列表
		model = new DefaultTableModel(columns, 0);
		table = new JTable(model);
		JTableHeader head = table.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
        head.setFont(new Font("微软雅黑", Font.PLAIN, 16));// 设置表格字体
        table.setRowHeight(30);// 设置表格行宽
        table.setFont(new Font("微软雅黑", Font.PLAIN, 16));//设置表格字体
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER);   
		table.setDefaultRenderer(Object.class, r);//设置字体居中
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				nameField.setText((String) table.getValueAt(row, 0));
				sexField.setText((String) table.getValueAt(row, 1));
				ageField.setText((String) table.getValueAt(row, 2));
				stunoField.setText((String) table.getValueAt(row, 3));
				tmp = getInput();
			}
		});
		//布局
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 150, 790, 425);
		getContentPane().add(scrollPane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(820, 620);
		setTitle("学生管理系统");
		setResizable(false);
		setVisible(true);
		//读取学生列表
		try {
			new MyIO().reader(studentList);
		} catch (NumberFormatException | IOException e1) {
			e1.printStackTrace();
		}
		showTable();
	}

	private Student getInput() {
		Student stu = new Student();
		stu.name = nameField.getText();
		stu.sex = sexField.getText();
		stu.age = ageField.getText();
		stu.stuno = stunoField.getText();
		return stu;
	}

	private void add() {
		studentList.add(getInput());
		try {
			new MyIO().writer(studentList);
		} catch (NumberFormatException | IOException e1) {
			e1.printStackTrace();
		}
		showTable();
	}

	private void del() {
		for (int i = 0; i < studentList.size(); i++) {
			if (tmp.equals(studentList.get(i))) {
				studentList.remove(i);
				break;
			}
		}
		try {
			new MyIO().writer(studentList);
		} catch (NumberFormatException | IOException e1) {
			e1.printStackTrace();
		}
		showTable();
	}

	private void update() {
		Student stu = getInput();
		for (int i = 0; i < studentList.size(); i++) {
			if (tmp.equals(studentList.get(i))) {
				studentList.remove(i);
				studentList.add(i, stu);
				break;
			}
		}
		try {
			new MyIO().writer(studentList);
		} catch (NumberFormatException | IOException e1) {
			e1.printStackTrace();
		}
		showTable();
	}

	private void find() {
		removeRows();
		Student stu = getInput();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getStuno().equals(stu.getStuno())) {
				model.addRow(studentList.get(i).toArray());
			}
		}
	}
	
	private void findAll() {
		removeRows();
		for (int i = 0; i < studentList.size(); i++) {
			model.addRow(studentList.get(i).toArray());
		}
	}

	private void showTable() {
		removeRows();
		for (int i = 0; i < studentList.size(); i++) {
			Student stu = (Student) studentList.get(i);
			model.addRow(stu.toArray());
		}
		System.out.println(studentList);
	}

	private void removeRows() {
		while (model.getRowCount() > 0) {
			model.removeRow(0);
		}
	}

	public static void main(String[] args) {
		new AppStudent();
	}
}
