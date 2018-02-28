package com.sd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sd.dao.UserMapper;
/*
 * 娴嬭瘯dao灞傚伐浣�
 * 
 * 1.瀵煎叆springtest妯″潡
 * 2.浣跨敤@ContextConfiguration鎸囧畾spring閰嶇疆鏂囦欢鐨勪綅缃�
 * @RunWith鏄痡unit鎻愪緵鐨勬祴璇曪紝鎸囧畾鐢ㄥ摢涓潵杩涜娴嬭瘯
 * 3.浣跨敤@Autowired鏉ユ祴璇曟垜浠湪杩愯鐨勮繃绋嬩腑瑕佷娇鐢ㄧ殑缁勪欢
 * @Rollback
 * 琛ㄦ槑琚敞瑙ｆ柟娉曠殑浜嬪姟鍦ㄥ畬鎴愬悗鏄惁闇�瑕佽鍥炴粴銆� 濡傛灉true锛屼簨鍔″皢琚洖婊氾紝鍚﹀垯浜嬪姟灏嗚鎻愪氦銆�
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class test2 {
	@Autowired
	UserMapper userMapper;
	
	@Test
	@Rollback(false)
	public void testmapper() {
		System.out.println(userMapper);

		//userMapper.insert(new com.sd.bean.User("5555", "helo", 15, "985"));
	}

}
