package code;

import code.calculation.BombManager;
import code.calculation.Bridge;
import code.calculation.BulletManager;
import code.calculation.EnemyManager;
import code.calculation.LevelManager;
import code.graphic.MainFrame;

public class Main {

	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		
		MainFrame mf = new MainFrame(bridge);
		
		LevelManager lm = new LevelManager(bridge);
		EnemyManager em = new EnemyManager(bridge);
		BulletManager bum = new BulletManager(bridge);
		BombManager bom = new BombManager(bridge);
		
		bridge.setFrame(mf);
		bridge.setLm(lm);
		bridge.setEm(em);
		bridge.setBom(bom);
		bridge.setBum(bum);
		
		bridge.init();
		
	}

}
