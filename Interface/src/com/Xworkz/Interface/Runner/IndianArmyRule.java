package com.Xworkz.Interface.Runner;

import com.Xworz.Interrface.app.Armyrule.ArmyRule;

public class IndianArmyRule implements ArmyRule {

	@Override
public	void getBorder() {
		System.out.println("Border should be strict");
	}
	
	@Override
	public void getEnemies() {
		System.out.println("Enemies are shot on spot");
	}
}
