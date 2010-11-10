package org.sudr.train.pattern.template;

import java.util.Arrays;

import junit.framework.Assert;

import org.testng.annotations.Test;

@Test
public class TemplateTest {

	public void test() {
		Person[] persons = { new Person("xavier"), new Person("john"), new Person("mary") };
		
		Arrays.sort(persons);
		
		Assert.assertTrue("john".equals(persons[0].getName()));
		Assert.assertTrue("mary".equals(persons[1].getName()));
		Assert.assertTrue("xavier".equals(persons[2].getName()));
	}

}
