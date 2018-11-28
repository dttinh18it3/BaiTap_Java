package BT;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class BT1 extends JFrame
	
	{
		JLabel lblSoN;
		JTextField tfSoN;
		JLabel lblKQ;
		JTextField tfKQ;
		JButton btnGT;
		public void GiaiThua() {
			lblSoN = new JLabel("Số N");
			tfSoN  = new JTextField(10);
			lblKQ  = new JLabel("Kết Quả");
			tfKQ   = new JTextField(10);
			btnGT  = new JButton("Giai Thừa");
			btnGT.addActionListener(new ActionListener() {
			
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				//code tính giai thừa
					//Lấy dữ liệu và đổi sang kiểu số
					String so = tfSoN.getText();
					int n = Integer.parseInt(so);
					//tính
					int gt=1;
					for(int i=2;i<=n;i++) gt=gt*i;
					//Đổi lại kiểu chuỗi
					tfKQ.setText(String.valueOf(gt));
				}
			});
			//TẠo container để chứa các đối tượng trên
			Container cont = this.getContentPane();
			setSize(500,400);
			setLayout(new FlowLayout());
			cont.add(lblSoN);
			cont.add(tfSoN);
			cont.add(lblKQ);
			cont.add(tfKQ);
			cont.add(btnGT);
			setVisible(true);
		}

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new BT1();
	}

}
