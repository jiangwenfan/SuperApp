/*
 *这是一个身份认证的类，主要实现注册，登录等操作
 *@author:jason stark
 *@version:0.1
 */
public class Authentication{

	/*
 	* 传入注册信息的数组
 	*/
	public void registered(String[] info){
		//获取传入数组的信息
		String name = info[0];
		String passwd = info[1];
		//System.out.println(name+passwd);
		
		//向数据库中查询值
		
	}
	
	/*
 	*
 	*传入登录信息的数组
 	*/
	public void login(String[] info){
		//获取传入数组的信息
		String name = info[0];
		String passwd = info[1];
		System.out.println(name+passwd);
	}
}
