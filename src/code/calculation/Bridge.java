package code.calculation;

import code.graphic.MainFrame;

public class Bridge {
	MainFrame frame;
	
	BulletManager bum;
	BombManager bom;
	EnemyManager em;
	LevelManager lm;
	
	public Bridge() {
		
	}
	
	public void init() {
		frame.init();
		bum.init();
		bom.init();
		em.init();
		lm.init();
	}

	public BulletManager getBum() {
		return bum;
	}

	public void setBum(BulletManager bum) {
		this.bum = bum;
	}

	public BombManager getBom() {
		return bom;
	}

	public void setBom(BombManager bom) {
		this.bom = bom;
	}

	public EnemyManager getEm() {
		return em;
	}

	public void setEm(EnemyManager em) {
		this.em = em;
	}

	public LevelManager getLm() {
		return lm;
	}

	public void setLm(LevelManager lm) {
		this.lm = lm;
	}
	
	public MainFrame getFrame() {
		return frame;
	}

	public void setFrame(MainFrame frame) {
		this.frame = frame;
	}

}
