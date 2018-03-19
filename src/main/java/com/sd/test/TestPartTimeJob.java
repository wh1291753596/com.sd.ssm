package com.sd.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sd.bean.Parttimejob;
import com.sd.controller.parttimejob;
import com.sd.service.IparttimejobService;
import com.sd.service.imp.ParttimejobService;

public class TestPartTimeJob {

	@Test
	public void test() {
		IparttimejobService parttimejobService = new ParttimejobService();
		List<Parttimejob> parttimejobs = parttimejobService.select();
		
		System.out.println("count :"+ parttimejobs.size());
	}

}
