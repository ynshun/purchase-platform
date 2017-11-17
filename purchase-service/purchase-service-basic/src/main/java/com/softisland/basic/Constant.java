package com.softisland.basic;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.i18n.LocaleContextHolder;

/**
 * Created by Administrator on 2016/8/17.
 */
public class Constant {
	public static String COOKIE_DES_KEY = "SoftIsland";
	public static final String SITE_ADDRESS = "site_address";// 网站地址
	public static final String USER_SESSION = "client_user_info";// 用户session
	public static final String CURRENCY_SESSION = "Currency_Code";// 币种session
	public static final String AFFI_SESSION = "aiif_session";
	public static final String AFFI_USER_SESSION = "aiif_user_session";
	public static final String REFERER_SESSION = "referer_session";
	public static final String TASK_SWITCH_COMPLATED = "task_switch_complated";// 订单支付成功任务开关
	public static final String TASK_SWITCH_TIMINGDELIVERY = "task_switch_timingdelivery";// 自动发货任务开关
	public static final String IS_CHINA_IP = "is_china_ip";// 是否中国大陆IP地址 true 是
															// false 不是
	public static final String SHOPPING_CARTS = "shopping_carts";
	public static final String REPWD = "repwd";// 找回密码缓存区别用的
	public static final long REPWD_CODE_TIMEOUT = 180;// 缓存重置密码发送邮件的超时时间为3分钟

	public static final String CHARGE_ORDER_PREFIX = "CHARGE_";// 老版本订单号的前缀
	public static final String CHARGE_REWARD_ORDER_PREFIX = "REWARD_";// 老版本打赏功能订单号的前缀

	public static final String ORDER_PREFIX = "PURCHASE_";// 订单号的前缀
	public static final String REWARD_ORDER_PREFIX = "PURCHASE_REWARD_";// 打赏功能订单号的前缀

	public static final String DEFAULT_CURRENCY_CODE = "USD";// 默认币种

	public static final int TRUE = 1;
	public static final int FALSE = 0;

	public static final int recommendProduct = -1;// 推荐商品ID

	public static final String SITE_ID = "site_id";// 站点ID

	public static final String INDEX_MENU_LIMIT = "index_menu_limit";

	public static final int ACCOUNTTYPE = 1;

	public static final int NAMETYPE = 2;

	/** 操作类型 1：支出 2：充值 3：利息 4：返利 5:带认证金额 **/
	public static final int ACCOUNT_OPERATE_COST = 1;
	public static final int ACCOUNT_OPERATE_CHARGE = 2;
	public static final int ACCOUNT_OPERATE_INTEREST = 3;
	public static final int ACCOUNT_OPERATE_REBATE = 4;
	public static final int ACCOUNT_OPERATE_REBATE_AUTH = 5;

	public static String getCurrencyCode(HttpServletRequest request) {
		String currencyCode = (String) request.getSession().getAttribute(CURRENCY_SESSION);
		if (null == currencyCode)
			currencyCode = DEFAULT_CURRENCY_CODE;
		return currencyCode;
	}

	public static int getLoacl() {
		Locale locale = LocaleContextHolder.getLocale();
		String name = locale.getLanguage();
		if (name.equalsIgnoreCase("EN")) {
			return 1;
		} else if (name.equalsIgnoreCase("DE")) {
			return 2;
		} else if (name.equalsIgnoreCase("PT")) {
			return 3;
		} else if (name.equalsIgnoreCase("FR")) {
			return 4;
		} else if (name.equalsIgnoreCase("RU")) {
			return 5;
		} else if (name.equalsIgnoreCase("ES")) {
			return 6;
		}
		return 0;
	}

	/**
	 * 获取微信产品ID
	 * 
	 * @return
	 */
	public static Integer getWxPid() {
		return 0;
	}

	/**
	 * 获取支付宝产品ID
	 * 
	 * @return
	 */
	public static Integer getAlipayPid() {
		return 0;
	}

	/**
	 * 获取代购代付产品ID
	 * 
	 * @return
	 */
	public static Integer getDaigouPid() {
		return 0;
	}

	public static <T> T getProperty(String key, Class<T> type) {
		return null;
	}

}
