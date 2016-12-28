package cn.edu.usst.freedom;
import java.io.Serializable;
	/**
	 * 表示客户端和服务器之间传输的指令数据
	 *
	 */
	public class Client implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Object user;//传输数据
		private String result;//返回结果
		private boolean flag;//操作是否成功
		private String cmd;//操作指令
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
