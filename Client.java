package cn.edu.usst.freedom;
import java.io.Serializable;
	/**
	 * ��ʾ�ͻ��˺ͷ�����֮�䴫���ָ������
	 *
	 */
	public class Client implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Object user;//��������
		private String result;//���ؽ��
		private boolean flag;//�����Ƿ�ɹ�
		private String cmd;//����ָ��
		public CommandTransfer() {
			super();
		}
		public Object getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public boolean isFlag() {
			return flag;
		}
		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		public String getCmd() {
			return cmd;
		}
		public void setCmd(String cmd) {
			this.cmd = cmd;
		}
		
	}

}
