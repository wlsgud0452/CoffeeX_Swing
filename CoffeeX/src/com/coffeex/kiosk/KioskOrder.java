package com.coffeex.kiosk;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.coffeex.dto.MenuViewDto;
import com.coffeex.kioskdao.KioskViewMenuDao;
import com.coffeex.util.DBConnect;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JTextField;
import java.awt.Color;

public class KioskOrder extends JPanel {
	
	private ArrayList<String> phone=new ArrayList<String>();
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	public static String selectedname;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JPanel panelPoint;
	private JTextField tfPhone;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblStep;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblStep_1;
	private JLabel lblKey1;
	private JLabel lblKey2;
	private JLabel lblKey3;
	private JLabel lblKey6;
	private JLabel lblKey5;
	private JLabel lblKey4;
	private JLabel lblKey7;
	private JLabel lblKey8;
	private JLabel lblKey9;
	private JLabel lblKeyDelete;
	private JLabel lblKey0;
	private JLabel lblKeyInsert;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;

	/**
	 * Create the panel.
	 */
	public KioskOrder() {
		setLayout(null);
		add(getScrollPane_1());
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_1_1());
		add(getLblNewLabel_1_1_1());
		add(getLblNewLabel_1_2());
		add(getLblStep());
		add(getLblNewLabel_1_1_2());
		add(getLblNewLabel_1_3());
		add(getLblStep_1());
		add(getPanelPoint());
		panelPoint.setVisible(false);
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 44, 250, 261);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}

	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
		}
		Inner_Table.setModel(Outer_Table);
		return Inner_Table;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Step1: 포장 선택");
			lblNewLabel.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 16));
			lblNewLabel.setBounds(250, 44, 176, 27);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("포장");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(250, 72, 88, 58);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("매장 식사");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 20));
			lblNewLabel_1_1.setBounds(338, 72, 88, 58);
		}
		return lblNewLabel_1_1;
	}

	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("적립안함");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 20));
			lblNewLabel_1_1_1.setBounds(338, 159, 88, 58);
		}
		return lblNewLabel_1_1_1;
	}

	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("적립");
			lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					panelPoint.setVisible(true);
				}
			});
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 20));
			lblNewLabel_1_2.setBounds(250, 159, 88, 58);
		}
		return lblNewLabel_1_2;
	}

	private JLabel getLblStep() {
		if (lblStep == null) {
			lblStep = new JLabel("Step2: 포인트 적립 선택");
			lblStep.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 16));
			lblStep.setBounds(250, 131, 176, 27);
		}
		return lblStep;
	}

	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("카드");
			lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_2.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 20));
			lblNewLabel_1_1_2.setBounds(338, 247, 88, 58);
		}
		return lblNewLabel_1_1_2;
	}

	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("포인트");
			lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_3.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 20));
			lblNewLabel_1_3.setBounds(250, 247, 88, 58);
		}
		return lblNewLabel_1_3;
	}

	private JLabel getLblStep_1() {
		if (lblStep_1 == null) {
			lblStep_1 = new JLabel("Step3: 결제 방식 선택");
			lblStep_1.setFont(new Font("한컴 말랑말랑 Regular", Font.PLAIN, 16));
			lblStep_1.setBounds(250, 219, 176, 27);
		}
		return lblStep_1;
	}

	private JPanel getPanelPoint() {
		if (panelPoint == null) {
			panelPoint = new JPanel();
			panelPoint.setBackground(new Color(255, 128, 0));
			panelPoint.setBounds(0, 315, 250, 120);
			panelPoint.setLayout(null);
			panelPoint.add(getTfPhone());
			panelPoint.add(getLblKey1());
			panelPoint.add(getLblKey2());
			panelPoint.add(getLblKey3());
			panelPoint.add(getLblKey6());
			panelPoint.add(getLblKey5());
			panelPoint.add(getLblKey4());
			panelPoint.add(getLblKey7());
			panelPoint.add(getLblKey8());
			panelPoint.add(getLblKey9());
			panelPoint.add(getLblKeyDelete());
			panelPoint.add(getLblKey0());
			panelPoint.add(getLblKeyInsert());
			panelPoint.add(getLblNewLabel_3());
			panelPoint.add(getLblNewLabel_2());
		}
		return panelPoint;
	}

	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setEditable(false);
			tfPhone.setBounds(12, 35, 97, 21);
			tfPhone.setColumns(10);
		}
		return tfPhone;
	}

	private JLabel getLblKey1() {
		if (lblKey1 == null) {
			lblKey1 = new JLabel("1");
			lblKey1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("1");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey1.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey1.setBounds(108, 0, 47, 30);
		}
		return lblKey1;
	}

	private JLabel getLblKey2() {
		if (lblKey2 == null) {
			lblKey2 = new JLabel("2");
			lblKey2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("2");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey2.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey2.setBounds(156, 0, 47, 30);
		}
		return lblKey2;
	}

	private JLabel getLblKey3() {
		if (lblKey3 == null) {
			lblKey3 = new JLabel("3");
			lblKey3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("3");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey3.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey3.setBounds(203, 0, 47, 30);
		}
		return lblKey3;
	}

	private JLabel getLblKey6() {
		if (lblKey6 == null) {
			lblKey6 = new JLabel("6");
			lblKey6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("6");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey6.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey6.setBounds(203, 30, 47, 30);
		}
		return lblKey6;
	}

	private JLabel getLblKey5() {
		if (lblKey5 == null) {
			lblKey5 = new JLabel("5");
			lblKey5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("5");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey5.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey5.setBounds(156, 30, 47, 30);
		}
		return lblKey5;
	}

	private JLabel getLblKey4() {
		if (lblKey4 == null) {
			lblKey4 = new JLabel("4");
			lblKey4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("4");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey4.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey4.setBounds(108, 30, 47, 30);
		}
		return lblKey4;
	}

	private JLabel getLblKey7() {
		if (lblKey7 == null) {
			lblKey7 = new JLabel("7");
			lblKey7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("7");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey7.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey7.setBounds(108, 60, 47, 30);
		}
		return lblKey7;
	}

	private JLabel getLblKey8() {
		if (lblKey8 == null) {
			lblKey8 = new JLabel("8");
			lblKey8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("8");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey8.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey8.setBounds(156, 60, 47, 30);
		}
		return lblKey8;
	}

	private JLabel getLblKey9() {
		if (lblKey9 == null) {
			lblKey9 = new JLabel("9");
			lblKey9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("9");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey9.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey9.setBounds(203, 60, 47, 30);
		}
		return lblKey9;
	}

	private JLabel getLblKeyDelete() {
		if (lblKeyDelete == null) {
			lblKeyDelete = new JLabel("지움");
			lblKeyDelete.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (tfPhone.getText().length()>0) {
						phone.remove(phone.size()-1);
						tfPhone.setText(ArrtoString(phone));
					}
				}
			});
			lblKeyDelete.setHorizontalAlignment(SwingConstants.CENTER);
			lblKeyDelete.setBounds(108, 90, 47, 30);
		}
		return lblKeyDelete;
	}

	private JLabel getLblKey0() {
		if (lblKey0 == null) {
			lblKey0 = new JLabel("0");
			lblKey0.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					phone.add("0");
					tfPhone.setText(ArrtoString(phone));
				}
			});
			lblKey0.setHorizontalAlignment(SwingConstants.CENTER);
			lblKey0.setBounds(156, 90, 47, 30);
		}
		return lblKey0;
	}

	private JLabel getLblKeyInsert() {
		if (lblKeyInsert == null) {
			lblKeyInsert = new JLabel("입력");
			lblKeyInsert.setHorizontalAlignment(SwingConstants.CENTER);
			lblKeyInsert.setBounds(203, 90, 47, 30);
		}
		return lblKeyInsert;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전화번호");
			lblNewLabel_3.setBounds(12, 8, 50, 15);
		}
		return lblNewLabel_3;
	}
	
	private String ArrtoString(ArrayList<String> arr) {
		String str="";
		for (int i=0;i<arr.size();i++) {
			str=str+arr.get(i);
		}
		return str;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("초기화");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfPhone.setText(null);
					phone=new ArrayList<String>();
				}
			});
			lblNewLabel_2.setBounds(70, 90, 39, 30);
		}
		return lblNewLabel_2;
	}
}