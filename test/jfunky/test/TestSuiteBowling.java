//    JFuncTest - Functional testig in Java
//    Copyright (C) 2010 G. Andrieu (subtenante gmail com)
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.
package jfunky.test;

import jfunky.BaseTestSuite;

public class TestSuiteBowling extends BaseTestSuite {

	@Override
	public void beforeSuite() {
		super.beforeSuite();
		System.out.println("Before Suite !");
	}
	
	@Override
	public void afterSuite() {
		super.afterSuite();
		System.out.println("After Suite !");
	}
	
	public static void main(String[] args) {
		
		TestSuiteBowling suite = new TestSuiteBowling();
		suite.addTest(TestBowling.class);
		suite.runTests();
	}
	
}
