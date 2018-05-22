package com.vince;
/*
程序国际化
Internationalization:国际化程序可以这样理解：
同一套程序代码可以在各个语言环境下进行使用
各个语言环境下，只是语言显示的不同，那么具体的程序操作本身都是一样的，那么国际化程序完成的就是这样的一个功能
Locale类
locale类
locale对象表示了对特定地理 政治 文化地区。需要licale来执行其任务的操作称为语言环境敏感的操作，它使用Locale为用户量身定制信息。
例如，显示一个数值就是语言环境敏感的操作，应该根据用户的国家 地区 文化的风俗 传统来格式化该数值。
使用此类中的构造方法来创建Locale：
Locale(String language)
Locale(String language,String country)
通过静态方法创建Locale：
getDefault()

ResourceBundle类
国际化的实现核心在于显示的语言上，通常的做法是将定义成若干个属性文件（文件后缀是*.properties）,属性文件中的格式采用“key=value”的格式进行操作。
ResourceBundle类表示的是一个资源文件的读取操作，所有的资源文件需要使用ResourceBundle进行读取，读取的时候不需要加上文件的后缀。
getBundle(String baseName)
getBundle(String baseName,Locale locale)
getString(String key)
*/


public class hello{
	public static void main(String[] args){
		//创建一个本地语言环境对象，该对象会根据参数设置来自动选择与之相关的语言环境。
		//参数：语言，地区
		Locale locale_CN=new Locale("zh","CN");
		Locale locale_US=new Licale("en","US");
		//获取当前系统默认的语言环境
		Locale locale_default=Locale.getDefault();
	}
}
